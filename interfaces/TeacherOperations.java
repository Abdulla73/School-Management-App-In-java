package interfaces;
import java.lang.*;
import classes.Teacher;

public interface TeacherOperations
{
	boolean admitTeacher(Teacher t);
	boolean removeTeacher(Teacher t);
	Teacher searchTeacher(String id);
	void showAllTeachers();
}