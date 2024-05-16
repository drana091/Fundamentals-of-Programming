//Name: Dhruv Rana
//Class: CSIT313_01FA23
//Assignment: HW3 Question B
//Date: 10/17/2023
//Description: To determine in C++, the scope of a variable declared in a for statement, and whether such a variable is visible after the body of the for-statement.

#include <iostream>
using namespace std;

int main(void) {

  for (int i = 0; i < 3; i++) {

    //Variable 'number' is declared within the for-loop
    int number = 5;
    
    //Prints the value of 'number' to determine whether if 'number' is within the scope of the for-loop.
    std::cout << "Prints 'number' inside for-loop: " << number << std::endl;
  }

  //UNCOMMENT THE LINE BELOW TO TEST:Uncomment the line below to test if the variable 'number' is visible outside the body of the for-loop
  //std::cout << "Prints 'number' outside for-loop: " << number << std::endl;

  //RESULT: Variable 'number' is only visible within the for-loop and not outside the for-loop.
}