
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part1;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
class Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login loginSystem = new login();
        
        System.out.println("=== User Registration ===");
        
        // Get user details
        System.out.print("Enter first name: ");
        loginSystem.setFirstName(scanner.nextLine());
        
        System.out.print("Enter last name: ");
        loginSystem.setLastName(scanner.nextLine());
    
  // Username input and validation
        boolean validUsername = false;
        while (!validUsername) {
            System.out.print("Enter username (must contain '_' and be ≤ 5 chars): ");
            String username = scanner.nextLine().trim();
            loginSystem.setUsername(username);
            
            if (loginSystem.checkUserName()) {
                validUsername = true;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
   }
        }
        
        // Password input and validation
        boolean validPassword = false;
        while (!validPassword) {
            System.out.print("Enter password (must be ≥8 chars with capital, number, and special char): ");
            String password = scanner.nextLine();
            loginSystem.setPassword(password);
            
            if (loginSystem.checkPasswordComplexity()) {
                validPassword = true;
            } else {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            }
            
}
        
        // Cell phone input and validation
        boolean validPhone = false;
        while (!validPhone) {
            System.out.print("Enter cell phone number (with international code, ): ");
            String phone = scanner.nextLine();
         loginSystem.setCellNumber(phone);
            
            if (loginSystem.checkCellPhoneNumber()) {
                validPhone = true;
                System.out.println("Cell phone number successfully added.");
            } else {
              
System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        }
        
        // Complete registration
        System.out.println(loginSystem.registerUser());
        System.out.println("\n=== Registration Successful ===");
        
        // Login process
        System.out.println("\n=== Login ===");
        boolean loggedIn = false;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        
            while (!loggedIn && attempts < MAX_ATTEMPTS) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            
            loggedIn = loginSystem.loginUser(inputUsername, inputPassword);
            
            if (loggedIn) {
                System.out.println(loginSystem.returnLoginStatus(true));
            } else {
                attempts++;
                System.out.println(loginSystem.returnLoginStatus(false));
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Attempts remaining: " + (MAX_ATTEMPTS - attempts));
              } else {
                    System.out.println("Maximum login attempts reached. Please try again later.");
                }
            }
        }
        
        scanner.close();
    }
}