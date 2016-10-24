import com.vinay.hibernate.dao.StudentDAO;
import com.vinay.hibernate.dao.StudentDAOFactory;
public class Main {

	public static void main(String[] args) 
	{
		StudentDAO dao=StudentDAOFactory.getInstance();
		dao.insertStudent("vinay", 460);
		System.out.println("----------------------------");
		dao.readStudent(1);
	}

}
