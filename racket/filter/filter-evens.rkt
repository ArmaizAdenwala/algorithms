#lang racket ;

; This function recusively removes all evens from a list

(define (filter-evens xs)
  (cond
    ((empty? xs)'())
    ((even? (first xs)) (filter-evens (rest xs)))
    (else (cons (first xs) (filter-evens (rest xs))))
  )
)
(filter-evens '(1 2 3 4 5 6 7 8 9 0))
(filter-evens '(1 1 3 3 5 7 9 13 29))
(filter-evens '(2))
(filter-evens '())
