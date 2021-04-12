package rajesh.spring.dao;

import java.util.List;

import rajesh.spring.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployee();
	public void saveEmployee(Employee theEmp);
	public Employee getEmployeeById(int theId);
	public void deleteEmployeeById(int theId);
}
