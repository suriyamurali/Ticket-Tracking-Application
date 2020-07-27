START TRANSACTION;

DROP TABLE IF EXISTS user_details;
 
CREATE TABLE user_details (
    user_id Bigserial PRIMARY KEY NOT NULL,
    user_name varchar(100) NOT NULL,
    support_level int,
    role_id int,
    status varchar(10),
    CONSTRAINT fk_user_role
    FOREIGN KEY (role_id)
    REFERENCES user_roles(role_id)
);

COMMIT;