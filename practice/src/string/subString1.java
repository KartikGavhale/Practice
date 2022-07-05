package string;

import java.util.Scanner;

public class subString1 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      String A = sc.nextLine();
	      String B = sc.nextLine();
	      sc.close();
	      
	      int len = A.length() + B.length() ;
	      System.out.println(len);
	      
	      if(A.compareTo(B)>0)
	      {
	          System.out.println("Yes");
	      }else{
	          if(A.compareTo(B)<0)
	          {
	              System.out.println("No");
	          }else{System.out.println("equal");}
	            }
	        
	       String a1 = A.substring(0,1).toUpperCase();
	       String a2 = A.substring(1,A.length());
	       String A1 = a1 +a2 ;
	       
	        String b1 = B.substring(0,1).toUpperCase();
	       String b2 = B.substring(1,B.length()	);
	       String B1 = b1 +b2 ;
	       
	       System.out.println(A1 + " "+ B1);
	       
	       String b  = "3" ;
	       
	       int c = Integer.valueOf(b);
	       System.out.println(c);
	      }
	}


