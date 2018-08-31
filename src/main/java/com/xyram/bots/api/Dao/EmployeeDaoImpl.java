package com.xyram.bots.api.Dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.xyram.bots.api.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	public Employee saveOrUpdate(Employee employee) {
		getSession().saveOrUpdate(employee);
		return employee;
	}

	public List<Employee> getAllEmployee() {
		return getSession().createCriteria(Employee.class).list();
	}

	public List<Employee> getEmployeeByProperty(String propertyName, String value) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq(propertyName, value).ignoreCase());
		List<Employee> list = criteria.list();
		return list;
	}

	public List<Employee> getEmployeeFromHierarchy(String hierarchy) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("hierarchy", hierarchy).ignoreCase());
		List<Employee> list = criteria.list();
		return list;
	}

	@Override
	public List<Employee> getEmployeeFromLocation(String location) {
		Criteria criteria  = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("location", location).ignoreCase());
		List<Employee> list = criteria.list();
		return list;
	}

	@Override
	public List<Employee> getEmployeeFromBadge(String badge) {
		Criteria criteria  = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("badge", badge).ignoreCase());
		List<Employee> list = criteria.list();
		return list;
	}

	@Override
	public int getEmployeeTimeoffByEmpId(String empId) {
		Date date = new Date();
		Criteria criteria  = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeId", Integer.parseInt(empId)));
		List<Employee> list = criteria.list();
		Iterator it =  list.iterator();
		while(it.hasNext()) {
			Employee employee = (Employee) it.next();
			date = employee.getTimeOff();
		}
		return date.getHours();
	}

	@Override
	public List<Employee> getEmployeeFromName(String name) {
		Criteria criteria  = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name", name).ignoreCase());
		List<Employee> list = criteria.list();
		return list;
	}

	@Override
	public int getEmployeeLeaveByEmpId(String empId) {
		String leave= null;
		Criteria criteria  = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeId", Integer.parseInt(empId)));
		List<Employee> list = criteria.list();
		Iterator it =  list.iterator();
		while(it.hasNext()) {
			Employee employee = (Employee) it.next();
			leave = employee.getLeave();
		}
		return Integer.parseInt(leave);
	}
}