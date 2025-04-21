

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lab_services_student
 */
public class login {
    private String firstName;
    private String lastName;
     private String username;
    private String password;
    private String cellNumber;
    
    public boolean checkUserName(){
        //username must have an underscore and be <= 5 characters
          if (username == null) return false;
    
    // Trim whitespace and check length
    username = username.trim();
    return username.contains("_") && username.length() <= 5;
    }
    //checks the password meets the complexity requirements
    public boolean checkPasswordComplexity (){
     if (password == null || password.length() < 8) {
            return false;
        }

        // Check for at least one capital letter, one number, and one special character
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
 for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return hasCapital && hasNumber && hasSpecial;
    }
    //check the phone number
    public boolean checkCellPhoneNumber() {
         String regex = "^\\+\\d{1,3}\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cellNumber);
        return matcher.matches();
        //(OpenAI, 2023)
    }
    //returns the necessary registration messages
        public String registerUser() {
    boolean isUsernameValid = checkUserName();
        boolean isPasswordValid = checkPasswordComplexity();

        if (!isUsernameValid && !isPasswordValid) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.\n" +
                   "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else if (!isUsernameValid) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!isPasswordValid) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else {
            return "User registered successfully.";
        }
}
        //check user login 
        public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
       //shows the login status message
         public String returnLoginStatus(boolean isLoginSuccessful) {
        if (isLoginSuccessful) {
            return "Welcome " + firstName + "," + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
}

 // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        
 }

    public String getCellPhoneNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}