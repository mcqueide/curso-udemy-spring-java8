INSERT INTO perfil (id, nome) VALUES (1, 'ROLE_ADMIN');
INSERT INTO perfil (id, nome) VALUES (2, 'ROLE_USER');

INSERT INTO pessoa (id, nome, data_nascimento) VALUES (1, 'Pedro Álvares Cabral', '1467-01-01');
INSERT INTO pessoa (id, nome, data_nascimento) VALUES (2, 'Cristovão Colombo', '1451-01-01');

insert into telefone values (1, '61942356987', 1);
insert into telefone values (2, '61942356987', 1);
insert into telefone values (3, '61942356987', 2);

INSERT INTO usuario (id, login, email, senha) VALUES (1, 'cabral', 'cabral@email.com', '123456');
INSERT INTO usuario (id, login, email, senha) VALUES (2, 'colombo', 'colombo@email.com', '123456');

UPDATE pessoa SET usuario_id=1 WHERE id=1;
UPDATE pessoa SET usuario_id=2 WHERE id=2;

INSERT INTO usuario_perfil (id, usuario_id, perfil_id) values (1, 1, 1);
INSERT INTO usuario_perfil (id, usuario_id, perfil_id) values (2, 2, 2);