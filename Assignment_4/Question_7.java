

import java.util.Scanner;

public class Question_7 {
	static boolean uniqueCharacters(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(uniqueCharacters(str));

	}

}
