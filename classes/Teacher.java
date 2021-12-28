package classes;
import java.lang.*;

public class Teacher extends Person
{
	private String subject;
	private String position;
	private double salary;
	
	public Teacher(Application application,String id,String shift,String subject,String position,double salary)
	{
		super(application, id ,shift);
		this.subject=subject;
		this.position=position;
		this.salary=salary;
	}
	
	public void setSubject()
	{
		this.subject=subject;
	}
	public void setPosition(String position)
	{
		this.position=position;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String getSubject()
	{
		return subject;
	}
	public String getPosition()
	{
		return position;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void showDetails()
	{
		System.out.println("Teacher Information");
		this.getApplication().showDetails();
		System.out.println("Subject : " +subject);
		System.out.println("ID : " +this.getId());
		System.out.println("Position : " +position);
		System.out.println("Shift : " +this.getShift());
		System.out.println("Monthly Income : " +salary);
		System.out.println();
	}
}

