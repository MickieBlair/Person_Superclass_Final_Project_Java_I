//Mickie Blair
//Java I – CIST 2371
//Final Project - Student Class 
//extends from person (subclass)

package FinalProjectPeople;

import javax.swing.JOptionPane;

public class Student extends Person
{
    private String major;       //students major
    private double gpa;         //students GPA
    private static int sCount;   //count of students
    
    //set person data with a method to override Person Class method
    @Override
    public void setPersonData()
    {
        super.setPersonData();
        
        major = JOptionPane.showInputDialog("Enter the Student's Major:");
               
        String input= JOptionPane.showInputDialog("Enter the Student's GPA:");
        gpa = Double.parseDouble(input);
        
        sCount++;
    }   
    
     /**
     * 
     * @return Student Count
     */
    public int getSCount()
    {
        return sCount;
    }
    
     //display results with a method to override Person Class method
    @Override
    public void displayPersonData()
    {
        super.displayPersonData();
        
        System.out.printf("%-15s", major);
        System.out.printf("%-10.2f", gpa);
     }
}
