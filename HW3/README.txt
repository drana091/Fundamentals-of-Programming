README.txt
==========================
Name: Dhruv Rana
Class: CSIT313_01FA23
Professor: Professor Robila
Date: 10/17/2023
===========================
The is the README file for HW3 Questions. Please read this file to 
understand what files the zip folder 'CSIT313HW3Rana.zip' holds and the function
of each file.
===========================
Text answers to Questions A1, A2, A3, and essay portion for Question B is in the file
'CSIT313HW3Rana.docx' 

---------------------------
Question A1:

For question A1, this zip folder contains two program files, one Java and one 
Python, titled 'javaCaseSensitivity.java' and 'pythonCaseSensitivity.py', 
respectively.

The file 'javaCaseSensitivity.java' demonstrates case sensitivity of 
identifiers in Java. The file 'pythonCaseSensitivity.py' demonstrates case 
sensitivity of identifiers in Python.

The file 'javaCaseSensitivity.java' contains an indicator comment in "Part 2"
"//UNCOMMENT THE LINE BELOW TO TEST". By uncommenting the code line below the indicator
comment (code line below) you can test on your own what happens when a reserved word is
 used as an identifier and compare that output with file 'pythonCaseSensitivity.py' 
output for "Part 2". This was done as running the program file without commenting the 
code line leads to an error (errors listed below).

+++++++++++++++++++++++++
Java code line: int int = 5;

Java error message: 
./javaCaseSensitivity.java:24: error: not a statement
    int int = 5;
    ^
./javaCaseSensitivity.java:24: error: ';' expected
    int int = 5;
       ^
./javaCaseSensitivity.java:24: error: not a statement
    int int = 5;
        ^
./javaCaseSensitivity.java:24: error: ';' expected
    int int = 5;

---------------------------
Question B:

For question B, this zip folder contains three program files, one Java, one C,
and one C++, titled 'scopeJava.java', 'scopeC.c', and 'scopeCPP.cpp', respectively.

The files 'scopeJava.java', 'scopeC.c, and 'scopeCPP.cpp' determine the scope of 
a variable declared in a for-statement, and whether such a variable is visible after 
the body of the for-statement in three different programming languages.

The files 'scopeJava.java', 'scopeC.c, and 'scopeCPP.cpp' all contain an indicator 
comment "//UNCOMMENT THE LINE BELOW TO TEST:Uncomment the line below to test if the 
variable 'number' is visible outside the body of the for-loop". By uncommenting the
code line below indicator comment (code lines are listed below), 
you can test on your own if the variable 'number' is visible outside the body of the 
for-loop. This was done as running the program files without commenting the code line 
leads to an error (errors listed below).

+++++++++++++++++++++++++
Java code line: System.out.println("Prints 'number' outside for-loop: " + number); 
C code line: printf("Prints 'number' outside for-loop: %d", number);
C++ code line: std::cout << "Prints 'number' outside for-loop: " << number << std::endl;

Java error message:
./Main.java:20: error: cannot find symbol
    System.out.println("Prints 'number' outside for-loop: " + number); 
                                                              ^
  symbol:   variable number
  location: class scopeJava

C error message:
./scopeC.c:21:50: error: use of undeclared identifier 'number'
  printf("Prints 'number' outside for-loop: %d", number);

C++ error message:
./scopeCPP.cpp:22:56: error: use of undeclared identifier 'number'
  std::cout << "Prints 'number' outside for-loop: " << number << std::endl;

==========================
Running the files:
1) You can use an online Python and Java compiler or IDE like Replit.com
   to run the files for Question A1, and use an online Java, C, and C++ compiler or 
   IDE like Replit.com to run the files for Questions B.

2) If you are using a Unix shell and are importing the files into the Unix shell, 
   make sure to change permissions (using Chmod 4755 'filename'), if needed, 
   so that you can compile and run the files. 

3) Run the files.

4) For file 'javaCaseSensitivity.java', after the first run, make sure to uncomment 
   the code line under the indicator comment "//UNCOMMENT THE LINE BELOW TO TEST" 
   and the file again.

5) For files 'scopeJava.java', 'scopeC.c, and 'scopeCPP.cpp', after the first run, make
   sure to uncomment the code line under the indicator comment "//UNCOMMENT THE LINE 
   BELOW TO TEST:Uncomment the line below to test if the variable 'number' is visible 
   outside the body of the for-loop" and run the files again.

6) The program files will end. 