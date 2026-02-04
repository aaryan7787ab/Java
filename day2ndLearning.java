// To enter the name of the student
// Enter its marks and find the Percentage.

import java.util.Scanner;

class day2ndLearning{
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

            System.out.print("Enter the name : " );
            String name = info.nextLine();
            System.out.print("Enter the Marks of First Subject: " );
            Byte marks1 = info.nextByte();
            System.out.print("Enter the Marks of  Second Subject: " );
            Byte marks2 = info.nextByte();
            System.out.print("Enter the Marks of Third Subject : ");
            Byte marks3 = info.nextByte();
            System.out.print("Enter the Marks of Fourth Subject: ");    
            Byte marks4 = info.nextByte();
            System.out.print("Enter the Marks of Fifth Subject : ");
            Byte marks5 = info.nextByte();
            double Average = (marks1 + marks2 + marks3 + marks4 + marks5)/5;
            System.out.println(name +" your Percentage is : "+ Average);
            info.close();
        }
    }
