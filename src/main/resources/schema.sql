CREATE TABLE user_table (
  user_id SERIAL primary key,
  first_name VARCHAR not null,
  last_name VARCHAR not null
);

create table login_table (
 user_name VARCHAR primary key,
 password VARCHAR not null,
 user_id INT4, 
  FOREIGN KEY (user_id)
      REFERENCES user_table (user_id));

CREATE TABLE level_table (
  level_id SERIAL primary key,
  description VARCHAR not null
);

CREATE TABLE author_table (
  author_id SERIAL primary key,
  author_first_name VARCHAR not null,
  author_last_name VARCHAR
);

create table inc_story_table (
  inc_story_id SERIAL primary key,
  inc_story_text VARCHAR not null,
  story_level INT4,
  inc_story_author INT4,
  inc_story_title VARCHAR, 
  FOREIGN KEY (story_level)
    REFERENCES level_table (level_id),
  FOREIGN KEY (inc_story_author)
    REFERENCES author_table (author_id)
);

create table com_story_table (
  com_story_id SERIAL primary key,
  parent_story_id INT4,
  user_id INT4,
  com_story VARCHAR not null,
  upvote_count INT4,
  FOREIGN KEY (parent_story_id)
    REFERENCES inc_story_table (inc_story_id),
  FOREIGN KEY (user_id)
    REFERENCES user_table (user_id)
);
