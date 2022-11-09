
import java.util.Arrays;
class Q5_SelectionSort {
    static void selection(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int max=maximum(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int maximum(int [] arr , int start , int last)
    {
        int m=0;
        for(int i=1;i<=last;i++)
        {
            if(arr[m]<arr[i])
            {
                m=i;
            }
        }
        return m;
    }
    static void swap(int [] arr , int a , int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int [] arr={3,1,0,5,6};
        selection(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}
class HelloWorld {
    static void selection(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int max=maximum(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int maximum(int [] arr , int start , int last)
    {
        int m=0;
        for(int i=1;i<=last;i++)
        {
            if(arr[m]<arr[i])
            {
                m=i;
            }
        }
        return m;
    }
    static void swap(int [] arr , int a , int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int [] arr={3,1,0,5,6};
        selection(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}