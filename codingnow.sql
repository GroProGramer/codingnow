USE codingnow;
CREATE TABLE tb_user 
(
  user_id INT(10) UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
  user_level INT UNSIGNED NOT NULL DEFAULT 1,
  user_name VARCHAR(50) NOT NULL,
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PASSWORD VARCHAR(50) NOT NULL,
  PRIMARY KEY (user_id)
   
);

INSERT INTO tb_user(user_level,user_name,PASSWORD) VALUES(0,"wangyijie","123456");
ALTER TABLE tb_user MODIFY user_level INT UNSIGNED NOT NULL DEFAULT 1;
ALTER TABLE tb_user MODIFY create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ;
ALTER TABLE tb_user ADD PASSWORD VARCHAR(50) NOT NULL;
DROP TABLE tb_user;



CREATE TABLE tb_category
(
  category_id INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
  des VARCHAR(50) NOT NULL 
);

ALTER TABLE tb_category DROP id;
ALTER TABLE tb_category ADD category_id INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT;
ALTER TABLE tb_category MODIFY des VARCHAR(50) NOT NULL DEFAULT 'no category';


CREATE TABLE tb_article(
   article_id INT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
   title VARCHAR(50) NOT NULL,
   create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   content VARCHAR(100) NOT NULL ,
   category_id INT UNSIGNED NOT NULL
  
);

 ADD CONSTRAINT fk_category_id  FOREIGN KEY(category_id) REFERENCES tb_category(category_id);



































































