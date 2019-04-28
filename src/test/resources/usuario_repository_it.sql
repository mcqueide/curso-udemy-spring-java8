INSERT INTO perfil (id, nome) VALUES (1, 'ROLE_ADMIN');

INSERT INTO usuario (id, login, email, senha) VALUES (1, 'fulano', 'fulano@email.com', '123456');

INSERT INTO pessoa (id, nome, data_nascimento, usuario_id) VALUES (1, 'Fulano', '1970-01-01', 1);

INSERT INTO usuario_perfil (id, usuario_id, perfil_id) values (1, 1, 1);