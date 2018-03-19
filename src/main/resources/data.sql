-- #
-- # TABLE STRUCTURE FOR: house
-- #


INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (1, '7199 Schuppe Mountains\nPort Verdieside, NJ 80699', 2, 'pond');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (2, '358 Scottie Squares\nPort Chadrickville, FL 61732-7257', 1, 'nios');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (3, '61980 Howe Parkway Suite 597\nAntonioshire, ME 12187', 0, 'skxw');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (4, '0010 Victoria Corners Suite 217\nAldenton, MN 12825-0602', 1, 'vtzj');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (5, '35557 Schmeler Locks Suite 841\nWest Harley, AR 28825-9494', 0, 'jjly');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (6, '01991 Marlene Viaduct\nLake Immanuelfort, ND 11511-9856', 0, 'hlwa');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (7, '448 Maryse Common\nPort Savanah, AK 60386-8477', 0, 'ghfq');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (8, '94472 McDermott Tunnel Suite 859\nWest Bridgetfort, MT 03511-0561', 0, 'fraj');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (9, '1747 Sipes Drives\nManteland, NE 16491-9235', 0, 'qgqf');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (10, '051 Kilback Mill\nDavisview, NC 19359-3944', 2, 'nnve');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (11, '1721 Hettinger Mount Apt. 430\nPort Manleyhaven, AR 22060-8262', 0, 'bysv');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (12, '94989 Jacobson Port\nValentinview, TX 87672', 2, 'gbge');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (13, '114 Nicolas Throughway Apt. 534\nNew Mistybury, AZ 34194', 2, 'esmo');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (14, '018 Harris Brook Apt. 130\nEast Daisha, ID 14209-4669', 0, 'csnf');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (15, '67165 Laron Highway\nSouth Lela, LA 83000-8232', 0, 'rodu');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (16, '1027 Mertz River Apt. 777\nNorth Kara, CA 36306', 0, 'pbaa');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (17, '11651 Stokes Branch\nDejuanburgh, HI 00795-2624', 0, 'yhyu');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (18, '81814 Merle Overpass Apt. 106\nLake Rebekah, ID 04593', 1, 'lhyw');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (19, '374 Domingo Villages Apt. 299\nGrimesfurt, CO 89181', 1, 'ljuq');
INSERT INTO house (`id`, `address`, `house_type`, `zip_code`) VALUES (20, '24858 Trystan Ville\nCollierview, NM 11995', 0, 'xxfc');

-- #
-- # TABLE STRUCTURE FOR: person
-- #


INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (1, 47, 'Edward Metz', 17);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (2, 51, 'Kane Nitzsche DDS', 3);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (3, 64, 'Dr. Emiliano Thiel', 11);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (4, 74, 'Gabe Shields IV', 13);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (5, 64, 'Ms. Jany Schmeler Sr.', 12);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (6, 35, 'Tristian Hansen', 5);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (7, 54, 'Dejah Franecki', 3);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (8, 66, 'Nicole Mante MD', 13);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (9, 75, 'Margarett Greenholt', 14);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (10, 73, 'Jesus Jenkins V', 13);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (11, 53, 'Aubree Fahey', 15);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (12, 32, 'Miss Celia Strosin', 8);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (13, 76, 'Miss Robyn Grant DVM', 15);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (14, 62, 'Madelynn Reichert', 6);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (15, 63, 'Rodger Koepp', 16);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (16, 78, 'Mrs. Elda Sporer PhD', 11);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (17, 39, 'Joanny Cummings', 19);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (18, 32, 'Ella Bernhard', 20);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (19, 48, 'Dennis Kutch', 17);
INSERT INTO person (`id`, `age`, `name`, `house_id`) VALUES (20, 46, 'Teagan Welch', 2);


-- #
-- # TABLE STRUCTURE FOR: child
-- #

INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 1, 7, 'Maiya McCullough', 'ullam', 'enim', 12);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 2, 8, 'Dr. Garland Towne Jr.', 'sed', 'pariatur', 16);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 3, 3, 'Ms. Juanita Bernhard', 'et', 'non', 2);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 4, 7, 'Grayce Hettinger', 'sint', 'natus', 16);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 5, 6, 'Mohamed Marvin', 'iure', 'at', 18);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 6, 9, 'Nicolas Mann', 'enim', 'laudantium', 13);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 7, 2, 'Antoinette Schmeler', 'enim', 'sed', 1);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 8, 7, 'Dr. Isaac Shields PhD', 'eligendi', 'suscipit', 15);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 9, 2, 'Prof. Anna Stokes', 'nisi', 'in', 4);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 10, 7, 'Kadin Greenfelder PhD', 'et', 'mollitia', 16);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 11, 1, 'Miss Sister McCullough I', 'tempora', 'enim', 12);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 12, 7, 'Candace Stehr Sr.', 'eos', 'doloremque', 15);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 13, 7, 'Dr. Clement Braun', 'rerum', 'voluptatum', 2);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 14, 4, 'Karl Blanda', 'ipsam', 'mollitia', 6);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 15, 3, 'Delphine Rempel', 'doloribus', 'perspiciatis', 5);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 16, 2, 'Lorenz Stark', 'qui', 'fugiat', 6);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 17, 5, 'Mrs. Marlee Runolfsson IV', 'aut', 'assumenda', 2);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 18, 4, 'Dr. Fleta Hammes', 'et', 'debitis', 6);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 19, 9, 'Ida Barton', 'facere', 'animi', 16);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 20, 2, 'Louvenia Schmidt', 'repudiandae', 'autem', 6);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 21, 1, 'Wayne Orn', 'et', 'omnis', 10);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 22, 6, 'Mr. Jaeden Marks', 'voluptatem', 'id', 2);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 23, 5, 'Gabriella Orn', 'accusantium', 'hic', 17);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 24, 8, 'Alejandra Turner', 'est', 'soluta', 19);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 25, 3, 'Faye Paucek', 'aliquam', 'voluptatum', 2);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 26, 7, 'Abelardo Raynor', 'sapiente', 'reiciendis', 18);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 27, 9, 'Amber Kirlin', 'sequi', 'nemo', 17);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 28, 5, 'Dennis Anderson', 'dolorem', 'dolores', 19);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 29, 4, 'Ms. Heloise Dare', 'enim', 'velit', 5);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 30, 2, 'Ellie Schroeder', 'qui', 'odit', 3);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 31, 10, 'Sammy Howell', 'molestiae', 'facere', 14);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 32, 10, 'Claire Weber', 'quisquam', 'voluptas', 11);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 33, 2, 'Beth Conroy V', 'impedit', 'ipsum', 11);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 34, 6, 'Miss Agnes Denesik IV', 'dolorum', 'eveniet', 3);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 35, 8, 'Lucile Hahn', 'soluta', 'aut', 20);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 36, 8, 'Jarrett Braun', 'fuga', 'dicta', 11);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (2, 37, 5, 'Mark Veum', 'sequi', 'consequuntur', 20);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 38, 6, 'Chad Boyle', 'ipsam', 'enim', 19);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 39, 2, 'Joey Lubowitz', 'beatae', 'aut', 5);
INSERT INTO child (`child_type`, `id`, `age`, `name`, `bicycle_color`, `hair_color`, `parent_id`) VALUES (1, 40, 10, 'Prof. Arne OConner PhD', 'explicabo', 'expedita', 4);


-- #
-- # TABLE STRUCTURE FOR: meal
-- #


INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (1, '2010-11-20 12:22:44', 'illum', 5, 10);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (2, '1978-12-20 12:38:25', 'voluptas', 6, 14);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (3, '2008-09-03 09:00:46', 'sunt', 6, 18);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (4, '2008-09-10 08:53:45', 'nulla', 10, 36);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (5, '2006-09-07 08:55:54', 'sint', 1, 20);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (6, '2009-08-08 01:21:11', 'sunt', 8, 15);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (7, '2008-11-02 00:29:36', 'omnis', 1, 36);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (8, '2011-01-18 11:37:03', 'ipsum', 1, 1);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (9, '1979-01-16 12:49:32', 'quos', 5, 15);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (10, '1994-04-05 06:16:30', 'atque', 9, 5);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (11, '1978-09-06 11:44:12', 'nostrum', 10, 22);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (12, '2000-05-26 08:46:09', 'qui', 3, 33);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (13, '2004-01-18 01:29:48', 'labore', 3, 35);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (14, '2001-11-13 09:05:17', 'sequi', 2, 29);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (15, '1977-02-05 05:14:40', 'eligendi', 4, 4);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (16, '1996-12-23 14:54:29', 'voluptas', 8, 17);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (17, '1992-11-29 05:33:00', 'aut', 4, 13);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (18, '1988-12-08 08:37:46', 'in', 1, 23);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (19, '2000-09-15 05:27:21', 'neque', 1, 4);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (20, '1973-08-20 09:52:18', 'est', 3, 9);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (21, '1970-05-19 20:51:32', 'et', 8, 4);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (22, '2004-08-29 06:33:14', 'ut', 3, 12);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (23, '1983-03-06 13:49:39', 'ut', 1, 7);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (24, '1985-07-09 08:30:46', 'accusamus', 8, 23);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (25, '2009-04-24 04:28:42', 'et', 7, 38);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (26, '1999-07-28 12:31:59', 'tempora', 10, 15);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (27, '2005-07-20 05:18:50', 'quo', 2, 29);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (28, '1989-02-25 14:51:23', 'quam', 3, 1);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (29, '1988-04-06 11:58:41', 'quas', 2, 13);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (30, '1983-11-04 09:13:39', 'non', 8, 28);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (31, '1975-10-17 18:07:00', 'temporibus', 3, 25);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (32, '2000-02-20 23:53:55', 'id', 10, 23);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (33, '1980-11-02 05:24:09', 'minima', 10, 15);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (34, '1985-08-07 12:15:54', 'assumenda', 1, 36);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (35, '1983-09-06 11:24:29', 'quia', 5, 29);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (36, '2010-10-30 18:45:34', 'eligendi', 4, 2);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (37, '2002-01-14 14:57:12', 'nemo', 8, 23);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (38, '1998-02-26 08:23:49', 'rerum', 4, 27);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (39, '1995-01-14 00:56:41', 'tempore', 1, 9);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (40, '1997-06-29 16:04:35', 'fuga', 2, 3);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (41, '1982-03-11 23:28:37', 'sed', 9, 8);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (42, '1997-02-17 09:14:36', 'est', 9, 14);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (43, '2016-10-31 14:18:20', 'omnis', 1, 1);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (44, '2011-12-12 21:34:46', 'est', 7, 31);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (45, '2009-07-07 18:03:59', 'ullam', 10, 31);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (46, '1985-12-31 15:23:13', 'id', 7, 40);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (47, '2010-05-25 15:53:35', 'ullam', 10, 4);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (48, '1985-05-31 07:00:38', 'enim', 1, 12);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (49, '1988-03-13 09:13:10', 'quidem', 4, 3);
INSERT INTO meal (`id`, `invented`, `name`, `priority`, `child_id`) VALUES (50, '1998-03-28 23:00:26', 'amet', 4, 20);



