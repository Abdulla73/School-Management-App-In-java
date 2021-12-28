package interfaces;
import java.lang.*;
import classes.Student;

public interface StudentOperations 
{
	boolean admitStudent(Student s);
	boolean removeStudent(Student s);
	Student searchStudent(String id);
	void showAllStudents();
}