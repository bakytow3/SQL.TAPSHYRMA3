//        TAPSHYRMA 1
//        SELECT *FROM CITY
//        WHERE POPULATION > 100000 AND COUNTRYCODE = "USA";

//        TAPSHYRMA 2
//        SELECT NAME FROM CITY
//        WHERE COUNTRYCODE = 'USA' AND POPULATION > 120000;

//        TAPSHYRMA 3
//        select * from CITY;

//        TAPSHYRMA 4
//        select * from CITY
//        where ID=1661;

//        TAPSHYRMA 5
//        SELECT * FROM CITY
//        WHERE COUNTRYCODE = 'JPN';

//        TAPSHYRMA 6
//        SELECT NAME FROM CITY
//        WHERE COUNTRYCODE='JPN';

//        TAPSHYRMA 7
//        SELECT CITY,STATE FROM STATION;

//        TAPSHYRMA 8

//        SELECT DISTINCT CITY FROM STATION
//        WHERE MOD(ID,2)=0
//        ORDER BY CITY ASC;

//        TAPSHYRMA 9
//        SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;

//        TAPSHYRMA 10
//        SELECT ROUND(SUM(LAT_N), 2), ROUND(SUM(LONG_W), 2)
//        FROM STATION;

//        TAPSHYRMA 11
//        select CITY,LENGTH(CITY) from STATION order by Length(CITY) asc, CITY limit 1;
//        select CITY,LENGTH(CITY) from STATION order by Length(CITY) desc, CITY limit 1

//        TAPSHYRMA 12
//        SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY,1,1)) NOT IN ('a','e','i','o','u') AND LOWER(SUBSTR(CITY,LENGTH(CITY),1)) NOT IN ('a','e','i','o','u');


//        TAPSHYRMA 13
//SELECT NAME FROM STUDENTS WHERE MARKS > 75 ORDER BY SUBSTR(NAME, LENGTH(NAME)-2, 3), ID;

//        TAPSHYRMA 14
//SELECT name FROM Employee ORDER BY name;


//        TAPSHYRMA 15
//SELECT name FROM Employee WHERE salary > 2000 AND months < 10 ORDER BY employee_id;


//        TAPSHYRMA 16
//SELECT name FROM Employee WHERE salary > 2000 AND months < 10 ORDER BY employee_id;

//        TAPSHYRMA 17
//SELECT CONCAT(NAME,'(',SUBSTR(OCCUPATION,1,1),')')
//        FROM OCCUPATIONS
//        ORDER BY NAME;
//        SELECT CONCAT('There are a total of ',COUNT(OCCUPATION),' ',LOWER(OCCUPATION),'s.')
//        FROM OCCUPATIONS
//        GROUP BY OCCUPATION
//        ORDER BY COUNT(OCCUPATION),OCCUPATION;

//        TAPSHYRMA 18
//SELECT COUNT(POPULATION)
//        FROM CITY
//        WHERE POPULATION > 100000;


//        TAPSHYRMA 19
//SELECT SUM(POPULATION)
//        FROM CITY
//        WHERE DISTRICT = "California";

//        TAPSHYRMA 20
//SELECT AVG(population)
//        FROM city
//        WHERE district = "California"

//        TAPSHYRMA 21
//SELECT ROUND(AVG(Population)) AS AvgPopulation
//         FROM City ;

//        TAPSHYRMA 22
//SELECT SUM(POPULATION) FROM CITY WHERE COUNTRYCODE='JPN';

//        TAPSHYRMA 23
//SELECT CAST(CEIL(avg(Salary) - avg(CAST(REPLACE(Salary, '0', '')AS FLOAT)))AS FLOAT) AS Difference FROM Employees

//        TAPSHYRMA 24
//select truncate(sum(lat_n),4) from station where lat_n between 38.7880 and 137.2345;

//        TAPSHYRMA 25
//SELECT ROUND(MAX(LAT_N),4) FROM STATION WHERE LAT_N < 137.2345;

//        TAPSHYRMA 26
//SELECT ROUND(LONG_W,4)
//        FROM STATION
//        WHERE LAT_N = (SELECT MAX(LAT_N) FROM STATION WHERE LAT_N < 137.2345);

//        TAPSHYRMA 27
//SELECT ROUND(MIN(LAT_N),4)
//        FROM STATION
//        WHERE LAT_N > 38.7780;

//        TAPSHYRMA 28
//SELECT ROUND((MAX(LAT_N) - MIN(LAT_N) + MAX(LONG_W) - MIN(LONG_W)), 4) AS D
//        FROM STATION

//        TAPSHYRMA 29
//SELECT ROUND((MAX(LAT_N) - MIN(LAT_N) + MAX(LONG_W) - MIN(LONG_W)), 4) AS D
//        FROM STATION

//        TAPSHYRMA 30
//select round(sqrt(power(max(LAT_N) - min(LAT_N), 2) + power(max(LONG_W) - min(LONG_W), 2)), 4)
//        FROM STATION;


//        TAPSHYRMA 31
//SET @rowIndex := -1;
//        SELECT ROUND(AVG(t.LAT_N),4) FROM
//        (SELECT @rowIndex:= @rowIndex+1 AS rowIndex, s.LAT_N from STATION AS s ORDER BY s.LAT_N) AS t
//        where t.rowIndex in (floor(@rowIndex/2), ceil(@rowIndex/2));

//        TAPSHYRMA 32
//SELECT
//        CASE WHEN grd.grade < 8 THEN NULL
//        WHEN grd.grade >= 8 THEN std.name END,
//        grd.grade, std.marks FROM students std, grades grd
//        WHERE std.marks BETWEEN grd.min_mark AND grd.max_mark
//        ORDER BY grd.grade DESC, std.name ASC;

//        TAPSHYRMA 33
//select h.hacker_id, h.name from Submissions as s join Hackers as h
//        on s.hacker_id = h.hacker_id
//        join Challenges as c on s.challenge_id = c.challenge_id
//        join Difficulty as d on c.Difficulty_level = d.Difficulty_level
//        where s.score = d.score
//        group by h.hacker_id, h.name
//        having count(*) > 1
//        order by count(*) desc, h.hacker_id;

//        TAPSHYRMA 34
//select months*salary, count(*) from employee
//        group by months*salary
//        order by months*salary desc
//        limit 1;

//        TAPSHYRMA 35
//SELECT Country.Continent, FLOOR(AVG(City.Population))
//        FROM Country, City
//        WHERE Country.Code = City.CountryCode
//        GROUP BY Country.Continent ;