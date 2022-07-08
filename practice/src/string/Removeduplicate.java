package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Removeduplicate
{
	public static void main(String[] args) 
    {
       String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        try (Scanner sc = new Scanner(System.in)) {
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
			while (num > 0) 
			{
			    String input = sc.nextLine();
			    
			    Matcher m = p.matcher(input);
			    

			    while (m.find()) 
			    {
			        input = input.replaceAll(m.group(), m.group(1));
			    }
			    
			    System.out.println(input);
			    num--;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

}
