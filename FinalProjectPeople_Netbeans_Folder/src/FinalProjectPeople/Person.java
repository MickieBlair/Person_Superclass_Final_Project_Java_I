//Mickie Blair
//Java I – CIST 2371
//Final Project - Person Class
//superclass

package FinalProjectPeople;

import javax.swing.JOptionPane;

public class Person 
{
    private String firstName;       //first name
    private String lastName;        //last name
    private String streetAddress;   //street address
    private int zipCode;            //zip code
    private String phoneNumber;     //phone number
    
    //set person data
    public void setPersonData()
    {
        firstName = JOptionPane.showInputDialog("Enter the First Name:");
        
        lastName = JOptionPane.showInputDialog("Enter the Last Name:");
        
        streetAddress = JOptionPane.showInputDialog("Enter the Street Address:");
        
        String input= JOptionPane.showInputDialog("Enter the ZipCode:");
        zipCode = Integer.parseInt(input);
        
        phoneNumber= JOptionPane.showInputDialog("Enter the Phone Number:"); 
    }
    
    //display results on a single line
    public void displayPersonData()
    {
        String fullName = firstName + " " + lastName;
        System.out.printf("\n%-20s", fullName);
        System.out.printf("%-25s", streetAddress);
        System.out.printf("%-12d", zipCode);
        System.out.printf("%-15s", phoneNumber);
    }
}
