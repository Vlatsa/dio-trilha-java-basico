public class operadores {

    public class main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Operadores Aritméticos
        int soma = 1 + 1;
        System.out.println(soma);
        // Resultado: 2

        int subtracao = 1 - 1;
        System.out.println(subtracao);
        // Resultado: 0

        int multiplicacao = 2 * 2;
        System.out.println(multiplicacao);
        // Resultado: 4

        int divisao = 4 / 2;
        System.out.println(divisao);
        // Resultado: 2

        int modulo = 5 % 2;
        System.out.println(modulo);
        // Resultado: 1

        // Operadores de Atribuição
        int numero = 10;
        numero += 5;
        System.out.println(numero);
        // Resultado: 15

        numero -= 5;
        System.out.println(numero);
        // Resultado: 10

        numero *= 2;
        System.out.println(numero);
        // Resultado: 20

        numero /= 2;
        System.out.println(numero);
        // Resultado: 10

        numero %= 3;
        System.out.println(numero);
        // Resultado: 1

        // Operadores de Comparação
        boolean igual = 1 == 1;
        System.out.println(igual);
        // Resultado: true

        boolean diferente = 1 != 1;
        System.out.println(diferente);
        // Resultado: false

        boolean maior = 2 > 1;
        System.out.println(maior);
        // Resultado: true

        boolean menor = 1 < 2;
        System.out.println(menor);
        // Resultado: true

        boolean maiorOuIgual = 2 >= 1;
        System.out.println(maiorOuIgual);
        // Resultado: true

        boolean menorOuIgual = 1 <= 2;
        System.out.println(menorOuIgual);
        // Resultado: true

        // Operadores Lógicos
        boolean e = true && true;
        System.out.println(e);
        // Resultado: true

        boolean ou = true || false;
        System.out.println(ou);
        // Result

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        // Resultado: LINGUAGEMJAVA

        String concatenacao = "Olá, " + "Mundo!";
        System.out.println(concatenacao);
        // Resultado: Olá, Mundo!

        concatenacao += " Seja bem-vindo!";
        System.out.println(concatenacao);
        // Resultado: Olá, Mundo! Seja bem-vindo!

        concatenacao = "?";
        System.out.println(concatenacao);
        // Resultado: ?

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        // Resultado: 31

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        // Resultado: 1111

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        // Resultado: 1111

        concatenacao = 1+1+"1"+1;
        System.out.println(concatenacao);
        // Resultado: 211

    }
    
}
