-- State
insert into STATE (id, uf, name) VALUES
(1, 'AC', 'Acre'),
(2, 'AL', 'Alagoas'),
(3, 'AP', 'Amapa'),
(4, 'AM', 'Amazonas'),
(5, 'BA', 'Bahia'),
(6, 'CE', 'Ceara'),
(7, 'DF', 'Distrito Federal'),
(8, 'ES', 'Espirito Santo'),
(9, 'GO', 'Goias'),
(10, 'MA', 'Maranhao'),
(11, 'MT', 'Mato Grosso'),
(12, 'MS', 'Mato Grosso do Sul'),
(13, 'MG', 'Minas Gerais'),
(14, 'PA', 'Para'),
(15, 'PB', 'Paraiba'),
(16, 'PR', 'Parana'),
(17, 'PE', 'Pernambuco'),
(18, 'PI', 'Piaui'),
(19, 'RJ', 'Rio de Janeiro'),
(20, 'RN', 'Rio grande do Norte'),
(21, 'RS', 'Rio Grande do Sul'),
(22, 'RO', 'Rondonia'),
(23, 'RR', 'Roraima'),
(24, 'SC', 'Santa Catarina'),
(25, 'SE', 'Sergipe'),
(26, 'SP', 'Sao Paulo'),
(27, 'TO', 'Tocantins');

-- City
insert into CITY (id, name, state_id) VALUES
(1,	'Rio Branco', 1),
(2,	'Maceió', 2),
(3,	'Macapá', 3),
(4,	'Manaus', 4),
(5,	'Salvador', 5),
(6,	'Fortaleza', 6),
(7,	'Brasília', 7),
(8,	'Vitória', 8),
(9,	'Goiânia', 9),
(10, 'São Luís', 10),
(11, 'Cuiabá', 11),
(12, 'Campo Grande', 12),
(13, 'Belo Horizonte', 13),
(14, 'Belém', 14),
(15, 'João Pessoa', 15),
(16, 'Curitiba', 16),
(17, 'Recife', 17),
(18, 'Teresina', 18),
(19, 'Rio de Janeiro', 18),
(20, 'Natal', 20),
(21, 'Porto Alegre', 21),
(22, 'Porto Velho', 22),
(23, 'Boa Vista', 23),
(24, 'Florianópolis', 24),
(25, 'São Paulo', 25),
(26, 'Aracaju', 26), 
(27, 'Palmas', 27); 

-- Cards
insert into CARD (id, edition, name, is_foil, is_altered) VALUES
(1, 'lorwyn', 'goblin', FALSE, FALSE),
(2, 'lorwyn', 'goblin', TRUE, FALSE),
(3, 'lorwyn', 'goblin', FALSE, TRUE),
(4, 'lorwyn', 'goblin', TRUE, TRUE),
(5, 'lorwyn', 'elfo', FALSE, FALSE),
(6, 'lorwyn', 'elfo', TRUE, FALSE),
(7, 'lorwyn', 'elfo', FALSE, TRUE),
(8, 'lorwyn', 'elfo', TRUE, TRUE),
(9, 'lorwyn', 'soldado', FALSE, FALSE),
(10, 'lorwyn', 'soldado', TRUE, FALSE),
(11, 'lorwyn', 'soldado', FALSE, TRUE),
(12, 'lorwyn', 'soldado', TRUE, TRUE),
(13, 'lorwyn', 'tritao', FALSE, FALSE),
(14, 'lorwyn', 'tritao', TRUE, FALSE),
(15, 'lorwyn', 'tritao', FALSE, TRUE),
(16, 'lorwyn', 'zumbi', TRUE, TRUE),
(17, 'lorwyn', 'zumbi', FALSE, FALSE),
(18, 'lorwyn', 'zumbi', TRUE, FALSE),
(19, 'lorwyn', 'zumbi', FALSE, TRUE),
(20, 'lorwyn', 'zumbi', TRUE, TRUE);

-- USER
insert into USER( id, email, full_name, password, phone, city_id, active) values
( 1, 'admin1@email.com', 'Fulano Silva', '$2a$06$W9tq/CrGEw9gxktWSuFGIuBxqxH7nRZELAjTZ3IaJeI3s.35X9H86 ', '(051)9876-54321', 21, TRUE),
( 2, 'user1@email.com', 'Beltrano Silva', '$2a$10$Qji2/icFWIGGQEAv8bbwNuKGrSZyiUUPqE/0SNO2M.BpU.NA6xPhW', '(011)9123-45678', 25, TRUE),
( 3, 'user2@email.com', 'Tucano Silva', '$2a$06$W9tq/CrGEw9gxktWSuFGIuBxqxH7nRZELAjTZ3IaJeI3s.35X9H86 ', '(011)9122-45678', 18, TRUE);

-- ROLE
insert into ROLE(id, role) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- PAPEL_USUARIO
insert into ROLE_USER(user_id,role_id)VALUES
(1,1),
(3,1),
(2,2);

-- haveList
insert into HAVE_LIST(user_id, card_id)VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(2,5),
(1,6),
(2,6),
(2,7);

-- wantList
insert into WANT_LIST(user_id, card_id)VALUES
(2,1),
(2,2),
(2,3),
(2,20),
(1,15),
(1,12),
(1,8),
(1,19);
