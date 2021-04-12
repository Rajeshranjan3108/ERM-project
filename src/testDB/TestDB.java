package testDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user="hbstudent";
		String pass="hbstudent";
		String jdbcUrl="jdbc:mysql://localhost:3306/web_employee_tracker?useSSL=false&serverTimezone=UTC";
		String driver="com.mysql.cj.jdbc.Driver";
		
		try {
			System.out.println("Connecting...");
			Class.forName(driver);
			Connection myCon=DriverManager.getConnection(jdbcUrl,user, pass);
			System.out.println("Connected to SQL");
			myCon.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
