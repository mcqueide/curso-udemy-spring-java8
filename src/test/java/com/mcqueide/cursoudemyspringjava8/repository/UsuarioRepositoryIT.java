package com.mcqueide.cursoudemyspringjava8.repository;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.mcqueide.cursoudemyspringjava8.modelo.Usuario;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioRepositoryIT {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Before
	public void setUp() {
		try {
			Files.lines(Paths.get(ClassLoader.getSystemResource("usuario_repository_it.sql").toURI()))
				.forEach(l -> {
					if (l.startsWith("INSERT INTO")) {
						System.out.println();
						entityManager.getEntityManager().createNativeQuery(l).executeUpdate();
					}
				});
		} catch (IOException | URISyntaxException e) {
			entityManager.getEntityManager().getTransaction().rollback();
		}
	}
	
	@After
	public void tearDown() {
		entityManager.getEntityManager().getTransaction().rollback();
	}
	
	@Test
	public void deveAcharUsuarioFulano() {
		Optional<Usuario> usuarioOptional = repository.findByLogin("fulano");
		
		boolean isPresent = usuarioOptional.isPresent();
		
		assertTrue(isPresent);
		usuarioOptional.ifPresent(u -> {
			assertEquals("Fulano", u.getPessoa().getNome());
			assertEquals("fulano", u.getLogin());
			assertEquals("ROLE_ADMIN", u.getPerfis().get(0).getNome());
		});
	}
}
