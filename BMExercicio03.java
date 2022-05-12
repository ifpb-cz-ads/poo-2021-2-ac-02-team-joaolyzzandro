public class BMExercicio03 {
    public static void main(String[] args) {
        /**
         * BM Exercicio 03
         * 
         * 3. Crie um programa seguindo as orientações abaixo. Faça tudo que pede dentro
         * do método main.
         * 
         * a) Declare duas variáveis para armazenar os valores de dois itens de venda.
         * Os valores dos dois itens devem ser 2.95 e 3.50. Pense em nomes
         * significativos para as variáveis e também considere qual deve ser seu tipo.
         * 
         * b) Use o System.out.println() para mostrar o conteúdo de suas variáveis.
         * Execute o programa e veja a saída. Apresente uma mensagem significativa como
         * “O Item 1 custa 2.95 e ...” (Dica : utilize o operador + para concatenar o
         * texto com o valor da variável).
         * 
         * c) Declare uma outra variável para armazenar o custo total dos itens. Utilize
         * o operador de adição para realizar o cálculo e imprima o resultado.
         * 
         * d) Crie uma constante para armazenar a taxa de 8.25 % que deve ser cobrada
         * sobre o valor total. Armazene o cálculo numa variável chamada taxaCalculada e
         * imprima o resultado.
         * 
         * e) Adicione ao valor de cada item o valor da taxa calculado. Use a menor
         * linha de código possível para fazer isso. Some novamente os dois valores e
         * atribua o resultado a uma variável chamada novoCusto.
         * 
         * f) Crie uma variável booleana chamada muitoCaro. Escreva uma assertiva lógica
         * para setar essa variável para true se novoCusto for maior que 10 e para
         * false, caso contrário. Imprima o valor obtido em muitoCaro. (Não utilize if
         * para escrever a assertiva.)
         */

        double itemVenda1 = 2.95;
        double itemVenda2 = 3.50;

        System.out.println("O Item 1 custa " + itemVenda1 + " e o Item 2 custa " + itemVenda2);

        double custoTotal = itemVenda1 + itemVenda2;
        System.out.println("O custo total eh " + custoTotal);

        final double taxa = 0.0825;
        double taxaCalculada = custoTotal * 0.0825;
        System.out.println("A taxa calculada eh " + taxaCalculada);

        itemVenda1 = +taxaCalculada;
        itemVenda2 = +taxaCalculada;
        double novoCusto = itemVenda1 + itemVenda2;

        boolean muitoCaro = novoCusto > 10;
        System.out.println("O valor obtido na variavel muitoCaro eh " + muitoCaro);

    }
}
