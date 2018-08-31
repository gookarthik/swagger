package com.xyram.bots.api.service;

import java.util.List;
import com.xyram.bots.api.model.Employee;

public interface EmployeeService {
	
	Employee saveOrUpdate(Employee employee);

	List<Employee> getAllEmployee();

	List<Employee> getEmployeeByProperty(String propertyName, String value);

	List<Employee> getEmployeeFromHierarchy(String hierarchy);

	List<Employee> getEmployeeFromLocation(String location);
	
	List<Employee> getEmployeeFromBadge(String badge);

	int getEmployeeTimeoffByEmpId(String empId);

	List<Employee> getEmployeeFromName(String name);

	int getEmployeeLeaveByEmpId(String empId);
}
