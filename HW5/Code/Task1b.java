/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW5 Task 1b 
  Date: 11/28/2023
  Description: To better understand selection statements through the use of if-else statements, 
               associate the else statement to the other if-statement in Java.
*/

public class Task1b {
    public static void main(String args[]) {
        
        int x = 3;
        
        //The first if-statement is false so print statement is not executed.
        if(x == 2) 
            System.out.println("Prints First IF");
        //Else statement is executed.
        else
            System.out.println("Prints Else");
        //This means the else is now associated with the first if-statement.
         
        //The second if-statement is true so print statment is executed.
        if(x > 2)
            System.out.println("Prints Second IF");
        
    
    }
}