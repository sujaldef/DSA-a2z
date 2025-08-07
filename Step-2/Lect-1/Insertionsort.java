public class Insertionsort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for (int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;//prev element of key
            while (j>=0 && arr[j]>key)//check if the key is smaller than the previous elements
            {
               arr[j+1]=arr[j];//shift the key (j+1) to left 
                j--;
            }
            arr[j+1]=key; //insert the key at the right 
            // and if donet seap then no j-- and thekey is in its place 
            
            
        }
    }
}
