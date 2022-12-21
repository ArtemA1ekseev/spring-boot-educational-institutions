-- Описание структуры: у каждого человека есть машина. Причем несколько человек могут пользоваться одной машиной.
--     У каждого человека есть имя, возраст и признак того, что у него есть права (или их нет).
--     У каждой машины есть марка, модель и стоимость. Также не забудьте добавить таблицам первичные ключи и связать их.

CREATE TABLE human (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INTEGER NOT NULL CHECK (age > 0),
    driver_license BOOLEAN,
    car_id INTEGER CHECK (driver_license = true),
    FOREIGN KEY (car_id) REFERENCES car (id)


);

CREATE TABLE car (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    brand VARCHAR(100) NOT NULL,
    model VARCHAR(100) NOT NULL,
    prise NUMERIC(10, 2) NOT NULL CHECK (prise > 0)
);