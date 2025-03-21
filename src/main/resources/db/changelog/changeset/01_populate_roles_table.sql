--liquibase formatted sql

--changeset andrii.kolomoiets:01-populate-roles-table
INSERT INTO public.roles (name)
VALUES ('ADMIN'),
       ('USER');
