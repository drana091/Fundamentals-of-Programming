/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW5 Task 3a 
  Date: 11/28/2023
  Description: To better understand goto statement, create a program to find the first 
               row of an n by n integer matrix named x that has all zero values without using goto in Java.
*/

public class Task3 {
    public static void main(String[] args) {
        
        //Hard coded 3 by 3 martix x.
        int[][] x = {
            {1, 2, 3},
            {0, 5, 0},
            {0, 0, 0}
        };
        
        //Number of rows.
        int n = 3;
        
        //Traverse the matrix using for-loops.
        for (int i = 0; i < n; i++) {
            //Boolean variable found is set to true at each row.
            boolean found = true;
            for (int j = 0; j < n; j++) {
                
                //Assess if 0 is not in the matrix cells.
                if (x[i][j] != 0){
                    //Variable found is set to false if 0 is not in the matrix.
                    found = false;
                    break;
                }
            }
            //If the varible found is true, print the row number.
            if (found) {
                System.out.println("First all­zero row is: "+ (i + 1));
                break;
            }
        }
    }
}