package com.xyram.bots.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.xyram.bots.api.Dao.EmployeeDao;
import com.xyram.bots.api.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee saveOrUpdate(Employee employee) {
		return employeeDao.saveOrUpdate(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	public List<Employee> getEmployeeByProperty(String propertyName, String value) {
		return employeeDao.getEmployeeByProperty(propertyName, value);
	}

	public List<Employee> getEmployeeFromHierarchy(String hierarchy) {
		return employeeDao.getEmployeeFromHierarchy(hierarchy);
	}

	@Override
	public List<Employee> getEmployeeFromLocation(String location) {
		return employeeDao.getEmployeeFromLocation(location);
	}

	@Override
	public List<Employee> getEmployeeFromBadge(String badge) {
		return employeeDao.getEmployeeFromBadge(badge);
	}

	@Override
	public int getEmployeeTimeoffByEmpId(String empId) {
		return employeeDao.getEmployeeTimeoffByEmpId(empId);
	}

	@Override
	public List<Employee> getEmployeeFromName(String name) {
		return employeeDao.getEmployeeFromName(name);
	}

	@Override
	public int getEmployeeLeaveByEmpId(String empId) {
		return employeeDao.getEmployeeLeaveByEmpId(empId);
	}
}
