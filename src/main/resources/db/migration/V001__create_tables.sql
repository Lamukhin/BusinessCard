CREATE TABLE IF NOT EXISTS common_info
(
    id               UUID PRIMARY KEY,
    name             VARCHAR(200),
    photo            VARCHAR(500),
    date_of_birth    DATE,
    phone_number     VARCHAR(50),
    email            VARCHAR(100),
    short_about      VARCHAR(2048)
);

CREATE TABLE IF NOT EXISTS full_contacts
(
    id               UUID PRIMARY KEY,
    name_of_network  VARCHAR(100),
    link             VARCHAR(100),
    contact          VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS experience
(
    id               UUID PRIMARY KEY,
    company_name     VARCHAR(100),
    work_period      VARCHAR(50),
    job_duties       VARCHAR(2048),
    achievements     VARCHAR(2048)
);

CREATE TABLE IF NOT EXISTS hobby
(
    id               UUID PRIMARY KEY,
    name             VARCHAR(100),
    description      VARCHAR(2048)
);

CREATE TABLE IF NOT EXISTS education
(
    id               UUID PRIMARY KEY,
    name             VARCHAR(100),
    type             VARCHAR(20),
    link             VARCHAR(100),
    study_period     VARCHAR(50)
);