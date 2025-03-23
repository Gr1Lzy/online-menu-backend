--liquibase formatted sql

--changeset andrii.kolomoiets:02-create-users-table
CREATE TABLE IF NOT EXISTS public.users
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    username   VARCHAR(50)  NOT NULL UNIQUE,
    password   VARCHAR(200) NOT NULL,
    email      VARCHAR(50)  NOT NULL UNIQUE,
    role_id    BIGINT       NOT NULL REFERENCES public.roles (id),
    created_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_users_username ON users (username);
CREATE INDEX idx_users_email ON users (email);