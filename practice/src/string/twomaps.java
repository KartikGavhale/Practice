package string;

import java.util.HashMap;
import java.util.Scanner;

public class twomaps 
{
	static boolean flag;
	public static void main(String[] args) {
		
		
		 try (Scanner sc = new Scanner(System.in)) {
			String A = sc.nextLine();
	        String B = sc.nextLine();
	        String a = A.toLowerCase();
	        String b = B.toLowerCase();

	        
	        HashMap<Character , Integer> map1 = new HashMap<>();
	        HashMap<Character , Integer> map2 = new HashMap<>();
	
	        
	   
	        	for(int i = 0 ; i<a.length();i++)
	        
	        	{
                char a1 = a.charAt(i);
                if(map1.containsKey(a1))
                {
                    map1.put(a1,map1.get(a1)+1);
                }else{
                    map1.put(a1 , 1);
                }
	        	}
	         	for(int i = 0 ; i<b.length();i++)
	    	        
	        	{
                char b1 = b.charAt(i);
                if(map2.containsKey(b1))
                {
                    map2.put(b1,map2.get(b1)+1);
                }else{
                    map2.put(b1 , 1);
                }
	        	}
                
                
           
           
	        System.out.println(map1);
	        System.out.println(map2);
	     
	        if(map1.equals(map2)&& !map1.isEmpty() && !map2.isEmpty())
	        {
	        	System.out.println("Anagrams");
	        }else
	        {
	        	System.out.println("Not Anagrams");
	        }
		}
	        
	        
	}

}
