public class If_else {
    public static void main(String[] args) {
        int a=90;
        int b=99;
        // if-else statement
        if(b==a){
            System.err.println("Both are equal");
        }{
            System.err.println("Both are not equal");
        }
        // if-else if-else statement
        if(b>a){
            System.err.println("b is greater than a");
        } else if(a>b){
            System.err.println("a is greater than b");
        } else {
            System.err.println("Both are equal");
        }
        // do-while loop
        do{
            System.err.println("yeht oh hoga hi infinite loop");
        }while(a<b);
    }
}
