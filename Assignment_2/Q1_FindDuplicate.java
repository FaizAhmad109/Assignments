
class Q1_FindDuplicate {
    static void duplicate(int [] arr)
    {
        bubbleSort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }
        
    }
    static void bubbleSort(int [] arr)
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
        int [] arr={1,2,9,1,2,4,4,5,7,8,9,0,8,-1,-11,0};
        duplicate(arr);
       
    }
}