(ns baby.core)

(def conversion-table
  {1 "I"
   4 "IV"
   5 "V"
   9 "IX"
   10 "X"
   40 "XL"
   50 "L"
   90 "XC"
   100 "C"
   400 "CD"
   500 "D"
   900 "CM"
   1000 "M"})

(defn select-smaller-numbers [maximum numbers]
  (filter #(<= % maximum) numbers))

(defn dec-to-roman [dec]
  (cond
    (= 0 dec) ""
    (< dec 0) (str "-"
                   (dec-to-roman (- dec)))
    :else  (let [conversion-key (apply max (filter #(<= % dec) (keys conversion-table)))]
             (str (conversion-table conversion-key)
                  (dec-to-roman (- dec conversion-key))))))

