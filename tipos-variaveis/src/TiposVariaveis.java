public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 127;
        short ano = 2025;
        int cep = 93412777;
        long cpf = 12345678912l;        // Se começar com zero, talvez enha que ser outro tipo.
        float pi = 3.14f;               // Se começar com zero, talvez enha que ser outro tipo.
        double salrioMinimo = 2500;  // em Java, 2.500 = dois e meio  |  2500.00 = dois mil e quinhentos

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salrioMinimo + "\n");

        double num1 = 9.75;
        int num2 = (int) num1;  // casting explícito de double para int. A variável 'num2' armazenará apenas a parte inteira '9'.
        // Não se deve atrubuir uma variável a outra se a capacidade da atrubuída for maior do que a que recebe o valor.

        System.out.println(num2 + "\n");


        // short numeroCurto = 1;
        // int numeroNormal = numeroCurto;
        // short numeroCurto2 = (short)numeroNormal;  // "Casting Explícito"


        final double CONSTANTE = 10;
        System.out.println(CONSTANTE + "\n");   /*Uma constante em Java deve ser escrita por convenção em totalmente em maiúcula, 
                                           mas só será válida com a palavra 'final' implementada antes do tipo da variável.*/


        String multLine = "Primeira linha.\n"
                        + "Segunda inha.\n"
                        + "Terceira linha.\n";

        System.out.println(multLine);
    }
}
