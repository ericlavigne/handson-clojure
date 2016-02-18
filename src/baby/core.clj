(ns baby.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def conversion-table
  {1 "I"
   4 "IV"
   5 "V"
   9 "IX"
   10 "X"
   40 "XL"})

(defn find-lowest-key [dec]
  (apply max (filter #(<= % dec) (keys conversion-table))))

(defn dec-to-roman
 ([dec] (dec-to-roman dec ""))
 ([dec acc]
  (if (<= dec 0)
    acc
    (let [lowest (find-lowest-key dec)
          converted (conversion-table lowest)]
      (recur (- dec lowest) (str acc converted))))))

