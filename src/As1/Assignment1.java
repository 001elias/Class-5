package As1;

import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
     
        Random random = new Random();
        int randomNumber = random.nextInt(12) + 1;

       
        String month;
        switch (randomNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month";
                break;
        }

        System.out.println("Randomly generated number: " + randomNumber);
        System.out.println("Corresponding month: " + month);
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the month (1-12): ");
        int month1 = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        
        int numDays = 0;

        if (month1 >= 1 && month1 <= 12) {
            if (month1 == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 29; 
                } else {
                    numDays = 28; 
                }
                System.out.println("February " + year + " had " + numDays + " days.");
            } else if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11) {
                numDays = 30;
                System.out.println(getMonthName(month1) + " " + year + " had " + numDays + " days.");
            } else {
                numDays = 31;
                System.out.println(getMonthName(month1) + " " + year + " had " + numDays + " days.");
            }
        } else {
            System.out.println("Invalid month!");
        }
        System.out.println("");
        
        Random random1 = new Random();


        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        
       
    
        System.out.printf("Hello " +  firstName + " " + lastName + " " + "you are " + age +  "years old nice to meet you!",firstName, lastName, age);

       
        int randomNumber1 = random1.nextInt(50) + 1;

   
        System.out.print("Please guess a number between 1 and 50: ");
        int guess = scanner.nextInt();

       
        if (guess == randomNumber1) {
            System.out.println("You are lucky!");
        } else if (guess > randomNumber1) {
            System.out.println("Choose a smaller one, you were unlucky.");
        } else {
            System.out.println("Choose a bigger one, you were unlucky.");
        }
        
        scanner.close();
        
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
        
    }
    
    
    
    
        
    }

