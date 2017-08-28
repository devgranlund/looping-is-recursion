(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc expn]
                 (if (zero? expn)
                   acc
                   (recur (* acc base) (- expn 1))))]
    (helper 1 exp)
  ))

(defn last-element [a-seq]
  ":(")

(defn seq= [seq1 seq2]
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

