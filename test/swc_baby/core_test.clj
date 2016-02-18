(ns swc-baby.core-test
  (:require [clojure.test :refer :all]
            [swc-baby.core :refer :all]))

(defn roman [x]
  (apply str (take x (repeat "I"))))

(deftest can-convert-decimal-to-roman
  (is (= "" (roman 0)))
  (is (= "I" (roman 1)))
  (is (= "II" (roman 2)))
  (is (= "IV" (roman 4))))
