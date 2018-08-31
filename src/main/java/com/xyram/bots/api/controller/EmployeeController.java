package com.xyram.bots.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xyram.bots.api.model.Employee;
import com.xyram.bots.api.service.EmployeeService;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private  EmployeeService employeeService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public  Employee saveEmployee(@RequestBody  Employee employee) {
		return employeeService.saveOrUpdate(employee);
	} 
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public  List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	} 
	
	/* Single API for hierarchy, location, badge and name*/
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeByProperty(@RequestParam("propertyName") String propertyName, @RequestParam("value") String value){
		return employeeService.getEmployeeByProperty(propertyName,value);
	}
	
	@RequestMapping(value = "/hierarchy", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeFromHierarchy(@RequestParam String hierarchy) {
		return employeeService.getEmployeeFromHierarchy(hierarchy);
	} 
	
	@RequestMapping(value = "/location", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeFromLocation(@RequestParam String location) {
		return employeeService.getEmployeeFromLocation(location);
	}
	
	@RequestMapping(value = "/badge", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeFromBadge(@RequestParam String badge) {
		return employeeService.getEmployeeFromBadge(badge);
	}
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeFromName(@RequestParam String name) {
		return employeeService.getEmployeeFromName(name);
	}
	
	@RequestMapping(value = "/timeoff", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployeeTimeoffByEmpId(@RequestParam String empId) {
		int date = employeeService.getEmployeeTimeoffByEmpId(empId);
		return date+" hrs";
	}
	
	@RequestMapping(value = "/leave", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployeeLeaveByEmpId(@RequestParam String empId) {
		int leave = employeeService.getEmployeeLeaveByEmpId(empId);
		return leave+" days";
	}
}