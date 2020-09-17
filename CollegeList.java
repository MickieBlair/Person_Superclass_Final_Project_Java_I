//Mickie Blair
//Java I – CIST 2371
//Final Project - College List Class 

package FinalProjectPeople;

import javax.swing.JOptionPane;

public class CollegeList 
{
    public static void main(String []args)
    {
        String menuChoice ="";          //to hold user choice
        final int NUM_EMPLOYEES = 4;    //constant for number of college Employees
        final int NUM_FACULTY = 3;    //constant for number of college Employees
        final int NUM_STUDENTS = 7;    //constant for number of college Employees
        int employeeCounter = 0;            //college employee counter
        int facultyCounter = 0;             //faculty counter
        int studentCounter = 0;             //student counter

        //Declare an array of four regular College employees
        CollegeEmployee[] collegeEmployeeArray = new CollegeEmployee[NUM_EMPLOYEES];
        
        //Declare an array of three faculty
        Faculty[] facultyArray = new Faculty[NUM_FACULTY];
        
        //Declare an array of seven students
        Student[] studentArray = new Student[NUM_STUDENTS];
        
        //loop to ask the user which type of person they would like to enter
        while (!menuChoice.equalsIgnoreCase("Q"))
        {
            String input = JOptionPane.showInputDialog("Data Entry Program\n\n" 
                + "College Employee (Enter C)\n"
                + "Faculty (Enter F)\n"
                + "Student (Enter S)\n"
                + "To Quit Data Entry and Print Report(Enter Q)\n\n"
                + "Enter Selection:");
            
            menuChoice=input.toUpperCase();
            
            //switch statment for adding
            switch (menuChoice)
            {
                case "C": {
                            //if less than allowed create new object
                            if (employeeCounter < NUM_EMPLOYEES)
                            {
                                CollegeEmployee employee = new CollegeEmployee();
                                
                                employee.setPersonData();
                                
                                collegeEmployeeArray[employeeCounter] = employee;

                                employeeCounter = employee.getEmpCount();
                            }
                            
                            else
                            {
                                JOptionPane.showMessageDialog(null, "The number"
                                + " of College Employees has reached the "
                                + "maximum. Please Enter a different choice.");
                            }
                          }
                    break;
                
                case "F": {
                            //if less than allowed create new object
                            if (facultyCounter < NUM_FACULTY)
                            {
                                Faculty collegeFaculty = new Faculty();
                                collegeFaculty.setPersonData();
                                
                                facultyArray[facultyCounter] = collegeFaculty;

                                facultyCounter = collegeFaculty.getFCount();
                            }
                            
                            else
                            {
                                JOptionPane.showMessageDialog(null, "The number"
                                + " of Faculty has reached the "
                                + "maximum. Please Enter a different choice.");
                            }
                          }
                    break;
                    
                case "S": {
                            //if less than allowed create new object
                            if (studentCounter < NUM_STUDENTS)
                            {
                                Student collegeStudent = new Student();
                                collegeStudent.setPersonData();

                                studentArray[studentCounter] = collegeStudent;

                                studentCounter = collegeStudent.getSCount();
                            }

                            else
                            {
                                JOptionPane.showMessageDialog(null, "The number"
                                + " of Students has reached the "
                                + "maximum. Please Enter a different choice.");
                            }
                          }
                    break;
                    
                case"Q":{
                            //display report if the user quits
                            JOptionPane.showMessageDialog(null, "Data Entry "
                            + "Complete \n\n"
                            + "College List Report will be displayed.");
                        }
                    break;
                
                default:{
                            //display message if choice is invalid
                            JOptionPane.showMessageDialog(null, "The selection"
                            + " entered is invalid.\n\n"
                            + "Please Enter a valid menu choice.");
                        }
              
            }               
                
              
            //display report    
            if (menuChoice.equals("Q"))
            {
                //header for report
                System.out.println("\nCOLLEGE LIST REPORT");
                
                //display the college employees
                System.out.println("--------------------------------------------"
                        + "-----------------------------------------------------"
                        + "-----------------------------------------------------");

                System.out.println("College Employees\n");
                
                System.out.printf("%-20s%-25s%-12s%-15s%-15s%-17s%-15s",
                        "Name", "Street Address", "Zip Code", "Phone Number", 
                        "SSN", "Annual Salary", "Department");
                
                //if less than needed
                if (employeeCounter < NUM_EMPLOYEES)
                {

                    for ( int index = 0; index < employeeCounter; index++)
                    {
                        collegeEmployeeArray[index].displayPersonData();
                    } 

                    System.out.printf("\n\n%d of %d College Employees have been "
                            + "entered.\n", employeeCounter, NUM_EMPLOYEES);
                }
                
                //display all    
                else
                {
                    for ( int index = 0; index < employeeCounter; index++)
                    {
                        collegeEmployeeArray[index].displayPersonData();
                    } 
                }

                System.out.println();
                
                //display the faculty
                System.out.println("--------------------------------------------"
                        + "-----------------------------------------------------"
                        + "-----------------------------------------------------");

                System.out.println("Faculty\n");

                System.out.printf("%-20s%-25s%-12s%-15s%-15s%-17s%-15s%-10s",
                        "Name", "Street Address", "Zip Code", "Phone Number", 
                        "SSN", "Annual Salary", "Department", "Tenured");

                if (facultyCounter < NUM_FACULTY)
                {

                    for ( int index = 0; index < facultyCounter; index++)
                    {
                        facultyArray[index].displayPersonData();
                    } 

                    System.out.printf("\n\n%d of %d Faculty have been "
                            + "entered.\n", facultyCounter, NUM_FACULTY);
                }

                else
                {
                    for ( int index = 0; index < facultyCounter; index++)
                    {
                        facultyArray[index].displayPersonData();
                    } 
                }

                System.out.println();
                
                //display the students
                System.out.println("--------------------------------------------"
                        + "-----------------------------------------------------"
                        + "-----------------------------------------------------");

                System.out.println("Students\n");

                System.out.printf("%-20s%-25s%-12s%-15s%-15s%-10s",
                        "Name", "Street Address", "Zip Code", "Phone Number", 
                        "Major", "GPA");

                if (studentCounter < NUM_STUDENTS)
                {

                    for ( int index = 0; index < studentCounter; index++)
                    {
                        studentArray[index].displayPersonData();
                    } 

                    System.out.printf("\n\n%d of %d Students have been "
                            + "entered.\n", studentCounter, NUM_STUDENTS);
                }

                else
                {
                    for ( int index = 0; index < facultyCounter; index++)
                    {
                        studentArray[index].displayPersonData();
                    } 
                }

                System.out.println();
            }
     
        }
       
    }
        
}
   


