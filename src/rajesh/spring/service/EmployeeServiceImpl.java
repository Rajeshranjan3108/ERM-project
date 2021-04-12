package rajesh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rajesh.spring.dao.EmployeeDAO;
import rajesh.spring.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	@Transactional
	public List<Employee> getEmployee() {
		return employeeDAO.getEmployee();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmp) {
		employeeDAO.saveEmployee(theEmp);

	}

	@Override
	@Transactional
	public Employee getEmployeeById(int theId) {
		return employeeDAO.getEmployeeById(theId);
	}

	@Override
	@Transactional
	public void deleteEmployeeById(int theId) {
		employeeDAO.deleteEmployeeById(theId);

	}

}
