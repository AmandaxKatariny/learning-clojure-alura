(ns learning-clojure-alura.aula3)

(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (if (> valor-bruto 100)

    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(valor-descontado 1000)
(valor-descontado 100)

; Predicate
(defn aplica-desconto?
  [valor-bruto]
  (println "Chamando função Aplicando Desconto")
  (if (> valor-bruto 100)
    true
    false))

(defn aplica-desconto?
  [valor-bruto]
  (println "Chamando função Aplicando Desconto versão when")
  (when (> valor-bruto 100)
    true))


(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))
(valor-descontado 1000)
(valor-descontado 100)