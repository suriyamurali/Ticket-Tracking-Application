START TRANSACTION;

DROP TABLE IF EXISTS user_roles;
 
CREATE TABLE user_roles (
    role_id Bigserial PRIMARY KEY NOT NULL,
    role_name varchar(100) NOT NULL,
	role_description varchar(150),
	status varchar(10)
);

COMMIT;