import java.util.Scanner;

// remove duplicate character from string
public class Question_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the STRING");
		String s=sc.nextLine();
		String  s1="",s2="";
		//char [] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=65 && s.charAt(i)<=90))
			{
				s1=s1+s.charAt(i);
				
			
			}
		}
		//System.out.println(s1);
		char [] c=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
        	boolean flag=false;
        	
			for(int j=i+1;j<s1.length();j++)
			{
				if(c[i]==c[j])
				{
					c[j]='$';
					flag=true;
				}
			}
			if(flag==true && c[i]!='$')
			{
			s2=s2+c[i];	
			}
        }
        System.out.println("Duplicates present in the string");
		System.out.println(s2);
	}

}
