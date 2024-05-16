#lang racket
;Name: Dhruv Rana
;Class: CSIT313_01FA23
;Assignment: HW4 Questions 1-4
;Date: 11/14/2023
;Description: To create functions in a functional progamming language, Racket. 


;Questin 1: Function 'delall'
(define (delall value mylist)
  (cond
    ((null? mylist) empty) ;Checks if the list is empty; if so returns the empty list
    ((list? mylist)        ;Checks if the list is a list if so:
     (if (equal? value (car mylist)) ;Checks is the atom is equal to the first element of the list
         (delall value (cdr mylist)) ;If so, recursively calls the function 'dedall' to remove the top element from the list, and continue to the next element in the list
         (cons (car mylist) (delall value (cdr mylist)))) ;Else, keeps the first element, and continue to the next element in the list
     )
    )
  )

;Question 2: Function 'getextremes'
(define (getextremes mylist)
  (cond
    ((null? mylist) empty) ;Checks if the list is empty, if so returnn a empty list
    ((null? (cdr mylist)) ;Checks if list is of only one element
     (list (car mylist))) ;Returns the list as is
    (else
     (list (apply max mylist) (apply min mylist)) ;Returns the maximum and minimum numbers in a list format from the list by applying the max and min functions.
     )
    )
  )

;Question 3: Function 'unite'
(define (unite mylist1 mylist2)
  (cond
     ((null? mylist1) mylist2) ;Checks if the first list is empty, if so, return the second list
     ((null? mylist2) mylist1) ;Checks if the second list is empty, if so, return the first list
     (else
      (if (member (car mylist1) mylist2) ;Checks if the first element in the first list is found in the second list
          (unite (cdr mylist1) mylist2) ;If so, recursively calls the function 'unite' to remove the first element from the first list, and continues to traverse the first list
          (cons (car mylist1) (unite (cdr mylist1) mylist2)))) ;Else, 
     )
  )


;Question 4: Function 'checkset'
(define (checkset mylist)
    (cond
      ((null? mylist)#t) ;Checks if the list is empty, if so, return true (#t) as no duplicates are found
      (else
       (not(check-duplicates mylist))) ;Checks if there are no duplicates in the list using the not function with the check-duplicates function
      )

    )