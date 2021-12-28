package classes;
import java.lang.*;

public class Stuff
{
	private String name;
	private String stuffId;
	private String catagory;
	private String joiningDate;
	private double salary;
	
	public Stuff(){}
	
	public Stuff(String name,String stuffId, String catagory, String joiningDate,double salary)
	{
		this.name=name;
		this.stuffId=stuffId;
		this.catagory=catagory;
		this.joiningDate=joiningDate;
		this.salary=salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setStuffId(String stuffId)
	{
		this.stuffId=stuffId;
	}
	public void setCatagory(String catagory)
	{
		this.catagory=catagory;
	}
	public void setJoiningDate(String joiningDate)
	{
		this.joiningDate=joiningDate;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	public String getStuffId()
	{
		return stuffId;
	}
	public String getCatagory()
	{
		return catagory;
	}
	public String getJoiningDate()
	{
		return joiningDate;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void showDetails()
	{
		System.out.println("Stuffs Information");
		System.out.println("Name : " +name);
		System.out.println("ID : " +stuffId);
		System.out.println("Work Place : " +catagory);
		System.out.println("Joining Date : " +joiningDate);
		System.out.println("Monthly Income : " +salary);
		System.out.println();
	}
	
}