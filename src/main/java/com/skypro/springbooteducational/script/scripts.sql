SELECT *
FROM student;

-- 1. Получить всех студентов, возраст которых находится между 10 и 20 (можно подставить любые числа, главное, чтобы нижняя граница была меньше верхней).
SELECT *
FROM student
WHERE age > 10 AND age < 20;

-- 2. Получить всех студентов, но отобразить только список их имен.
SELECT student.name
FROM student;

-- 3. Получить всех студентов, у которых в имени присутствует буква «О» (или любая другая).
SELECT *
FROM student
WHERE name LIKE '%ng%';

-- 4. Получить всех студентов, у которых возраст меньше идентификатора.
SELECT *
FROM student
WHERE age < student.id;

-- 5. Получить всех студентов упорядоченных по возрасту.
SELECT *
FROM student
ORDER BY age;

SELECT f.name, f.color, s.name
FROM student AS s,
     faculty AS f
WHERE s.faculty_id = f.id
  AND f.id = 7;