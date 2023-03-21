package DesafioTarget;

import java.util.Scanner;
/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 escreva um programa na linguagem que desejar onde,
 informado um número, ele calcule a sequência de Fibonacci e
 retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

 */
public class Desafio2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
                System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
                int num = entrada.nextInt();
                int a = 0, b = 1;
                boolean pertence = false;
                while (b <= num) {
                    if (b == num) {
                        pertence = true;
                        break;
                    }
                    int temp = b;
                    b += a;
                    a = temp;
                }
                if (pertence) {
                    System.out.println(num + " Pertence à sequência de Fibonacci.");
                } else {
                    System.out.println(num + " Não pertence à sequência de Fibonacci.");
                }

            }
        }



