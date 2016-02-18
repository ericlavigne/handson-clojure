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

(deftest fifty-test
  (testing "convert 50 to roman"
    (is (= "L" (dec-to-roman 50)))))

(deftest ninety-test
  (testing "convert 90 to roman"
    (is (= "XC" (dec-to-roman 90)))))

(deftest hard-test
  (testing "the hard example"
    (is (= "MCMXCVI" (dec-to-roman 1996)))))

(deftest neg-test
  (testing "negatives"
    (is (= "-I" (dec-to-roman -1)))))

