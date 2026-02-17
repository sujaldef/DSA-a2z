public class Arrayreverse {
    static void reverse(int arr[])
    {
int size=arr.length;
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array: ");
        reverse(arr);
    }
}
