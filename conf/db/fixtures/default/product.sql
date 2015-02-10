# --- !Ups

INSERT INTO product (ean, name, description) VALUES (5010255079763, 'Paperclips Large', 'Large Plain Pack of 1000');
INSERT INTO product (ean, name, description) VALUES (5018206244666, 'Giant Paperclips', 'Giant Plain 51mm 100 pack');
INSERT INTO product (ean, name, description) VALUES (5018306332812, 'Paperclip Giant Plain', 'Giant Plain Pack of 10000');
INSERT INTO product (ean, name, description) VALUES (5018306312913, 'No Tear Paper Clip', 'No Tear Extra Large Pack of 1000');
INSERT INTO product (ean, name, description) VALUES (5018206244611, 'Zebra Paperclips', 'Zebra Length 28mm Assorted 150 Pack');

# --- !Downs
DELETE FROM product;
