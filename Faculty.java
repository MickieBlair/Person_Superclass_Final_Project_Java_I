//Mickie Blair
//Java I – CIST 2371
//Final Project - Faculty Class 
//extends from CollegeEmployee (subclass)

package FinalProjectPeople;

import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee
{
    private boolean tenured;        //boolean for tenure state (true = Yes)
    private static int fCount;       //count of faculty
    
    //set faculty data with a method to override Person Class/College Employee method
    @Override
    public void setPersonData()
    {
        super.setPersonData();
        String input = JOptionPane.showInputDialog("Is the Faculty member tenured?"
                                + "(Enter Y or N)");
        
        input = input.toUpperCase();
        
        while (!input.equals("Y") && !input.equals("N"))
        {
            
            
            input = JOptionPane.showInputDialog("Invalid Response. Try Again.\n"
                    + "Is the Faculty member tenured?"
                                + "(Enter Y or N)");
        
            input = input.toUpperCase();
        }
        
        if (input.equals("Y"))
            {
                tenured = true;
            }

            if (input.equals("N"))
            {
                tenured = false;
            }
        fCount++;
    }
    
    /**
     * 
     * @return Faculty Count
     */
    public int getFCount()
    {
        return fCount;
    }
    
    //display results with a method to override Person Class/College Employee method
    @Override
    public void displayPersonData()
    {
        super.displayPersonData();
        
        if (tenured)
                {
                    System.out.printf("%-10s", "YES");
                }
        else
                {
                    System.out.printf("%-10s", "NO");
                }
    }
}
