/*
   y
  oy
 goy
igoy
*/
import java.util.*;
class stringPatternProgramming6
{
	public static void main (String[] yogi)
	{
		String str;
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.next();
		int a = str.length();
		char ch[] = str.toCharArray();
		for(i=0;i<=(a-1);i++)
		{
			for(k=(a-2);k>=i;k--)
				{
				System.out.print(" ");
				}
			for(j=i;j>=0;j--)
				{
				System.out.print(ch[j]);
				}
			
			System.out.println();
			
		}
	}	
}