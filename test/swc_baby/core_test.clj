(ns swc-baby.core-test
  (:require [clojure.test :refer :all]
            [swc-baby.core :refer :all]))

(defn roman [x]
  (if (or (= x 5)
          (> x 5))
    (str "V" (roman (- x 5)))
    (if (= x 4)
      "IV"
      (apply str (take x (repeat "I"))))))

(deftest can-convert-decimal-to-roman
  (is (= "" (roman 0)))
  (is (= "I" (roman 1)))
  (is (= "II" (roman 2)))
  (is (= "IV" (roman 4)))
  (is (= "V" (roman 5)))
  (is (= "VI" (roman 6)))
  (is (= "VIII" (roman 8))))
