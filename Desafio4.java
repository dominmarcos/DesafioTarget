package DesafioTarget;
/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 

 */
public class Desafio4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double faturamentoTotal = sp + rj + mg + es + outros;
        double pctSp = (sp / faturamentoTotal) * 100;
        double pctRj = (rj / faturamentoTotal) * 100;
        double pctMg = (mg / faturamentoTotal) * 100;
        double pctEs = (es / faturamentoTotal) * 100;
        double pctOutros = (outros / faturamentoTotal) * 100;

        System.out.println("Percentual de representação do faturamento por estado:");
        System.out.printf("SP: %.2f%%\n", pctSp);
        System.out.printf("RJ: %.2f%%\n", pctRj);
        System.out.printf("MG: %.2f%%\n", pctMg);
        System.out.printf("ES: %.2f%%\n", pctEs);
        System.out.printf("Outros: %.2f%%\n", pctOutros);
    }
}


