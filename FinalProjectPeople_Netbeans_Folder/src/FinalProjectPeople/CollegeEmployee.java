//Mickie Blair
//Java I – CIST 2371
//Final Project - College Employee Class 
//extends from person(subclass)

package FinalProjectPeople;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person
{
    private String socialSecurityNumber;    //social security number
    private double annualSalary;            //annual salary
    private String deptName;                //deparment name
    private static int empCount = 0;            //count of college Employees
    
    //set college employee data with a method to override Person Class method
    @Override
    public void setPersonData()
    {
        super.setPersonData();
        
        socialSecurityNumber = JOptionPane.showInputDialog("Enter the "
                                + "Employees's Social Security Number");
        
        String input= JOptionPane.showInputDialog("Enter the Employees's Annual"
                + " Salary:");
        annualSalary = Double.parseDouble(input);
        
        deptName = JOptionPane.showInputDialog("Enter the Employee's Department"
                                + " Name");
        
        empCount++;
    }
    
    /**
     * 
     * @return Employee Count
     */
    public int getEmpCount()
    {
        return empCount;
    }
    
    //display results with a method to override Person Class method
    @Override
    public void displayPersonData()
    {
        super.displayPersonData();
        
        System.out.printf("%-15s", socialSecurityNumber);
        System.out.printf("$ %-15.2f", annualSalary);
        System.out.printf("%-15s", deptName);
    }
}
