package HomeTask1;

import java.util.Arrays;

interface secondLargest{
    public int large(int[]a,int n);
}
public class HigestNumber {
    public static void main(String[] args) {
     int arr[]={5,25,3,65,4,49};
     int n=arr.length;
        secondLargest s=new secondLargest() {
            @Override
            public int large(int[] a, int n) {
                int temp;
                for(int i=0;i<n;i++)
                {
                    for(int j=i+1;j<n;j++)
                    {
                       if(a[i]>a[j])
                       {
                           temp=a[i];
                           a[i]=a[j];
                           a[j]=temp;
                       }
                    }
                }
                return a[n-2];
            }
        };
        System.out.println("Second Highest Number without Lambda Expression: " + s.large(arr,n));
     secondLargest s2=(a, n1) ->{
         Arrays.sort(a);
         return a[n1-2];
     };
        System.out.println("Second Highest Number With Lambda Expression: " + s.large(arr,n));
    }
}
