
INSERT INTO `users` (`id`, `first_name`, `last_name`, `age`, `email`, `password`)
VALUES
(1, 'ADMIN', 'ADMINOV', 44,'admin@gmail.com','$2a$12$BvOLkxO6Duj4Y6GRdn8W8uil8LS9VpTCbglbAIPfZmSQaDyeoHRIu'),
(2, 'USER','USEROV',  22,'user@gmail.com','$2a$12$iS03UVfnlZHVdLpwd3tLfeJfNFIVACS8Wncjh3l5kjGZ4KePIW23.');

INSERT INTO `roles` (`id`, `role`)
VALUES
(1,'ROLE_ADMIN'),
(2,'ROLE_USER');

insert into users_roles
values
(1, 1),
(1, 2),
(2, 2);