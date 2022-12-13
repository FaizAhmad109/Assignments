import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		 String str=sc.nextLine();
		 boolean [] b=new boolean[str.length()];
	       char [] ch=str.toCharArray();
	       String str1="";
	       for(int i=0;i<ch.length;i++)
	       {
	    	   for(int j=i+1;j<ch.length;j++)
	    	   {
	    		   if(ch[i]==ch[j])
	    		   {
	    			   b[j]=true;
	    		   }
	    		  
	    	   }
	    	   if(b[i]!=true)
    		   {
        	   str1=str1+ch[i];
    		   }
      	          
	       }
	       
	       System.out.println("String without duplicates");
	       System.out.println(str1);
	      }
	}


