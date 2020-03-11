#lang racket ;

; This function recusively removes all odds from a list

(define (filter-odds xs)
  (cond
    ((empty? xs)'())
    ((odd? (first xs)) (filter-odds (rest xs)))
    (else (cons (first xs) (filter-odds (rest xs))))
  )
)
(filter-odds '(1 2 3 4 5 6 7 8 9 0))
(filter-odds '(1 1 3 3 5 7 9 13 29))
(filter-odds '(2))
(filter-odds '())
