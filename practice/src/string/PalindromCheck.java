package string;

public class PalindromCheck
{
	public static void main(String[] args) {
		String a1 = "Nayan";
		String a = a1.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.reverse();
		
		System.out.println(sb);
		if(a.equals(sb.toString()))
		{
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
