/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW5 Task 3b 
  Date: 11/28/2023
  Description: To better understand goto statement, create a program to find the first row of an n by n integer matrix named x that has all zero values without using goto in Java.
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(void) {

  //Hard coded 3 by 3 martix x.
  int x [3][3] = 
      {
          {1, 2, 3},
          {0, 1, 0},
          {0, 0, 0}
      };

      //Number of rows.
      int n = 3;

      //Traverse the matrix using for-loops.
      for (int i = 0; i < n; i++) {
        //Boolean variable found is set to true at each row.
        bool found = true;
        for (int j = 0; j < n; j++) {
          //Assess if 0 is not in the matrix cells.
          if (x[i][j] != 0) {  
            //Variable found is set to false if 0 is not in the matrix.
            found = false;
            break;
          }
        }
        //If the varible found is true, print the row number.
        if (found) {
          printf("First all zero row is: %d", (i + 1));
          break;
        }
    }
 }