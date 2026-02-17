import java.util.*;
public class Datatypes {
    public static void main(String[] args) {
        int integervar=12;
        double doublevar=12.12;
        float floatvar=12.12f;
        char charvar='A';
        boolean boo=true;
        String stringvar="Hello World";
        System.out.println("Integer: " + integervar);
        System.out.println("Double: " + doublevar);                 
        System.out.println("Float: " + floatvar);
        System.out.println("Character: " + charvar);
        System.out.println("Boolean: " + boo);
        System.out.println("String: " + stringvar);
        //type conversion //widening
        double num1= integervar;
        System.err.println("Widening Conversion: " + num1);;
        //type conversion //narrowing
        int int5= (int)floatvar;
        System.err.println("Narrowing Conversion: " + int5);
        // airthmetic operations
        double sumatuio =integervar + doublevar;
        System.out.println("Sum of Integer and Double: " + sumatuio); 
        Scanner sc= new Scanner(System.in);
        System.err.println("whats the valuer of the pi? ");
        double pi= sc.nextDouble();
        System.out.println("Value of Pi: " + pi);
        sc.close();
    }
}
