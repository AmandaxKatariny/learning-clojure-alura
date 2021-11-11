(ns learning-clojure-alura.conditional-multiples-let)

(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (if (> valor-bruto 100)

    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto))
      valor-bruto))
