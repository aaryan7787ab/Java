//  Learning -- String and String's Methods
import java.util.Scanner;
public class day4_learning{
    public static void main(String[] args) {
        //  uses input function 
        System.out.print("Enter the String: ");
        Scanner name = new Scanner(System.in);
        // String entered by Keyboard
        String fulName = name.nextLine();
         System.out.println(fulName);
         
         // String Methods..
         System.out.println(fulName.length());
         System.out.println(fulName.toLowerCase());
         System.out.println(fulName.toUpperCase());
         
         // Trim method
         String value = new String("         MY NAME IS KHAN        ");
         String forTrim = value.trim();
         System.out.println(forTrim);
        
         //  Substring methods..
        System.out.println(fulName.substring(3));
        System.out.println(fulName.substring( 1 , 5));
        
        // Replace Method
        String value2 = "my name is Aryan Bhardwaj";
        String valueReplaced = value2.replace("Aryan" ,"Jannu");
        System.out.println(valueReplaced);
        
        // Start with and End with method ( Result : Boolean )
        System.out.println(fulName.startsWith("Ar"));
        System.out.println(fulName.endsWith("vj"));
        System.out.println(fulName.charAt(3));
        // Characters and String Index Value
        System.out.println(fulName.indexOf('B'));
        System.out.println(fulName.indexOf("an"));
        // Equals to -- with ignore case 
        System.out.println(fulName.equals("aryan bhardwaj"));
        System.err.println(fulName.equalsIgnoreCase("aRyAn BhardWaJ"));

        name.close();
    }

}