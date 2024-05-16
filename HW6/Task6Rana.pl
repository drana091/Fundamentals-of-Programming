%Name: Dhruv Rana
%Class: CSIT313_01FA23
%Assignment: HW6 - Part A Questions 1 and 2
%Date: 12/08/2023
%Description: 
%	Question 1: Write a Prolog program that returns the final element of a given list.
%	Question 2: Write a Prolog program that finds the maximum in a given list of numbers.


% Question 1:
% If the list has only one element, that element is the last element.
final_element([X], X).

% Recursively removes the head of the list until only one element is left.
final_element([_|T], X) :-
    final_element(T, X).


% Question 2:
% If the list has only one element, that element is the maximum element.
max_num([X],X).

% Recursively compares the head (first) element in the list with the 
% maximum element from the tail element (other elements) in the list.
max_num([X|Y],X):- max_num(Y,Z), X >= Z.
max_num([X|Y],A):- max_num(Y,A), A > X.
