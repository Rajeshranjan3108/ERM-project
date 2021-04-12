package rajesh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rajesh.spring.entity.Employee;
import rajesh.spring.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

		@Autowired
		private EmployeeService employeeService;
		
		@GetMapping("/list")
		public String getEmployee(Model theModel) {
			List<Employee> theEmp=employeeService.getEmployee();
			theModel.addAttribute("employeeName",theEmp);
			return "list-page";
		}
		
		@GetMapping("/save")
		public String saveEmployee(Model theModel) {
			Employee emp=new Employee();
			theModel.addAttribute("saveEmployee", emp);
			return "employee-form";
		}
		@PostMapping("/saving")
		public String updateList(@ModelAttribute ("saveEmployee") Employee emp) {
			employeeService.saveEmployee(emp);
			return "redirect:/employee/list";
		}
		
		@GetMapping("/showForUpdate")
		public String getEmpById(@RequestParam("employeeId") int theId, Model theModel) {
			Employee emp=employeeService.getEmployeeById(theId);
			theModel.addAttribute("saveEmployee",emp);
			return "employee-form";
		}
		
		@GetMapping("/delete")
		public String deleteById(@RequestParam("employeeId") int theId, Model theModel) {
			employeeService.deleteEmployeeById(theId);
			return "redirect:/employee/list";
		}
		
}
