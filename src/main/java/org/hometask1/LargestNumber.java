package org.hometask1;

public class LargestNumber implements SecondLargest {

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

}
