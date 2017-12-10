package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        for (Employee ee : employees) {
            employeeMap.put(ee.id, ee);
        }
        int totalImpotance = 0;
        LinkedList<Employee> toVisit = new LinkedList<Employee>();
        toVisit.add(employeeMap.get(id));
        while (!toVisit.isEmpty()) {
            Employee curEmployee = toVisit.pop();
            totalImpotance += curEmployee.importance;
            for (Integer subId : curEmployee.subordinates) {
                toVisit.add(employeeMap.get(subId));
            }
        }

        return totalImpotance;
    }
}
