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
        System.out.println(variavel + "\n");


        int a, b;
        a = 10;
        b = 10;

        String resultado = a == b ? "Verdadeiro": "Falso";
        System.out.println(resultado + "\n");

        // O código da linha 78 à 79 realiza exatamente a mesma operação do bloco de código da linha 82 à 88.

        // String resultado = "";
        // if (a == b)
        //     resultado = "Verdadeiro";
        // else
        //     resultado = "Falso";

        // System.out.println(resultado + "\n");



        String nomeUm = "Davi";
        String nomeDois = new String("Davi"); 

        // System.out.println(nomeUm == nomeDois);   // 'False' por conta do novo objeto.
        System.out.println(nomeUm.equals(nomeDois)); // Qaundo comparamos objetos usamos o método 'equals',
                                                     // pois, ele compara conteúdos, se eu tenho dois objetos,
                                                     // ele compara se o conteúdo destes objetos são iguais.


        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;

        if (num1 != num2) {
            System.out.println("A condição é verdadeira.");
        } else {
            System.out.println("A condição é falsa.");
        }

        System.out.println("num1 é igual a num2? " + simNao);

        simNao = num1 != num2;
        System.out.println("num1 é igual a num2? " + simNao);

        simNao = num1 > num2;
        System.out.println("num1 é maior que num2? " + simNao + "\n");


        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Ambas são verdadeiras.");
        } else if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma é verdadeira.");
        } else {
            System.out.println("Nenhuma é verdadeira;");
        }

        System.out.println("Fim.");
        
    }
}
