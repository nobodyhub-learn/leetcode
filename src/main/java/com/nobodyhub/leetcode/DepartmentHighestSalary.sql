# Write your MySQL query statement below

SELECT
  dept.NAME AS Department,
  ee.NAME   AS Employee,
  ee.SALARY AS Salary
FROM
  Department dept
  LEFT JOIN Employee ee ON dept.ID = ee.departmentId
WHERE (ee.DepartmentId, SALARY) IN (
  SELECT
    DepartmentId,
    MAX(Salary)
  FROM Employee
  GROUP BY DepartmentId
)
ORDER BY 1, 2
