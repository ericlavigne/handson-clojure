(ns baby.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def conversion-table
  {1 "I"
   4 "IV"
   5 "V"})

(defn dec-to-roman [dec]
  (cond
    (= 0 dec) ""
    (< dec 0) (str (dec-to-roman dec))
    :else  (let [conversion-key (apply max (filter #(<= % dec) (keys conversion-table)))]
             (str (conversion-table conversion-key)
                  (dec-to-roman (- dec conversion-key))))))

