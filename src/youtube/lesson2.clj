(ns youtube.lesson2
    (:require [youtube.core :as core]))

(defn add-transaction
    [real-transactions new-transaction]
    (conj real-transactions new-transaction))

(defn main
    [real-transactions]
    (->>
        (core/create-transaction "sale" 9000.)
        (add-transaction real-transactions)
        (core/calculate-value)))
