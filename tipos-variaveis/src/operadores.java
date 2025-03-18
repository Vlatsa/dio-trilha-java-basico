public class operadores {

    public static void main(String[] args) throws Exception {
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

        numero = 5;
        System.out.println(numero);
        // Resultado: 5

        numero = - numero;
        System.out.println(numero);
        // Resultado: -5

        numero = + numero;
        System.out.println(numero);
        // Resultado: -5

        numero = 5;
        System.out.println(numero);
        // Resultado: 5

        numero = numero +2;
        System.out.println(numero);
        // Resultado: 7

        numero ++;
        System.out.println(numero);
        // Resultado: 8
        System.out.println(numero++);
        // Resultado: 8
        System.out.println(numero);
        // Resultado: 9
        System.out.println(++numero);
        // Resultado: 10
        System.out.println(numero);
        // Resultado: 10
        
        numero --;
        System.out.println(numero);
        // Resultado: 9
        System.out.println(numero--);
        // Resultado: 9
        System.out.println(numero);
        // Resultado: 8
        System.out.println(--numero);
        // Resultado: 7
        System.out.println(numero);
        // Resultado: 7

        boolean variavel = true;
        System.out.println(!variavel);
        // Resultado: false
        System.out.println(variavel);
        // Resultado: true

        variavel = !variavel;
        System.out.println(variavel);
        // Resultado: false


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
        boolean e = true && true; //&& = and
        System.out.println(e);
        // Resultado: true

        boolean ou = true || false; //|| = or
        System.out.println(ou);
        // Result: true

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

        int num1, num2;
        num1 = 10;
        num2 = 20;
        //exemplo de if
        if(num1 > num2){
            System.out.println("num1 é maior que num2");
        }else{
            System.out.println("num2 é maior que num1");
        }
        // Resultado: num2 é maior que num1

        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if(a == b){
            resultado = "Verdadeiro";
        }else{
            resultado = "Falso";
        }
        System.out.println(resultado);
        // Resultado: Falso

        resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
        // Resultado: Falso

        a = 6;
        resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
        // Resultado: Verdadeiro

        int result = (a == b) ? 1 : 0;
        System.out.println(result);
        // Resultado: 1


        // Operadores Bitwise
        int x = 10;
        int y = 20;
        int z = 0;

        z = x & y;
        System.out.println(z);
        // Resultado: 0

        z = x | y;
        System.out.println(z);
        // Resultado: 30

        z = x ^ y;
        System.out.println(z);
        // Resultado: 30

        z = ~x;
        System.out.println(z);
        // Resultado: -11

        z = x << 2;
        System.out.println(z);
        // Resultado: 40

        z = x >> 2;
        System.out.println(z);
        // Resultado: 2

        z = x >>> 2;
        System.out.println(z);
        // Resultado: 2

        // Operadores de Atribuição Bitwise
        x = 10;
        y = 20;
        
        x &= y;
        System.out.println(x);
        // Resultado: 0

        x = 10;
        y = 20;
        
        x |= y;
        System.out.println(x);
        // Resultado: 30

        x = 10;
        y = 20;

        x ^= y;
        System.out.println(x);
        // Resultado: 30

        x = 10;
        x <<= 2;
        System.out.println(x);
        // Resultado: 40

        x = 10;
        x >>= 2;
        System.out.println(x);
        // Resultado: 2

        x = 10;
        x >>>= 2;
        System.out.println(x);
        // Resultado: 2

        String nomeUm = "Vlad";
        String nomeDois = "Vlad";

        System.out.println(nomeUm == nomeDois);
        // Resultado: true

        String nomeTres = new String("Vlad");
        String nomeQuatro = new String("Vlad");
        
        System.out.println(nomeTres == nomeQuatro);
        // Resultado: false

        System.out.println(nomeTres.equals(nomeQuatro));
        // Resultado: true
        // equals compara o conteúdo da string


        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("Condição 1 e Condição 2 são verdadeiras");
        }else{
            System.out.println("Condição 1 e Condição 2 são falsas");
        }      
        // Resultado: Condição 1 e Condição 2 são falsas

        if(condicao1 || condicao2){
            System.out.println("Condição 1 ou Condição 2 são verdadeiras");
        }else{
            System.out.println("Condição 1 ou Condição 2 são falsas");
        }
        // Resultado: Condição 1 ou Condição 2 são verdadeiras

        if(condicao1 ^ condicao2){
            System.out.println("Condição 1 ou Condição 2 são verdadeiras, mas não ambas");
        }else{
            System.out.println("Condição 1 ou Condição 2 são falsas ou ambas são verdadeiras");
        }
        // Resultado: Condição 1 ou Condição 2 são verdadeiras, mas não ambas

        if(!condicao1){
            System.out.println("Condição 1 é falsa");
        }else{
            System.out.println("Condição 1 é verdadeira");
        }
        // Resultado: Condição 1 é verdadeira

        if(!condicao2){
            System.out.println("Condição 2 é falsa");
        }else{
            System.out.println("Condição 2 é verdadeira");
        }
        // Resultado: Condição 2 é falsa

        if (condicao1 && (7 > 4)){
            System.out.println("Condição 1 é verdadeira e 7 é maior que 4");
        }else{  
            System.out.println("Condição 1 é falsa ou 7 não é maior que 4");
        }   
        // Resultado: Condição 1 é verdadeira e 7 é maior que 4

    }
    
}
