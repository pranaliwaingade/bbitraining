import java.io.*;

class pattern2
{
	static void ReverseCharBridge(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 'a'; j < 'a' + (2 * n) -1; j++)
			{
				if(j >= ('a' + n - 1) + i)
					System.out.print((char)(( 'a' + n - 1) -(j % ( 'a' + n - 1))));
					else if(j <= ( 'a' + n - 1) - i)
						System.out.print((char)j);
					else
						System.out.print("-");
						
			}			
		
			System.out.println();
		}
	}

	public static void main(String arg[])
	{
		int n = 7;
		ReverseCharBridge(n);
	}
}	
	