(ns swc-baby.core-test
  (:require [clojure.test :refer :all]
            [swc-baby.core :refer :all]))

(def dict [[9 "IX"]
           [5 "V"]
           [4 "IV"]])

(defn roman [x]
  (loop [x x
         acc ""]
    (let [entry (first (filter #(<= (first %) x) dict))]
      (if-not entry
        (apply str acc (take x (repeat "I")))
        (recur (- x (first entry)) (str acc (second entry)))))))

(deftest can-convert-decimal-to-roman
  (is (= "" (roman 0)))
  (is (= "I" (roman 1)))
  (is (= "II" (roman 2)))
  (is (= "IV" (roman 4)))
  (is (= "V" (roman 5)))
  (is (= "VI" (roman 6)))
  (is (= "VIII" (roman 8)))
  (is (= "IX" (roman 9))))
