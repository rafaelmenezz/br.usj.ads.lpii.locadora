
insert into cliente(id, nome, cpf, endereco, telefone) values 
(1, 'Rafael', '12345678911', 'Rua São Sebastião', '48 99533 8798'),
(2, 'Beatriz', '98765432111', 'Rua Madri', '48 99845 9999'),
(3, 'Cristiano Ronaldo', '36985214777', 'Rua Juventus', '48 98425 3636'),
(4, 'Leonel Messi', '14785236999' ,'Rua Barcelona', '48 98536 1111'),
(5, 'Neymar Junior','15935748622' ,'Rua Paris', '48 98563 2121'),
(6, 'Megan Fox','32145698777' ,'Rua Transformes', '48 96857 3232'),
(7, 'Rihanna', '25896314777','Bem que eu queria saber',  '49 29874 3333'),
(8, 'Chaves', '12547896333','SBT', '48 76691 2121'),
(9, 'Marta Vieira da Silva', '36521498777', 'Rua Alagoas', '48 95621 3333'),
(10, 'De Arrascaeta', '654123879777','Rua Libertadores',  '48 96369 2121');

insert into filme(id, titulo, ano_lancamento, genero) values
(1, 'Esqueceram de mim', '1991','Comédia'), 
(2, 'Transforme alguma coisa', '2009', 'Ação'),
(3, 'Os Segredos de Alguém', '2016', 'Mistério'),
(4, 'Quem nunca', '2018', 'Romance'),
(5, 'Cara estou muito cansado', '2019', 'Drama'),
(6, 'Não quero mais inventar nome de filme', '2020', 'Drama'),
(7, 'Esse é o último', '2018', 'Drama');

insert into locacao(id, data_aluguel, data_entrega, cliente_id) values
(1, now(), null, 1),
(2, now(), null, 2);

insert into locacao_filmes(locacao_id, filmes_id) values
(1, 5),
(1, 6),
(2, 1);