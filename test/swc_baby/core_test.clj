(ns swc-baby.core-test
  (:require [clojure.test :refer :all]
            [swc-baby.core :refer :all]))

(defn roman [x]
  (loop [x x
         acc ""]
    (if (< x 4)
      (apply str acc (take x (repeat "I")))
      (if (= x 4)
        (str acc "IV")
        (recur (- x 5) (str acc "V"))))))

(deftest can-convert-decimal-to-roman
  (is (= "" (roman 0)))
  (is (= "I" (roman 1)))
  (is (= "II" (roman 2)))
  (is (= "IV" (roman 4)))
  (is (= "V" (roman 5)))
  (is (= "VI" (roman 6)))
  (is (= "VIII" (roman 8))))
