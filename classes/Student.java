package classes;
import java.lang.*;

public class Student extends Person
{
	private double gpa;
	
	public Student(){}
	
	public Student(Application application,String id,String shift,double gpa)
	{
		super(application,id,shift);
		this.gpa=gpa;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa=gpa;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void checkGpa(double g)
	{
		if(g>0.00 && g<5.00)
		{
			if(g>=4.50 && g<=5.00)
			{
				System.out.println("You are Eligible for Academic Scholership");
			}
			else
			{
				System.out.println("you are not eligible for any scholarship");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

	
	public void showDetails()
	{
		System.out.println("Student Information");
		this.getApplication().showDetails();
		System.out.println("ID : " +this.getId());
		System.out.println("GPA : " +gpa);
		System.out.println("Shift : " +this.getShift());
		System.out.println();
	}
}