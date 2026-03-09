# Exercício – Análise de Complexidade Assintótica (Big-O)

Disciplina: Estruturas de Dados e Análise de Algoritmos  
Professor: Alexandre de Oliveira  

## Descrição

Este projeto contém a implementação em Java dos exercícios de análise de complexidade assintótica (Big-O).  
Cada exercício foi implementado e analisado considerando o pior caso, conforme solicitado.

A variável n representa o tamanho da entrada.


---

## Exercício 1

Complexidade: O(1)

Justificativa:  
O algoritmo acessa apenas o primeiro elemento do vetor, independentemente do tamanho.


---

## Exercício 2

Complexidade: O(n)

Justificativa:  
O algoritmo percorre todos os elementos da lista uma vez usando um loop.


---

## Exercício 3

Complexidade: O(log n)

Justificativa:  
A busca binária divide o espaço de busca pela metade a cada iteração.


---

## Exercício 4

Complexidade: O(n²)

Justificativa:  
Existem dois loops aninhados que percorrem a lista.


---

## Exercício 5

Complexidade: O(n²)

Justificativa:  
O primeiro loop é linear, mas o segundo possui dois loops aninhados, resultando em complexidade quadrática.


---

## Exercício 6

Complexidade: O(log n)

Justificativa:  
O valor é multiplicado por 2 a cada repetição, reduzindo o número de iterações.


---

## Exercício 7

Complexidade: O(2^n)

Justificativa:  
Cada chamada recursiva gera duas novas chamadas, resultando em crescimento exponencial.


---

## Exercício 8

Complexidade: O(n²)

Justificativa:  
O Bubble Sort utiliza dois loops aninhados para ordenar a lista.


---

## Exercício 9

Complexidade: O(n³)

Justificativa:  
A multiplicação de matrizes usa três loops aninhados.


---

## Exercício 10

Complexidade: O(n log n)

Justificativa:  
O Merge Sort divide a lista em partes menores e depois percorre todos os elementos para juntar.


---

## Observações

Todos os algoritmos foram implementados manualmente em Java, sem uso de ferramentas automáticas de análise, conforme solicitado no exercício.
