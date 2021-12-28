package interfaces;
import java.lang.*;
import classes.Stuff;

public interface StuffOperations 
{
	boolean admitStuff(Stuff sf);
	boolean removeStuff(Stuff sf);
	Stuff searchStuff(String id);
	void showAllStuffs();
}