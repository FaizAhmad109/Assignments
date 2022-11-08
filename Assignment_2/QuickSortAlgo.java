// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class QuickSortAlgo {
    static void quickSort(int [] arr , int start , int end)
    {
     if(start<end)
     {
        int p=partition(arr,start,end);
        quickSort(arr,start,p);
        quickSort(arr,p+1,end);
     }
    }
    
    static int partition(int [] arr , int start , int end)
    {
        int pivot=arr[start];
        int i=start, j=end;
        while(i<j)
        {
           while(arr[i]<=pivot)
           {
               ++i;
           }
           while(arr[j]>pivot)
           {
               --j;
           }
           if(i<j)
            swap(arr,i,j);
        }
        swap(arr,start,j);
        return j;
    }
    static void swap(int [] arr , int a , int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int [] arr ={10,16,8,12,15,6,3,9,5,0};
            quickSort(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
    }
}