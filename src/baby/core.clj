(ns baby.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def conversion-table
  {1 "I"
   4 "IV"})

(defn find-lowest-key [dec]
  (apply max (filter #(<= % dec) (keys conversion-table))))

(defn dec-to-roman [dec]
  (if (<= dec 0)
    ""
    (let [lowest (find-lowest-key dec)]
      (or (conversion-table dec)
        "II"))))

