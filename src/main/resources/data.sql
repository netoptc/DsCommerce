INSERT INTO USERS(name, email, phone, birth_date, password) VALUES ('João Queiroz de Almeida Neto', 'joao.neto@3up.tech', '34988565770', '2000-01-22', '123456');
INSERT INTO USERS(name, email, phone, birth_date, password) VALUES ('Camila Chagas Rodrigues', 'camila.rodrigues@3up.tech', '34988880825', '2001-06-01', '123456');

INSERT INTO CATEGORIES(name) VALUES('Categoria 1');
INSERT INTO CATEGORIES(name) VALUES('Categoria 2');

INSERT INTO PRODUCTS(name, description, price, img_url) VALUES('Teclado', 'Teclado description', 20.00, 'teclado.png');
INSERT INTO PRODUCTS(name, description, price, img_url) VALUES('Mouse', 'Teclado description', 20.00, 'teclado.png');

INSERT INTO PRODUCTS_CATEGORIES(product_id, category_id) VALUES(1, 1);
INSERT INTO PRODUCTS_CATEGORIES(product_id, category_id) VALUES(2, 2);

INSERT INTO ORDERS(status, client_id, moment) VALUES('0', 1, '2026-02-20T13:57:24Z');
INSERT INTO ORDERS(status, client_id, moment) VALUES('0', 2, '2026-02-20T15:57:24Z');

INSERT INTO PAYMENTS(order_id, moment) VALUES(1, '2026-02-20T13:57:24Z');
INSERT INTO PAYMENTS(order_id, moment) VALUES(2, '2026-02-20T15:57:24Z');

INSERT INTO ORDERS_ITEMS(product_id, order_id, quantity, price) VALUES(1, 1, 1, 20.00);
INSERT INTO ORDERS_ITEMS(product_id, order_id, quantity, price) VALUES(2, 2, 1, 20.00);
