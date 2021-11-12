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


(defn mais-caro-que-100?
  "Verifica se valor é maior que 100"
  [valor-bruto]
  (> valor-bruto 100))


(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto))
    valor-bruto))


(println "Função como parâmetro")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

; Higher order Functions
; Imutabilidade

(println "Função sem nome, anonima")
(println (valor-descontado
           (fn [valor-bruto]
              (> valor-bruto 100))
           1000))

(println (valor-descontado
           (fn [valor-bruto]
              (> valor-bruto 100))
           100))

(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 1000))

(println (valor-descontado #(> %1 100) 100))
(println (valor-descontado #(> %1 100) 1000))

(println (valor-descontado #(> % 100) 100))
(println (valor-descontado #(> % 100) 1000))


(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> % 100))

(println (valor-descontado
           (fn [valor-bruto]
             (> valor-bruto 100))
           1000))

(println (valor-descontado
           (fn [valor-bruto]
             (> valor-bruto 100))
           100))