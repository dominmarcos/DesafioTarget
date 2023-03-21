package DesafioTarget;
/*
INDICE 13
SOMA 0
K 0
ENQUANTO K<INDICE
FAÇA
K=K+1
SOMA=SOMA+K
IMPRIMA(SOMA)
 */
public class Desafio1 {
    public static void main(String[] args) {
        int i = 13;
        int soma = 0;
        int k =0 ;
        while (k < i){
            k+=1;
            soma+=k;
        }
        System.out.println("O valor da soma é: "+ soma);
    }
}
