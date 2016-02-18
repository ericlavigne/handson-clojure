(ns swc-baby.core-test
  (:require [clojure.test :refer :all]
            [swc-baby.core :refer :all]))

(defn roman [x]
  (if (not (= 0 x))
    "I"
    ""))

(deftest can-convert-decimal-to-roman
  (is (= "" (roman 0)))
  (is (= "I" (roman 1))))
