public class Question_3 {

	public static void main(String[] args) {
		int n=2552;
		int temp=n , rem =0 , ans=0;		
		int length = (int) (Math. log10(n) + 1);
		int i=length-1;
		while(temp>0)
		{
			rem=temp%10;
			ans=ans+rem*(int)(Math.pow(10, i));
			--i;
			temp/=10;
			
		}
		if(n==ans)
			System.out.println(true);
		else
			System.out.println(false);
		
	
	}
}
