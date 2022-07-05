package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenCount {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	sc.close();
	
	StringTokenizer st = new StringTokenizer(a," ");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	}
}
