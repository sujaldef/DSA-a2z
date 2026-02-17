import java.util.*;
public class Input_output{
    public static void main(String[] args) {
        Scanner age= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age1 = age.nextInt();
        System.out.println("Your age is: " + age1);
        age.close();

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username= name.nextLine();
        System.out.println("Your name is: " + username);
        name.close();
    }
}