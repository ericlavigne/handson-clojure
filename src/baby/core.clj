(ns baby.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn dec-to-roman [dec]
  (if (= dec 1)
    "I"
    "II"))

