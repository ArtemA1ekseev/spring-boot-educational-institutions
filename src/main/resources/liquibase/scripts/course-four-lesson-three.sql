-- liquibase formatted sql

-- changeset aalekseev:1
CREATE INDEX student_name_index ON student (name);

-- changeset aalekseev:2
CREATE INDEX faculty_nc_index ON faculty (name, color);
