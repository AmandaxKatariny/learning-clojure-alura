(defn valor-descontado 
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (let [desconto 0.10]
    (println "Calculando desconto de" desconto)
    (* valor-bruto (- 1 desconto)))
  )

(valor-descontado 100)
(class 90.0)