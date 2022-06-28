package string;

import java.util.Scanner;

public class enterAndPrint 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		System.out.println(S);
		int i  = S.length();
		System.out.println("Lenget of String is :" + i);
	}

}
