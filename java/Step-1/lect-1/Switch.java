import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("enter two integer :-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.err.println("enter the operation you want to perform +(choose1) -(choose2) %(choose3) *(choose4) :-");
        int operation=sc.nextInt();
        switch(operation){
           case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 4:
                System.out.println("Subtraction: " + (a - b));
                break;
            default:
                System.out.println("Invalid operation selected. Please choose a valid operation.");
                break;
        }
       sc.close(); 
    }
}
