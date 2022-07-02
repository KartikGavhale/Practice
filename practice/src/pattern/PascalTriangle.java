package pattern;

public class PascalTriangle
{
	static int t=1,p ;
	public static void main(String[] args) 
	{
		int n = 5 ;
		
		for(int i = 0 ; i<n ; i++)
		{
			for(int j = 0 ; j<=i ; j++)
			{
				if(i==0 || j==0)
				{
					p=1;
				}else
					{
						p=p*(i-j+1)/j;
						
					}
				System.out.print(p);
			}
			
			System.out.println("");
		}	
			
		}
		
	}


