//Recursive code for printing numbers from 0 to 3 : 
public class Recursion {
    static void print(int n){
        
        if(n < 3) {
            System.out.println("Hello World");
         
            print(n+1); // Recursive call
        }
    }
    public static void main(String[] args) {
        print(0); 
    }
}



//Print name N times using recursion
// class Recursion {
    
//     static void func(int i, int n){
        
//             // Base Condition.
//             if(i>n) return;
//             System.out.println("Raj");

//             // Function call to print till i increments.
//             func(i+1,n);

//     }
//     public static void main(String[] args) {

//        // Here, let’s take the value of n to be 4.
//        int n = 4;
//        func(1,n);
//     }
// }