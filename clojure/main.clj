(ns sorting (:use clojure.pprint))

(load-file "./bubblesort/sort.clj")
(load-file "./quicksort/sort.clj")

(pprint (bubble-sort (list 3 4 2 5 7 1 9 8 6 0)))

(pprint (quick-sort (list 3 4 2 5 7 1 9 8 6 0)))