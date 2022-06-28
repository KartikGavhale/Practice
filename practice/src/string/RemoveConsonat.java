package string;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveConsonat 
{
	public static void main(String[] args) {
		
		String a = "Hello, have a good day";
		
		
		ArrayList<String> a1 =  new ArrayList<String>();
		
		for(int i = 0 ; i<a.length(); i++)
		{
			if(a.charAt(i)== 'a' || a.charAt(i)== 'e'|| a.charAt(i)== 'i'|| a.charAt(i)== 'o'|| a.charAt(i)== 'u'|| a.charAt(i)== ' '|| a.charAt(i)== ',')
			{a1.add(String.valueOf(a.charAt(i)));}
			
		}
		java.util.Iterator<String> itr=a1.iterator();  

		while(itr.hasNext())
		{
		System.out.print(itr.next());
		}
		
	}

}
