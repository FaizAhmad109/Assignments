// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Q3_BubbleSort {
    static void bubble(int [] arr)
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
    }
    static void swap(int [] arr , int a , int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int [] arr={1,2,9,1,2,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}