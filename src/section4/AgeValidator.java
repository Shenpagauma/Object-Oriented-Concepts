package section4;

import java.util.Scanner;

public class AgeValidator {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Age");
       int age=sc.nextInt();
       try {
       if(age < 19) {
           throw new  InValidAgeException();
       }
       else {
           System.out.println("Welcome to vote");
       }
       }
       catch(InValidAgeException exp) {
           System.err.println(exp);
       }
       finally{
           sc.close();
       }
       

    }

}
