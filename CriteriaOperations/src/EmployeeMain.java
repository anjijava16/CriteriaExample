import java.util.Iterator;
import java.util.List;

import com.iwinner.hibenate.model.Employee;
import com.iwinner.hibenate.services.EmployeeServices;
public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Full Employee objects");
		EmployeeServices employeeServices=new EmployeeServices();
		List list=employeeServices.selectFullEmp();
		Iterator it=list.iterator();
		while(it.hasNext()){
			Employee emp=(Employee)it.next();
			System.out.println("Empid"+"\t"+emp.getEmployeeId());
			System.out.println("EmpName"+"\t"+emp.getEmployeeName());
			System.out.println("EmpSalary"+"\t"+emp.getEmployeeSalary());
			System.out.println("EmpDeptNo"+"\t"+emp.getEmployeedeptNumber());
		}
		System.out.println("Partial Employee objects");
		List list2=employeeServices.selectHalfEmp();
		Iterator it2=list2.iterator();
		while(it2.hasNext()){
			Object obj[]=(Object[])it2.next();
			System.out.println("Empid"+"\t"+obj[0]);
			System.out.println("EmpName"+"\t"+obj[1]);
		}
		
	}
	
	// Select selectFullEmployee Information Query
	
	public static void main3(String[] args) {
		
		System.out.println("Full Employee objects");
		EmployeeServices employeeServices=new EmployeeServices();
		List list=employeeServices.selectFullEmp();
		Iterator it=list.iterator();
		while(it.hasNext()){
			Employee emp=(Employee)it.next();
			System.out.println("Empid"+"\t"+emp.getEmployeeId());
			System.out.println("EmpName"+"\t"+emp.getEmployeeName());
			System.out.println("EmpSalary"+"\t"+emp.getEmployeeSalary());
			System.out.println("EmpDeptNo"+"\t"+emp.getEmployeedeptNumber());
		}
		
	}
	
	//selectPartialEmployee
	public static void main(String[] args) {
		
		System.out.println("Full Employee objects");
		EmployeeServices employeeServices=new EmployeeServices();
		List list=employeeServices.selectPartialEmployee();
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object emp=(Object)it.next();
			
		}
		
	}
	public static void main2(String[] args) {
		
		EmployeeServices employeeServices=new EmployeeServices();
		
		List list=employeeServices.getEmployee();
		
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			Employee emp=(Employee)it.next();
			System.out.println("Empid"+"\t"+emp.getEmployeeId());
			System.out.println("EmpName"+"\t"+emp.getEmployeeName());
			System.out.println("EmpSalary"+"\t"+emp.getEmployeeSalary());
			System.out.println("EmpDeptNo"+"\t"+emp.getEmployeedeptNumber());
			
			System.out.println("===========>>>");
		}
		
	
	
	}

}
