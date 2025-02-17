public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto + "\n");


        String nome1 = "Davi ";
        String nome2 = "Gabriel";
        String nomeCompleto2 = nome1 + nome2;

        System.out.println(nome1 + nome2);
        System.out.println(nomeCompleto2 + "\n");


        String concatenacao = "?";

        concatenacao = 1+1+1+"1";          // Quando o compilador encontra um caractere ele para de somar e pasa a concatenar.
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao + "\n");


        int numero = 10;
        System.out.println(numero);
        
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;        // Interação matemática para converter o número para positivo.
        System.out.println(numero + "\n");


        // A seguir, temos a forma de incrementar e decrementar valores em 1.
        // Para fazer o mesmo com valores maiores que 1, basta atrubuir a variável a ela mesma e operar com o valor desejado.
        
        int numero2 = 10;

        System.out.println(numero2 ++);     
        System.out.println(numero2);         
        System.out.println(++ numero2);
        System.out.println(numero2 --);
        System.out.println(numero2);
        System.out.println(-- numero2 + "\n");

        numero2 = numero2 + 5;
        System.out.println(numero2);
        numero2 = numero2 - 5;
        System.out.println(numero2);
        numero2 = numero2 * 2;
        System.out.println(numero2);
        numero2 = numero2 / 2;
        System.out.println(numero2 + "\n");


        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);




    }
}
