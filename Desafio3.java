package DesafioTarget;


/*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */
public class Desafio3 {
    public static void main(String[] args) {
            double[] faturamentosDiarios = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
                    46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
                    35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221,
                    13220.495, 8414.61};
            double menorFaturamento = faturamentosDiarios[0];
            for (int i = 1; i < faturamentosDiarios.length; i++) {
                if (faturamentosDiarios[i]!=0.0 && faturamentosDiarios[i] < menorFaturamento) {
                    menorFaturamento = faturamentosDiarios[i];
                }
            }
            System.out.println("Menor valor de faturamento diário: " + menorFaturamento);

            double maiorFaturamento = faturamentosDiarios[0];
            for (int i = 1; i < faturamentosDiarios.length; i++) {
                if (faturamentosDiarios[i] > maiorFaturamento) {
                    maiorFaturamento = faturamentosDiarios[i];
                }
            }
            System.out.println("Maior valor de faturamento diário: " + maiorFaturamento);

            double mediaMensal = 0;
            int numDiasComFaturamento = 0;
            for (double faturamentoDiario : faturamentosDiarios) {
                if (faturamentoDiario > 0) {
                    mediaMensal += faturamentoDiario;
                    numDiasComFaturamento++;
                }
            }
            mediaMensal /= numDiasComFaturamento;

            int numDiasAcimaMedia = 0;
            for (double faturamentoDiario : faturamentosDiarios) {
                if (faturamentoDiario > mediaMensal) {
                    numDiasAcimaMedia++;
                }
            }
            System.out.println("Número de dias com faturamento acima da média mensal: " + numDiasAcimaMedia);
        }
    }
