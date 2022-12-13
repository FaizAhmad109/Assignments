public class Question_6 {
 static boolean isPanagram(String str)
 {
	 boolean status=false;
	 boolean [] arr1=new boolean[26];
	 String s=str.replaceAll("\\s", "").toLowerCase();
	 char [] arr2=s.toCharArray();
	 for(int i=0;i<s.length();i++)
	 {
		if(Character.isLetter(s.charAt(i)))
		{
			int index=s.charAt(i)-'a';
			arr1[index]=true;
		}
	 }
	 
	
	 for(int i =0;i<arr1.length;i++)
	 {
		 if(arr1[i]==false)
			return false;
			 
	 }
	 status=true;
	 return status;
 }
	public static void main(String[] args) {
		boolean check=isPanagram("aabjhslakjhjkahdfcdefghijklmnopqrstuvwxy");
		System.out.println(check);
	}

}
