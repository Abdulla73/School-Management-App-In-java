package classes;
import java.lang.*;
import interfaces.PersonOperations;

public abstract class Person implements PersonOperations
{
	private Application application;
	private String id;
	private String shift;
	
	public Person(){}
	
	public Person(Application application,String id,String shift)
	{
		this.application=application;
		this.id=id;
		this.shift=shift;
	}
	
	public void setApplication(Application application)
	{
		this.application=application;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setShift(String shift)
	{
		this.shift=shift;
	}
	
	public Application getApplication()
	{
		return application;
	}
	public String getId()
	{
		return id;
	}
	public String getShift()
	{
		return shift;
	}
	
	
	public abstract void showDetails();

}