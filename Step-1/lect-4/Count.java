public class Count {
    public static void main(String[] args) {
        int count=0;
        int a= 6789234;
        while(a>0){
            a=a/10;
            count++;
            
        }
        System.err.println("Number of digits: " + count);
    }
}
