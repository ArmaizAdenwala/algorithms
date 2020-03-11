#lang racket ;

; This function recursively multiplies each item in a list by a multiplier

(define (map-multiply xs multiplier)
  (if (empty? xs)
    '()
    (cons
      (* (first xs) multiplier)
      (map-multiply (rest xs) multiplier)
    )
  )
)

"Multiply by 2"
(map-multiply '(1 2 3 4 5 6) 2)
"Divide by 2"
(map-multiply '(1 2 3 4 5 6) 0.5)
