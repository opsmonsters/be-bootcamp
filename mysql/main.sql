-- show tables in a database
show tables;

-- show details about a table
desc posts;

-- select or read

-- select all
select * from `posts` ; 

-- select all but limit to a certain number
select * from `posts` limit 2;

-- selecting with condition
select * from `posts` where likes > 20; 

-- sorting
select * from `posts` order by likes desc;

select * from `posts` order by likes desc;

-- insert or create
INSERT INTO `posts`(`post_id`,`content`,`likes`) VALUES (7, "Creating content directly from sql", 20 );

-- update
UPDATE `posts` SET `content` = "Updated Content", `likes` = 500 WHERE `post_id` > 5;


-- delete
DELETE FROM `posts` WHERE post_id = 7;
