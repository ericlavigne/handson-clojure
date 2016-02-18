(ns baby.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def conversion-table
  {1 "I"
   2 "II"
   4 "IV"
   5 "V"
   7 "VII"})

(defn dec-to-roman [dec]
  (let [conversion-key (apply max (filter #(<= % dec) (keys conversion-table)))]
    (cond
      (= 0 dec) ""
      (< dec 0) (str (dec-to-roman dec))
      (= conversion-key dec) (conversion-table conversion-key)
      :else (conversion-table conversion-key))))

