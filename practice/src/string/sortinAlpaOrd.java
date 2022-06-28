package string;

import java.util.Set;
import java.util.TreeSet;

public class sortinAlpaOrd 
{
	public static void main(String[] args) {
		
	
	String[] Sa = {"Kartik" , "Yogesh" , "Shilpesh" , "Raj" , "Ajay"};
	
	Set<String> ts = new TreeSet<>();
	
	for(String q : Sa)
	{
		ts.add(q);
	}
	System.out.println(ts);
	}

}
