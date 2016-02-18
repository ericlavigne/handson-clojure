(ns baby.core-test
  (:require [clojure.test :refer :all]
            [baby.core :refer :all]))

(deftest a-test
  (testing "Adding numbers"
    (is (= 1 1))))

(deftest simple-conversions
  (testing "convert some numbers"
    (is (= "I" (dec-to-roman 1)))
    (is (= "II" (dec-to-roman 2)))
    (is (= "IV" (dec-to-roman 4)))
    (is (= "VII" (dec-to-roman 7)))
  ))

