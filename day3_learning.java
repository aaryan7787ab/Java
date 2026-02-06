import java.util.Scanner;

public class day3_learning {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // Arithmetic Operators
        //Assigning value to A
        System.out.print("Enter the value of a:");
        int  a = num.nextInt();
        //Assigning value to B
        System.out.print("Enter the value of b:");
        int  b = num.nextInt();
        // Result of the Operation 
        int sum = a + b;
        System.out.println(sum );
        // compariosn operators
        System.out.println(a > b);
        System.out.println(a ==b);
        // logiacal operators
        System.out.println(a > b && a == b);// and operator Gives true if both the conditions are true
        System.out.println(a > b  || a == b );// or operator gives true if any one of the conditions is true
       // precedence of operator..
        //Assigning value to C
        System.out.print("Enter the value of c: ");
       int c = num.nextInt();
       //Assigning value to D
       System.out.print("Enter the value of d:");
       int d = num.nextInt();
      // Result of the precedence
       int pre = c*d+a/b;
       System.out.println(pre);
     // Input Function is closed ...
       num.close();
    }
}
