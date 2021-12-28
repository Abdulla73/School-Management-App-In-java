package interfaces;
import java.lang.*;
import classes.Application;

public interface ApplicationOperations
{
	boolean addApplicant(Application a);
	boolean removeApplicant(Application a);
	Application searchApplicant(String mobile);
	void showAllApplicants();
}