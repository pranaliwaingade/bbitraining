import java.util.*;
class ReplacerChar
{
	public static void main(String args[])
	{
		String acceptFromUser;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string which you want to replace:");
		acceptFromUser=sc.nextLine();
		char replace[]=acceptFromUser.toCharArray();
		
		for(int i=0;i<replace.length;i++)
		{
			if(replace[i]=='a')
			{
				replace[i]='c';
			}
		}
		System.out.println(replace);
	}
}


