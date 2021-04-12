package rajesh.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rajesh.spring.entity.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployee() {
		Session curr=sessionFactory.getCurrentSession();
		Query theQ=curr.createQuery("from Employee", Employee.class);
		List<Employee> li=theQ.getResultList();
		return li;
	}

	@Override
	public void saveEmployee(Employee theEmp) {
		Session curr=sessionFactory.getCurrentSession();
		curr.saveOrUpdate(theEmp);
	}

	@Override
	public Employee getEmployeeById(int theId) {
		Session curr=sessionFactory.getCurrentSession();
		Employee emp=curr.get(Employee.class, theId);
		return emp;
	}

	@Override
	public void deleteEmployeeById(int theId) {
		Session curr=sessionFactory.getCurrentSession();
		Employee emp=curr.get(Employee.class, theId);
		curr.delete(emp);
//		Query theQ=curr.createQuery("delete from Employee where id=:theId");
//		theQ.executeUpdate();
	}

}
