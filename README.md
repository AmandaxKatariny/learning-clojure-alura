# learning-clojure-alura
Primeiros passos no aprendizado de Clojure - Curso da Alura

## Preparando o Ambiente 
- https://clojure.org/guides/getting_started

- https://brew.sh/

## Documentação

- https://github.com/clojure/clojure/

## Comandos
Após a instalação basta abrir o terminal e usar o comando `clj`

## Sobre

O Cursive possui dezenas de atalhos que nos ajudam no dia a dia. O guia de usuário deles possui diversas páginas que sugiro ler de vez em quando. Não precisa ler tudo de uma vez só. Uma vez por semana olha uma página nova de atalhos para você tentar incorporar ao seu dia a dia. Lembre-se que no dia a dia gastamos mais tempo pensando e elaborando o que fazer do que digitando, não estamos numa competição de digitação, mas provavelmente queremos produzir código bom que seja de manutenção boa a médio prazo. https://cursive-ide.com/userguide

## Aulas
Conteudo programático das Aulas - Alura
### Aula 01

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

### Aula 02

O que aprendemos nesta aula:

- Definir uma variável com def ela tem o escopo global, dependendo do namespace;
- Algumas boas práticas com Clojure;
- Criar uma variável de escopo local com o let;
- Utilizar o class para descobrir o tipo da variável;
- Trabalhar com condicionais if;
- Que o nil(Nulo) é considerado false dentro do if.


## Aula 03 

O que aprendemos nesta aula:

- Utilizar o plugin Cursive;
- O que é o namespace;
- Atalhos do Intellij;
- Utilizar o ; para comentar a linha;
- O que são predicates;
- Fazer uma função chamar a outra;
- Criar uma função anônima;
- Utilizar % para fazer um função lambda.


## Aula 04

O que aprendemos nesta aula:

- Utilizar o get para evitar exceções;
- Definir o valor padrão de retorno do get;
- Utilizar a função inc para somar o número atual mais um;
- Utilizar a função update para apenas retornar um vetor com um valor alterado;
- Utilizar a função map para passar por todos os elementos;
- Utilizar a função filter para fazer a filtragem de elementos;
- Utilizar a função reduce para reduzir valores.

## Aula 05
O que aprendemos nesta aula:

- Utilizar um Map(HashMap);
- Utilizar a função count;
- Utilizar a função keys para devolver as chaves que o map possui;
- Utilizar a função assoc para associar um valor ao map;
- O que é threading.


## Aula 06
O que aprendemos nesta aula:

- Utilizar o destruct para um dicionário;
- Utilizar o Thread last;
- Utilizar o map, reduce e filter em um mapa;
- Criar composição com o comp;

## Conceitos 

- https://blog.nubank.com.br/o-que-e-clojure/

* Imutalidade:
 - Significado qualidade, estado ou condição de imutável.

 - Independentemente de seu relacionamento a bugs, a imutabilidade facilita a manutenção do código quando passamos a ter garantias que se alguém invocou uma função, ela não alterou os valores que você possuia em mãos. Essa é uma das ideias vendidas como positivas pela imutabilidade. Como não nos preocupamos com o que foi alterado (pois nada foi), podemos olhar um código e mantê-lo com menos medo.