package string;

import java.util.Scanner;

public class Nameconversion 
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		String name = sc.nextLine();
		sc.close();
		
		
		String[] initials = name.split(" ");
		int k = initials.length;
		for(int i = 0 ; i< initials.length-1 ; i++)
		{
			char [] r = initials[i].toUpperCase().toCharArray();
			System.out.print(r[0]+".");
			
		}
		String lastname = initials[k-1].toString();
		System.out.println(lastname);
		
	}
	
	
	}

