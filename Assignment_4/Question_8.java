
import java.util.Scanner;
public class Question_8
{
	static void maxChar(String str)
	{
		char [] ch= str.toCharArray();
		int max=0 ;
		char ch1='x';
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			if(Character.isLetter(ch[i])==true)
			{
				
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						++count;
					}
				}
			}

			if(max<count)
			{
				max=count;
				ch1=ch[i];
			}
		}
		System.out.println(ch1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str =sc.nextLine();
		maxChar(str);
	}

}
