-- Составить первый JOIN-запрос, чтобы получить информацию обо всех студентах
-- (достаточно получить только имя и возраст студента) школы Хогвартс вместе с названиями факультетов.
--
-- Составить второй JOIN-запрос, чтобы получить только тех студентов, у которых есть аватарки.

SELECT student.name, student.age, faculty.name
FROM student
    LEFT JOIN faculty ON student.faculty_id = faculty.id
        ORDER BY faculty.name;

SELECT student.name, student.age
    FROM student
         INNER JOIN avatar ON student.id = avatar.student_id;

SELECT student.name, student.age
FROM student
WHERE student.id in (SELECT student_id FROM avatar);