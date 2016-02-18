(ns baby.core-test
  (:require [clojure.test :refer :all]
            [baby.core :refer :all]))

(deftest a-test
  (testing "Adding numbers"
    (is (= 1 1))))

(deftest one-test
  (testing "convert 1 to roman"
    (is (= "I" (dec-to-roman 1)))))

(deftest two-test
  (testing "convert 2 to roman"
    (is (= "II" (dec-to-roman 2)))))

(deftest four-case
  (testing "convert 4 to roman"
    (is (= "IV" (dec-to-roman 4)))))

(deftest thirty-six-test
  (testing "convert 36 to roman"
    (is (= "XXXVI" (dec-to-roman 36)))))

