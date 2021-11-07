/*
O que aprendemos nesta aula:

- Mostrar uma mensagem na tela com o comando println;
- Que toda invocação de função colocamos parênteses entre ela;
- Definir uma variável global com (def sua variavel );
- Criar um vetor (def exemploVetor ["1","2"]);
- Que para o Clojure a vírgula é considerada um espaço;
- Contar quantos elementos tem em um vetor com o count;
- Adicionar elementos ao vetor com o conj;
- Que o Clojure é imutável;
- Criar função com defn.
*/

(println "Bem vindo(a) ao sitema de estoque"))

(def total-de-produtos 15)
(println total-de-produtos)

(def total-de-produtos 13)
(println "Total:" total-de-produtos)

(+ 13 3) /* "Soma 13+3" */
(- 13 3) /* "Subtração 13+3" */

(def total-de-produtos (+ total-de-produtos 3))

/* "--- Vetor ---" */
(def estoque ["Mochila", "Camiseta"])

clj: estoque
/* retorna: ["Mochila", "Camiseta"] */
 
clj: (estoque 0)
/* retorna: "Mochila" */

clj: (estoque 1)
/* retorna:"Camiseta" */

clj: (count estoque)
/* retorna: 2 */


(conj estoque "Cadeira")
/*retorna: ["Mochila" "Camiseta" "Cadeira"]*/

(println estoque)
/* retorna: ["Mochila", "Camiseta"] */

(def estoque (conj estoque "Cadeira"))
(println estoque)
/* retorna: ["Mochila" "Camiseta" "Cadeira"] */
