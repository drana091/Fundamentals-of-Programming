/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW5 Task 2a 
  Date: 11/28/2023
  Description: To better understand short-circuit evaluation, a program is created to dememstrate short-circuit evaluation in Java.
*/

public class Task2a {
    public static void main(String args[]) {
        
        int x = 1;
        
        //Boolean variable check with the value true to access short-circuit evaluation.
        boolean check = true;
        
        //The second condition of the if statement will not be executed as the first condition is already true because an "OR" operator is used.
        if(check == true || x > 2){
            System.out.println("Prints First IF");
        if(x < 0)
            System.out.println("Prints Second IF");
        }
        else
            System.out.println("Prints Else");
     
    }
}