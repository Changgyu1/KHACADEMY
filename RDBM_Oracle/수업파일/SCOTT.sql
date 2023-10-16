/*
--모든 부서 정보 조회 (DEPARTMENT)
SELECT * FROM department;
--모든 사원 정보 조회 (EMPLOYEE)
SELECT * FROM EMPLOYEE;
--모든 급여 등급 조회 (SALGRADE)
SELECT * FROM SALGRADE;
--특정 부서의 모든 사원 정보 조회 (예 : 부서번호 20)
SELECT * FROM EMPLOYEE WHERE DNO = 20;
--특정 급여 등급에 속하는 사원 정보 조회 (예; 급여 등급 3에 속한 사원)
SELECT * FROM EMPLOYEE WHERE SALARY BETWEEN 
(SELECT LOSAL FROM SALGRADE WHERE GRADE = 3)
AND (SELECT HISAL FROM SALGRADE WHERE GRADE = 3);
*/

--사원 정보 수정 (예: 사원 번호 7369의 급여를 1000으로 급여 업데이트)
-- 업데이트 테이블 업데이트할내용       컬럼  = 수정할내용 어디서 컬럼 = 수정해야할 부분;
UPDATE EMPLOYEE SET SALARY = 1000 WHERE ENO = 7369;

--사원번호가 7369 인 사원의 급여를 2000으로 업데이트
UPDATE EMPLOYEE SET SALARY = 2000 WHERE ENO = 7369;

--부서번호가 10인 사람들의 급여를 3000으로 업데이트
UPDATE EMPLOYEE SET SALARY = 3000 WHERE DNO = 10;

--특정부서의 모든 사원의 직무 업데이트 (예: 부서 번호 30에 속한 모든 사원의 직무를 'manager'
UPDATE EMPLOYEE SET JOB = 'MANAGER' WHERE DNO = 30;

--특정 사원의 상사 업데이트(예: 사원번호 7499의 상사를 사원번호 7566으로 변경)
UPDATE EMPLOYEE SET manager = 7566 WHERE ENO = 7499;

--특정 부서의 모든 사원의 급여 인상 (부서번호 20에 속한 모든 사원의 급여를 10%인상 (*1.10))
UPDATE EMPLOYEE SET SALARY = (SALARY*1.10) WHERE DNO = 20;

--특정 사원의 급여와 수수료 업데이트 ( 사원번호 7788 급여(SALARY)를 3500원 수수료(COMMISSION) 500변경)
UPDATE EMPLOYEE SET SALARY = 3500,COMMISSION = 500 WHERE ENO = 7788;

--특정 사원의 고용일자 변경 (예: 사원 번호 7521의 고용일자를 '2022-01-15'로 변경):
UPDATE EMPLOYEE SET HIREDATE = TO_DATE('2022-01-15','YYYY-MM-DD') WHERE ENO = 7521;
--특정 급여 등급의 최소 급여 변경 (예: 급여 등급 1의 최소 급여를 700에서 750으로 변경):
UPDATE SALGRADE SET LOSAL = 750 WHERE GRADE = 1;
--SALGRADE 테이블 활용

--특정 부서의 사원들을 다른 부서로 이동 (예: 부서 번호 40에 속한 모든 사원을 부서 번호 10으로 이동)
INSERT INTO "EMPLOYEE"(ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY,  DNO)
VALUES (7777, 'PARK', 'CLERK', 7839, TO_DATE('2023-10-06','YYYY-MM-DD'), 5000, 40);
UPDATE EMPLOYEE SET DNO = 10 WHERE DNO = 40;

--특정 급여 등급 삭제 (예: 급여 등급 5 삭제):
DELETE FROM salgrade WHERE GRADE = 5;

--특정 부서에 속한 사원의 모든 정보 삭제 (예: 부서 번호 30에 속한 모든 사원 삭제):
DELETE FROM EMPLOYEE WHERE DNO = 30;

--새로운 사원을 EMPLOYEE 테이블에 추가하는 SQL문:
INSERT INTO "EMPLOYEE" (ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, DNO)
VALUES (1577, 'YUM', 'MANAGER', 7499, TO_DATE('1080-05-25','YYYY-MM-DD'), 8000, 40);
INSERT INTO "EMPLOYEE" (ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, DNO)
VALUES (1567, 'AYUM', 'SMITH', 7499, TO_DATE('1380-05-13','YYYY-MM-DD'), 5000, 20);
INSERT INTO "EMPLOYEE" (ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, DNO)
VALUES (1857, 'YUMA', 'SMITH', 7299, TO_DATE('1200-07-25','YYYY-MM-DD'), 6000, 10);

--SMITH의 사원정보 찾기
SELECT * FROM EMPLOYEE
WHERE ename = 'SMITH';

--모든 사원의 이름과 급여를 선택하는 SQL문:
SELECT ENAME,SALARY FROM EMPLOYEE;

--EMPLOYEE 테이블에서 부서 번호가 10이고 직무가 'ANALYST'인 사원들의 평균 급여를 선택
--SELECT에서 AVG(SALARY)사용
UPDATE EMPLOYEE SET SALARY = 2500 WHERE ENO = 7788;

SELECT AVG(SALARY) FROM EMPLOYEE
WHERE DNO = 20 AND JOB = 'ANALYST';

--EMPLOYEE 테이블에서 급여가 1500에서 2500 사이인 사원들의 이름과 급여를 선택
//SELECT ENAME, SALARY FROM EMPLOYEE WHERE BETWEEN 1500 AND 2500;
SELECT ENAME,JOB FROM EMPLOYEE
WHERE SALARY >= 1500 AND SALARY <= 2500;


--EMPLOYEE 테이블에서 관리자가 없는 사원의 이름을 선택
--WHERE 에서 IS NULL사용
SELECT ENAME FROM EMPLOYEE WHERE MANAGER IS NULL;
