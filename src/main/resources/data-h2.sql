-- State
insert into STATE (ufId, name) VALUES
('AC', 'Acre'),
('AL', 'Alagoas'),
('AP', 'Amapa'),
('AM', 'Amazonas'),
('BA', 'Bahia'),
('CE', 'Ceara'),
('DF', 'Distrito Federal'),
('ES', 'Espirito Santo'),
('GO', 'Goias'),
('MA', 'Maranhao'),
('MT', 'Mato Grosso'),
('MS', 'Mato Grosso do Sul'),
('MG', 'Minas Gerais'),
('PA', 'Para'),
('PB', 'Paraiba'),
('PR', 'Parana'),
('PE', 'Pernambuco'),
('PI', 'Piaui'),
('RJ', 'Rio de Janeiro'),
('RN', 'Rio grande do Norte'),
('RS', 'Rio Grande do Sul'),
('RO', 'Rondonia'),
('RR', 'Roraima'),
('SC', 'Santa Catarina'),
('SE', 'Sergipe'),
('SP', 'Sao Paulo'),
('TO', 'Tocantins');

-- City
insert into CITY (cityId, name, state) VALUES
(1,	'Rio Branco',	'AC'),
(2,	'Maceió' ,		'AL'),
(3,	'Macapá' ,		'AP'),
(4,	'Manaus' ,		'AM'),
(5,	'Salvador',		'BA'),
(6,	'Fortaleza',	'CE'),
(7,	'Brasília' ,	'DF'),
(8,	'Vitória' ,		'ES'),
(9,	'Goiânia' ,		'GO'),
(10, 'São Luís' ,	'MA'),
(11, 'Cuiabá' ,		'MT'),
(12, 'Campo Grande','MS'),
(13, 'Belo Horizonte','MG'),
(14, 'Belém' ,		'PA'),
(15, 'João Pessoa',	'PB'),
(16, 'Curitiba' ,	'PR'),
(17, 'Recife' ,		'PE'),
(18, 'Teresina' ,	'PI'),
(19, 'Rio de Janeiro','RJ'),
(20, 'Natal' ,		'RN'),
(21, 'Porto Alegre','RS'),
(22, 'Porto Velho',	'RO'),
(23, 'Boa Vista',	'RR'),
(24, 'Florianópolis','SC'),
(25, 'São Paulo','SP'),
(26, 'Aracaju','SE'), 
(27, 'Palmas', 'TO'); 



-- Users 
insert into USER (userId, email, fullName, password, phoneNumber, city) VALUES
(1, 'fulano1@email.com', 'Fulano Silva', '', '(051)987654321', 1);

-- Admins


-- Cards
insert into CARD (cardId, edition, name, isFoil, isAltered) VALUES
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
(20, 'lorwyn', 'zumbi', TRUE, TRUE),

-- Trades