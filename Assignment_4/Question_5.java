
import java.util.*;
class Question_5 {
    static boolean isAnagram(String str1 , String str2)
    {
     String s1=str1.replaceAll("\\s","");
     String s2=str2.replaceAll("\\s","");
     boolean status=false;
     if(s1.length()!=s2.length())
     {
         status=false;
     }
     else
     {
         char [] arr1 =s1.toLowerCase().toCharArray();
         char [] arr2 =s2.toLowerCase().toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         status=Arrays.equals(arr1,arr2);
     }
     if(status)
     {
       return true;  
     }
     else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string 1");
        String str1 =sc.nextLine();
        System.out.println("Enter the string 2");
        String str2 =sc.nextLine();
        boolean check=isAnagram(str1, str2);
        System.out.println(check);
    }
}