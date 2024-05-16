//Name: Dhruv Rana
//Class: CSIT313_01FA23
//Assignment: HW3 Question A1
//Date: 10/17/2023
//Description: To demonstrate case sensitivity of identifiers in Java.

public class javaCaseSensitivity {
  public static void main(String[] args) {

    //PART 1::******************************
    //Creates variable 'inch' and 'INCH', and assigns two different values to each.
    int inch = 12;
    int INCH = 4;
    //Printing 'inch' and 'INCH' gives two different outputs.
    System.out.println("inch: " + inch);
    System.out.println("INCH: " + INCH);
    //This shows that variables 'inch' and 'INCH' are two different cases, and that variables in Java are case-sensitve.


    //PART 2::******************************
    //int, double, and float, are some examples of reserved words in Java. They cannot be used as variable names, class names, or any other identifiers.
    
    //UNCOMMENT THE LINE BELOW TO TEST
    int int = 5;
    //The above declared variable leads to an error stating that 'int int = 5;' is not a statement. This means you cannot use 'int' as an identifier.

    
    //PART 3::******************************
    //Creates variable, 'height' of type double, declaring the variable type before assigning the value.
    double height = 53.2;
    //Prints 'height'
    System.out.println("height: " + height);
    //This shows that in Java, variable type must be explicitly declared when creating a variable and before assigning a value to a variable.

  }
}