/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW5 Task 1a 
  Date: 11/28/2023
  Description: To better understand selection statements through the use of if-else statements, 
               determine to which if-statement the else is associated with in Java.
*/

public class Task1a {
    public static void main(String args[]) {
        
        int x = 3;
        
        //The first if-statement condition is true, executes the print statement.
        if(x > 2)
            System.out.println("Prints First IF");
        if(x == 2)
            System.out.println("Prints Second IF");
            
        //Else statement is executed along with the first if-statement.
        else
            System.out.println("Prints Else");
         //This means the else is associated with the second if-statement, the nearest if-statement.

     
    }
}