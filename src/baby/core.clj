(ns baby.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def conversion-table
  {1 "I"
   2 "II"
   4 "IV"})

(defn dec-to-roman [dec]
  (cond (= dec 0) ""
        :else (conversion-table dec)))

