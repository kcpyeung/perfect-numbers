(ns perfect-numbers)

(defn factors-of [n]
  (filter #(= 0 (rem n %)) (range 1 n)))

(defn classify [n]
  (if (< n 0) (throw (IllegalArgumentException. ))
    (let [aliquot-sum (reduce + (factors-of n))]
      (cond
       (> aliquot-sum n) :abundant
       (< aliquot-sum n) :deficient
       :else :perfect))))

