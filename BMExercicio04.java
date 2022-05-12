public class BMExercicio04 {
    public static void main(String[] args) {
        /**
         * BM Exercicio 04
         * 
         * 4. Declare uma variável chamada long1 do tipo long e a inicialize com 100.
         * Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com
         * 200. Agora faça int2 receber int1 mais long1 e explique os resultados. Arrume
         * o código para que não ocorra o erro anterior.
         */

        long long1 = 100l;
        int int1 = 200;
        int int2 = int1 + long1;

        /**
         * Foi encontrado um erro em que o java não consegue converter uma variável long
         * para int para assim poder realizar o cálculo corretamente, já que em java,
         * não se pode somar duas variáveis de tipos diferentes, pois o java olha para o
         * tipo da variável e não para o valor que ela armazena. A mensagem de erro
         * obtida foi:
         * "Type mismatch: cannot convert from long to int"
         */
    }
}
