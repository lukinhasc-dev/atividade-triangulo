package br.com.fecaf.controllers;

import br.com.fecaf.models.TrianguloRetangulo;
import br.com.fecaf.view.View;

import java.util.Scanner;

public class Menu {

    //Menu representa o Controller (C) da nossa Estrutura (MVC)
    //A Class Menu é o nosso Controller, o Controller é o intermediário entre o View (View) e o TrianguloRetangulo (Model)
    //Essa classe nós manipulamos os dados, organizamos e estruturamos para enviarmos para execução (Main)


    //Chamando os objetos
    Scanner scanner = new Scanner(System.in);
    View view = new View();
    TrianguloRetangulo triangulo = new TrianguloRetangulo();

    //Criando os Booleans
    boolean sairMenu = false;
    boolean validacaoCadastro = false;


    public void mostrarMenu() {
        //Crio um método para mostrar o menu com todas as opções que o usuário queira
        //Método 'principal' para ser executado no Main

        while (!sairMenu) {
            view.mostrarMenu();
            view.opcaoUsuario();
            int opcaoDesejada = scanner.nextInt();

            switch (opcaoDesejada) { //Criando um Switch Case, pra caso o usuário escolha entre 1-7, execute um método
                case 1:
                    validacaoCadastro = triangulo.cadastrarTriangulo();
                    break;
                case 2:
                    if (validacaoCadastro) {
                        triangulo.calcularArea();
                    } else {
                        view.cadastreOTriangulo();
                    }
                    break;

                case 3:
                    if (validacaoCadastro) {
                        triangulo.calcularPerimetro();
                    } else {
                        view.cadastreOTriangulo();
                    }
                    break;

                case 4:
                    if (validacaoCadastro) {
                        triangulo.definirTipo();
                    } else {
                        view.cadastreOTriangulo();
                    }
                    break;

                case 5:
                    if (validacaoCadastro) {
                        triangulo.verificarTrianguloRetangulo();
                    } else {
                        view.cadastreOTriangulo();
                    }
                    break;
                case 6:
                    if (validacaoCadastro) {
                        triangulo.verificarTriangulo345();
                    } else {
                        view.cadastreOTriangulo();
                    }
                    break;

                case 7:
                    sairMenu = true;
                    view.mensagemSair();
                    break;

                default:
                    view.mensagemOpcaoValida();
                    break;
            }
        }
    }
}
