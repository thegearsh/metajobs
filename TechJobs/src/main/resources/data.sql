INSERT INTO job (id, title) VALUES (1, 'Senior Dev Manager');
INSERT INTO candidate (id, first_name, last_name) VALUES (1, 'Tony', 'Stark');
INSERT INTO candidate (id, first_name, last_name) VALUES (2, 'Bruce', 'Banner');
INSERT INTO candidate (id, first_name, last_name) VALUES (3, 'Peter', 'Parker');
INSERT INTO application (application_date, candidate_id, job_id) VALUES (PARSEDATETIME('2022-06-17 16:52:11', 'yyyy-MM-dd HH:mm:ss'), 1, 1);
INSERT INTO application (application_date, candidate_id, job_id) VALUES (PARSEDATETIME('2022-06-17 16:57:23', 'yyyy-MM-dd HH:mm:ss'), 2, 1);