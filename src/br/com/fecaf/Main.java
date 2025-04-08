package br.com.fecaf;

import br.com.fecaf.controllers.Menu;
import br.com.fecaf.view.View;

public class Main {

    //A Class Main é a classe 'cabeça', por meio dela vamos executar o programa e iniciar as interações com o usuário, chamando os objetos necessários

    public static void main(String[] args) {
        //Chamandos os Objetos da minha estrutura MVC
        View view = new View();
        Menu menu = new Menu();

        //Chamando os métodos dos meus Objetos View e Menu
        menu.mostrarMenu();
        view.developerLukinhas();

        //Após chamar, ao rodarmos ele vai mostrar o menu com as opções para o usuário e caso saia vai mostrar que foi desenvolvido por mim
    }
}
