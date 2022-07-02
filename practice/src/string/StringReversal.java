package string;

public class StringReversal 
{
	public static void main(String[] args) {
		
		String main = "www.google.com";
		
		String[] a =main.split("\\.");
		int count = 0 ;
		for(String q : a)
		{
			count++;
			StringBuilder sb = new StringBuilder();
			sb.append(q);
			sb.reverse();
			String k  = sb.toString();
			if(count==1)
			{System.out.print(k);
			}
			else {
			System.out.print("."+k);}
		}
	
		
	}
	

}
