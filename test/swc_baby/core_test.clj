(ns swc-baby.core-test
  (:require [clojure.test :refer :all]
            [swc-baby.core :refer :all]))

(def d [[40 "XL"]
        [10 "X"]
        [9 "IX"]
        [5 "V"]
        [4 "IV"]
        [1 "I"]])

(defn roman [x]
  (loop [x x
         acc ""]
    (if (= x 0)
      acc
      (let [[d r] (first (filter (fn [e] (>= x (first e))) d))
            q (quot x d)
            remainder (- x (* q d))]
        (recur remainder (apply str acc (take q (repeat r))))))))

(deftest can-convert-decimal-to-roman
  (is (= "" (roman 0)))
  (is (= "I" (roman 1)))
  (is (= "II" (roman 2)))
  (is (= "IV" (roman 4)))
  (is (= "V" (roman 5)))
  (is (= "IX" (roman 9)))
  (is (= "X" (roman 10)))

  (is (= "VIII" (roman 8)))

  (is (= "XXXVIII" (roman 38)))
  (is (= "XXXIX" (roman 39)))
  (is (= "XLIX" (roman 49)))
  )
