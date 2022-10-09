(ns youtube.core
  (:gen-class))

  (defn create-transaction
  [name value]
  {:name name :value value})

  (def transactions
  [
    (create-transaction "sale" 12.99)
    (create-transaction "purchase" -100)
    (create-transaction "sale" 123.45)
    (create-transaction "purchase" -1.99)
  ])

  (defn get-values-a
  [real-transactions]
  (map :value real-transactions))

  (defn get-values-b
  [real-transactions]
  (map (fn [x] (:value x)) real-transactions))

  (defn get-values-c
  [real-transactions]
  (map #(:value %) real-transactions))

  (defn calculate-value
  [real-transactions]
  (reduce + (get-values-a real-transactions)))

  (defn is-sale?
  [real-transactions]
  (= "sale" (:name real-transactions)))

  (defn is-purchase?
  [real-transactions]
  (= "purchase" (:name real-transactions)))

  (defn get-sales
  [real-transactions]
  (filter is-sale? real-transactions))

  (defn get-purchases
  [real-transactions]
  (filter is-purchase? real-transactions))

(defn -main
  [& args]
  (println "Hello, World!"))
