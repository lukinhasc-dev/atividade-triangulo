package br.com.fecaf.models;

import java.util.Scanner;

public class TrianguloRetangulo {

    //TrianguloRetangulo representa o Model (M) da nossa Estrutura (MVC)
    //A Class TrianguloRetangulo é o nosso model, basicamente aqui fica a estrutura e a lógica do nosso código
    //Criamos diversos métodos que possam fazer os cálculos de Area, Perimetro, ver o Tipo e etc.
    //Para ser chamada no nosso Controller e ser manipulada e controlada.


    //Definindo o tipo primitivo e nomeando para chamar
    public double base, lado1, lado2, altura, area, perimetro;

    //Chamando o Scanner para dentro da Class
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() { //Criando um método pra fazer o cadastro do triângulo com informações que o usuário coloca
        System.out.println("-----------------------------");
        System.out.println("--- CADASTRANDO TRIÂNGULO ---");
        System.out.println("-----------------------------");

        System.out.println("Informe a base: ");
        base = scanner.nextDouble();

        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();

        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();

        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();

        System.out.println("-----------------------------");
        System.out.println("--- CADASTRADO COM SUCESSO! ---");
        System.out.println("-----------------------------");
        System.out.println();
        return true;
    }

    public void calcularArea() { //Criando um método pra calcular a área
        System.out.println("-----------------------------");
        System.out.println("--- VERIFICAR ÁREA ---");
        System.out.println("-----------------------------");
        area = (base * altura) / 2;
        System.out.println("A area é: " + area);
        System.out.println("-----------------------------");
        System.out.println();
    }

    public void calcularPerimetro() { //Criando um método pra calcular o perímetro
        System.out.println("-----------------------------");
        System.out.println("--- VERIFICAR PERÍMETRO ---");
        System.out.println("-----------------------------");
        perimetro = base + lado1 + lado2;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("-----------------------------");
        System.out.println();
    }

    public void definirTipo() { //Criando um método pra verificar o tipo do triângulo baseado no que foi cadastrado
        System.out.println("-----------------------------");
        System.out.println("--- DEFINIR TIPO ---");
        System.out.println("-----------------------------");

        if (base == lado1 && base == lado2) {
            System.out.println("--- Esse TRIÂNGULO é EQUIlÁTERO ---");
        } else if (base != lado1 && base != lado2 && lado1 != lado2) {
            System.out.println("--- Esse TRIÂNGULO é ESCALENO ---");
        } else {
            System.out.println("--- Esse TRIÂNGULO é ISOSCELES ---");
        }
        System.out.println("-----------------------------");
        System.out.println();
    }

    public void verificarTrianguloRetangulo() { //Criando um método pra verificar caso o triângulo seja um triângulo retângulo
        System.out.println("-----------------------------");
        System.out.println("--- VERIFICAÇÃO - TRIÂNGULO RETÂNGULO ---");
        System.out.println("-----------------------------");

        if ((base * base + lado1 * lado1 == lado2 * lado2) ||
                (base * base + lado2 * lado2 == lado1 * lado1) ||
                (lado1 * lado1 + lado2 * lado2 == base * base)) {
            System.out.println("O Triângulo é um TRIÂNGULO RETÂNGULO");
        } else {
            System.out.println("O Triângulo NÃO é um TRIÂNGULO RETÂNGULO");
        }
        System.out.println("-----------------------------");
        System.out.println();
    }

    public void verificarTriangulo345() { //Criando um método pra verificar se também ele é um triângulo 3-4-5
        System.out.println("-----------------------------");
        System.out.println("--- VERIFICAÇÃO - TRIÂNGULO 3-4-5 ---");
        System.out.println("-----------------------------");

        if ((base == 3 && lado1 == 4 && lado2 == 5) ||
                (base == 3 && lado1 == 5 && lado2 == 4) ||
                (base == 4 && lado1 == 3 && lado2 == 5) ||
                (base == 4 && lado1 == 5 && lado2 == 3) ||
                (base == 5 && lado1 == 3 && lado2 == 4) ||
                (base == 5 && lado1 == 4 && lado2 == 3)) {

            System.out.println("O Triângulo é um TRIÂNGULO 3-4-5");
        } else {
            System.out.println("O Triângulo NÃO é um TRIÂNGULO 3-4-5");
        }
        System.out.println("-----------------------------");
        System.out.println();
    }

}



