package rajesh.spring.service;

import java.util.List;

import rajesh.spring.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	public void saveEmployee(Employee theEmp);
	public Employee getEmployeeById(int theId);
	public void deleteEmployeeById(int theId);
}
