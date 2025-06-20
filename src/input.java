import java.util.Scanner;

public class input{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        /*

        System.out.print("Enter your name:");
        String name= scanner.nextLine();

        System.out.print("Enter your age:");
        int age=scanner.nextInt();

        System.out.print("Enter your Gpa:");
        double gpa= scanner.nextDouble();

        System.out.print("Are you a student (True/false):");
        boolean isStudent=scanner.nextBoolean();


        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your GPA is "+gpa);
        if(isStudent) {
            System.out.println("Your are a student");
        }else{
            System.out.println("Not a student");
        }
        */

        //calculate area of a rectangle
        double width=0;
        double height=0;
        double area=0;
        System.out.print("Enter the width: ");
        width=scanner.nextDouble();

        System.out.print("Enter the Height: ");
        height=scanner.nextDouble();

        area=width*height;
        System.out.println("The area is "+ area + "cm sq");

        scanner.close();
    }
}