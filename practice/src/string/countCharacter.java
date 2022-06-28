package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharacter 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String code1 = sc.nextLine();
		String code = code1.toLowerCase();
		sc.close();
		
		
		HashMap <Character , Integer> Hm = new HashMap<>();
		
		char[] ch = code.toCharArray();
	    for(int i = 0 ; i< ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				if(Hm.containsKey(ch[i]))
				{
					Hm.put(ch[i], (Hm.get(ch[i])+1));
				}else {
					Hm.put(ch[i],1);
				}
			}else {continue;}
		}
		System.out.println(Hm);
		System.out.println(Hm.size());
		
		char o = ' ';
		int max = 0 ;
		
		for(Map.Entry<Character , Integer> me : Hm.entrySet())
		{
			if(max < me.getValue())
			{
				max = me.getValue();
				o = me.getKey();
				
			}
		}
		
		System.out.println("Maximun repeating alphabet is "+ o + " : "+ max+ " times." );
		
		
		
		
		
	}
	
	

}
