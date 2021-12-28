package classes;
import java.lang.*;

public class Application
{
	private String firstName;
	private String lastName;
	private String mobileNum;
	private String address;
	private String gender;
	private String dob;
	
	public Application(){}
	
	public Application(String firstName, String lastName, String mobileNum, String address, String gender, String dob)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNum=mobileNum;
		this.address=address;
		this.gender=gender;
		this.dob=dob;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void setMobileNum(String mobileNum)
	{
		this.mobileNum=mobileNum;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setDob(String dob)
	{
		this.dob=dob;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getMobileNum()
	{
		return mobileNum;
	}
	public String getAddress()
	{
		return address;
	}
	public String getGender()
	{
		return gender;
	}
	public String getDob()
	{
		return dob;
	}
	
	public void showDetails()
	{
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name :"+lastName);
		System.out.println("Date of Birth"+dob);
		System.out.println("Gender :"+gender);
		System.out.println("Mobile No :"+mobileNum);
		System.out.println("Present Address :"+address);
		System.out.println();
	}
	
	
}