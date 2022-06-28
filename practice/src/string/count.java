package string;

import java.util.Scanner;

public class count
{
	public static void main(String[] args) {
		
		int vowels = 0 ;
		int consonent = 0 ;
		int digits = 0 ;
		int WS = 0;
		
		Scanner sc = new Scanner(System.in);
		String para = sc.nextLine();
		sc.close();
		String Lpara = para.toLowerCase();
	
		for(int i = 0 ; i<para.length(); i++)
		{
			char ch = Lpara.charAt(i);
			
			
			if(Character.isAlphabetic(ch))
			{
				if(Lpara.charAt(i)=='a' || Lpara.charAt(i)=='e' ||Lpara.charAt(i)=='i' ||Lpara.charAt(i)=='o' || Lpara.charAt(i)=='u')
				{
					vowels++;
				}else {
					consonent++;
				}
			}
			if(Character.isDigit(ch))
			{
				digits++;
			}
			if(ch == ' ')
			{
				WS++;
			}
		}
		System.out.println( "vowels in Strings are :" + vowels);
		System.out.println( "consonent in Strings are :" + consonent);
		System.out.println( "digits in Strings are :" + digits);
		System.out.println( "WS in Strings are :" + WS);



	}

}
