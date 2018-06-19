(ns hello-world.core)

(println "Hello clojure script world!")

;; ADDED
(defn average [a b]
  (/ (+ a b) 2.0))
