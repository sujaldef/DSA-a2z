public class Selectionsort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int num=i;
            // we take the first element
            for(int j=i+1;j<n;j++)
            {
                // and here we compare the first element with the rest of the elements
          
                if(arr[j]<arr[num])
                {
                    // then find the minimum element 
                    num=j;
                }
            }
            //then we swap
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
        }
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
