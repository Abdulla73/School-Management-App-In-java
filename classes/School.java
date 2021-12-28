package classes;
import java.lang.*;
import interfaces.*;

public class School implements StudentOperations, TeacherOperations, StuffOperations, ApplicationOperations
{
	private Person persons[] = new Person [20000];
	private Application applications[] = new Application [50000];
	private Student students[] = new Student [2000];
	private Teacher teachers[] = new Teacher [500];
	private Stuff stuffs[] = new Stuff [250];
	
	public School(){}
	
	public boolean addApplicant(Application a)
	{
		for(int i=0; i<applications.length; i++)
		{
			if(applications[i] == null)
			{
				applications[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeApplicant(Application a)
	{
		for(int i=0; i<applications.length; i++)
		{
			if(applications[i] == a)
			{
				applications[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Application searchApplicant(String mobile)
	{
		for(int i=0; i<applications.length; i++)
		{
			if(applications[i] != null)
			{
				if(applications[i].getMobileNum().equals(mobile))
				{
					return applications[i];
				}
			}
		}
		return null;
	}
	
	public void showAllApplicants()
	{
		for(int i=0; i<applications.length; i++)
		{
			if(applications[i] != null)
			{
				applications[i].showDetails();
			}
		}
	}
	
	public boolean admitStudent(Student s)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeStudent(Student s)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == s)
			{
				students[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Student searchStudent(String id)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getId().equals(id))
				{
					return students[i];
				}
			}
		}
		return null;
	}
	
	public void showAllStudents()
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				students[i].showDetails();
			}
		}
	}
	
	public boolean admitTeacher(Teacher t)
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == null)
			{
				teachers[i] = t;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeTeacher(Teacher t)
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] == t)
			{
				teachers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Teacher searchTeacher(String id)
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] != null)
			{
				if(teachers[i].getId().equals(id))
				{
					return teachers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllTeachers()
	{
		for(int i=0; i<teachers.length; i++)
		{
			if(teachers[i] != null)
			{
				teachers[i].showDetails();
			}
		}
	}
	
	public boolean admitStuff(Stuff sf)
	{
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] == null)
			{
				stuffs[i] = sf;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeStuff(Stuff sf)
	{
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] == sf)
			{
				stuffs[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Stuff searchStuff(String id)
	{
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] != null)
			{
				if(stuffs[i].getStuffId().equals(id))
				{
					System.out.println();
					return stuffs[i];
				}
			}
		}
		return null;
	}
	
	public void showAllStuffs()
	{
		for(int i=0; i<stuffs.length; i++)
		{
			if(stuffs[i] != null)
			{
				stuffs[i].showDetails();
			}
		}
	}
	
	public void showSchoolDetails()
	{
		System.out.println("\n\n\t\t American International school and collage");
		System.out.println("\t\t         Gulshan 2, Road-5, Block-A");
		System.out.println("\t\t===========================================");
	}
	
}
