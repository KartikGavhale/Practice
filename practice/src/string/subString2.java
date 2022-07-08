package string;

import java.util.Scanner;

public class subString2 {

	public static void main(String[] args) {
	     try (Scanner sc = new Scanner(System.in)) {
			String a = sc.nextLine();
			 String b = sc.nextLine();
			 String b1 = " "; 
			 String b2=" " ;
			    String b0 = b.replaceAll(" ", "");
			    int len = b0.length();
			    if(len==2)
			    {
			         b1 = b0.substring(0,1);
			         b2 = b0.substring(1,1);
			    } else {
			    if(len==3)
			    {
			        b1 = b0.substring(0,1);
			         b2 = b0.substring(1,2);
			    }
			    else
			    {
			         b1 = b0.substring(0,2);
			         b2 = b0.substring(2,4);
			        
			    }}
			
			 
			 int c1 = Integer.valueOf(b1);
			 int c2 = Integer.valueOf(b2);
			 
			 System.out.println(c1 +" ====" + c2);
			 String main = a.substring(c1 , c2);
			 System.out.println(main);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
}
