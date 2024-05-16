/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW5 Task 2b 
  Date: 11/28/2023
  Description: To better understand short-circuit evaluation, a program is created to enforce full evaluation in Java.
*/

public class Task2b {
    public static void main(String args[]) {
        
        int x = 1;
        
        //Boolean variable check with the value true to access full evaluation.
        boolean check = true;
        
        //This time the first and second conditions of the if statement will be assessed as an "AND" operator is used. 
        if(check == true && x > 2){
            System.out.println("Prints First IF");
            if(x < 0)
                System.out.println("Prints Second IF");
        }
        else
            System.out.println("Prints Else");
     
    }
}