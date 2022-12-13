import java.util.Scanner;
//count number of vowels consonents and special characters
public class Question_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int v=0,c=0,s=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				++v;
			}
			// (32–47 / 58–64 / 91–96 / 123–126
			else if((str.charAt(i)>=32 && str.charAt(i)<=47) || (str.charAt(i)>=58 && str.charAt(i)<=64) || (str.charAt(i)>=91 && str.charAt(i)<=96) || (str.charAt(i)>=123 && str.charAt(i)<=126))
			{
				++s;
			}
			else
			{
				++c;
			}
		}
		System.out.println("Number of vowels");
					System.out.println(v);
		System.out.println("Number of consonents");
					System.out.println(c);
		System.out.println("Number of special characters");
					System.out.println(s);
	}

}
