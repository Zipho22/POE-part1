/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ChatApp {
    
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    //Registration panel:
    System.out.println("\n--- REGISTRATION---");
    
    //Request the user to enter their first name 
    System.out.print("Enter firstname :");
    String name1 = input.nextLine();
    
    //Request the user to enter their Last name
    System.out.print("Enter lastname :");
    String name2 = input.nextLine();
     
    //Declare variables to add loops
    
     String LoginID = "";
     String password = "";
     String phone = "";
     
    //loop until the username is correct
    while(true) {
    //Prompt the user to enter their Username
    System.out.print("Enter username :");
    LoginID = input.nextLine();
    
    //Show username results
    if
    (LoginID.contains("_") && LoginID.length() <= 5) {
        System.out.println("Username succesfully captured");
        break;
    }else{
        System.out.println("Username is not correctly formatted please ensure that your username contains \nan underscore(_) and is no more that five characters long.");
    }
    }
    
    //Loop until the password is correctly formatted
    while (true) {
    //Request the user to enter their password
    System.out.print("Enter password :");
    password = input.nextLine();
    
    //Display results of the user's password
    if (password.length() >=8){
        System.out.println("Password successfully captured");
        break;
    }else{
        System.out.println("Password is not correctly formatted please ensure that password contains at least \neight characters,a capital letter,a number and a special character.");
    }
    }
    
    //Loop until the phone number is correctly formatted
    while(true) {
    //Ask the user to enter user's phone number
    System.out.print("Enter phone number :+27");
    String Numberleft = input.nextLine();
    phone = "+27" + Numberleft ;
    
    //Display results of the phone number
    if (phone.startsWith("+27") && (phone.length ()-3) <=10){
        System.out.println("Cell phone number successfully added");
        break;
    }else{
        System.out.println("Cell phone is not correctly formatted or does not contain an international code(+27) please correct the number and try again.");
    }
    }
    
    //Login panel
    System.out.println("\n--- Login now ---");
    
    //Loop until the login is correct
    while (true) {
    //Ask  the user to enter their username
    System.out.print("Enter yor username :");
    String UserDetails = input.nextLine();
    
    //Ask the user to enter their password
    System.out.print("Enter your password :");
    String PasswordLogin = input.nextLine();
    
    //Display the user's login results
    if(UserDetails.equals(LoginID) && PasswordLogin.equals(password)){
        System.out.println("Welcome " + name1 + " " + name2  + " " + " , it is great to see you again!");
        break;
    }else{
        System.out.println("Username or password is incorrect please try again.");
    }
        
    }
    //Close the Scanner
    input.close();
    }
    
    //Boolean test to check whether the username is correctly formatted
    public boolean checkUsername(String LoginID){
        if
        (LoginID.contains("_") && LoginID.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }
    
    //Boolean test to check if the password is correctly formatted
    public boolean checkPasswordComplexity(String password){
        boolean UpperCase = false;
        boolean ContainsNum = false;
        boolean ContainsSpecChar = false;
        boolean TrueLength = false;
        
        if (password.length() >= 8) {
            TrueLength = true;
        }
        
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            
            if (currentChar >= 'A' && currentChar <= 'Z') {
                UpperCase = true;
            }
            if (currentChar >= '0' && currentChar <= '9') {
                ContainsNum = true;
            }
            if (!Character.isLetterOrDigit(currentChar)) {
                ContainsSpecChar = true;
            }
        }
        if (TrueLength == true && UpperCase == true &&
             ContainsNum == true && ContainsSpecChar == true) {
            return true;
         }else{
             return false;
             }
    } 
    
    //Boolean to check if the phone numberis correct
    public boolean checkCellPhoneNumber(String cellNumber){
        if(cellNumber.startsWith("+27") &&
            (cellNumber.length()-3) <= 10) {
                return true;
        } else {
                return false;
        }
    }        
    
    // Boolean method to check user registration panel
    public String registerUser(String username, String password) {
        if 
        (checkUsername(username) == false) {
            return "username is incorrectly formatted.";
        }
        if
        (checkPasswordComplexity(password) == false) {
            return "Password is incorrectly.";
        }
        return "Username correctly formatted.Password correctly formatted.";
    }
    
    //Boolean method to check the Login Panel
    public static boolean loginUser(String LoginID, String password, String storedLoginID, String storedPassword) {
        if(LoginID.equals(storedLoginID) && 
           password.equals(storedPassword)) {
           return true;
        } else {
            return false;
        }
    }

//Boolean method to check if login is successful or not
public static String returnLoginStatus(boolean loginSuccess, String name1, String name2){
    if 
    (loginSuccess == true) {
        return "Welcome " + name1 + " " + name2  + " " + " , it is great to see you again!";
    } else {
        return "Username or password is incorrect.";
    }
}
}    