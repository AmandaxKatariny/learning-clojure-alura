(defn imprime-mensagem []
  (println "-----------------------")
  (println "Bem vindo(a) ao estoque"))

(imprime-mensagem)


(defn valor-descontado 
  "Retorna o valor descontado que é 90% do valor bruto."
  [valor-bruto]
  (* valor-bruto 0.9))

(valor-descontado 100)


(defn valor-descontado 
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(valor-descontado 100)

