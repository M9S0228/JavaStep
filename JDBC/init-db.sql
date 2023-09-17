
CREATE TABLE notice(

    id          SERIAL PRIMARY KEY,
    message     varchar(255),
    type        varchar(255),
    processed   BOOLEAN
)