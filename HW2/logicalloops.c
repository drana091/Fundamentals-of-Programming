/*Name: Dhruv Rana
  Class: CSIT313_01FA23
  Assignment: HW2 Question 4
  Date: 09/26/2023
  Description: To better understand counting loops, this program is an counter example using logical loops, multiplying two hardcorded 4 by 4 matrices using while-loops.
*/

#include <stdio.h>
#include <stdlib.h>

//Global variables that hold the rows and columns of my matrices 
int rowA = 4, colA = 4, rowB = 4, colB = 4; 

//The function that multiplies Matrix A and Matrix B using logical loops and stores the product in a resulting Matrix C and prints the resulting matrix.
void multMat(int matA[rowA][colA], int matB[rowB][colB])
{
	//Creates Matrix C consisting the number of rows from Matrix A and the nuumber of columns from Matrix B.
  int matC[rowA][colB];

  
	printf("Multiplication of the two matrices by logical loops is:\n");
  printf("-----Matrix C-----\n");
  int i = 0, j = 0, k = 0;
  
  //Multiplies Matrix A and Matrix B using while-loops.      
  while(i < rowA) {
    j = 0;
    while(j < colB) {
			k = 0;
      //Makes Matrix C a 4 x 4 zero matrix.
      matC[i][j] = 0;
			
      //Multiplies the elements in the rows of Matrix A by the elements in the columns of Matrix B and storing the product in matrix Matrix C. 
      while(k < rowB) {
				matC[i][j] += matA[i][k] * matB[k][j];
        k++;
      }
      //Prints Matrix C
      printf("%d\t", matC[i][j]);
      j++;
		}
    printf("\n");
    i++;
	}
}

// The main function that holds Matrix A and Matrix B, and the function call multMat() to multiply Matrix A and Matrix B. 
int main()
{
  //Matrix A
  int matA[4][4] = { { 1, 1, 4, 5 },
						         { 2, 2, 3, 3 },
                     { 3, 5, 6, 6 },
                     { 4, 6, 7, 8 } };
  //Matrix B
	int matB[4][4] = { { 1, 1, 4, 5 },
						         { 2, 2, 3, 3 },
                     { 3, 5, 6, 6 },
                     { 4, 6, 7, 8 } };

  //Prints Matrix A.
  printf("-----Matrix A-----\n");
  for(int i = 0; i < rowA; i++){
    for(int j = 0; j < colA; j++){
      printf("%d\t", matA[i][j]);
    }
  	printf("\n");
  }
  //Prints Matrix B.
  printf("-----Matrix B-----\n");
  for(int i = 0; i < rowB; i++){
    for(int j = 0; j < colB; j++){
      printf("%d\t", matB[i][j]);
    }
  	printf("\n");
  }
  printf("------------------\n");

  //Calls the function mutMat to multiple Matrix A and Matrix B.
  multMat(matA, matB);
  
  return 0;

}