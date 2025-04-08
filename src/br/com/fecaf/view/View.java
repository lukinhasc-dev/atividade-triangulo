package br.com.fecaf.view;

public class View {

    //View representa o View (V) da nossa Estrutura (MVC)
    //A Class View foi criado pra facilitar as views que aparecem para o usuário, assim, diminuindo a poluição visual do meu Controller.
    //Dentro da View temos o Menu, Opções e Mensagens que vão ser chamadas no Controller, sendo assim não preciso ficar chamando o sout no Controller.
    //Facilitando o código e aplicando um 'Clean-code' vamos se dizer

    public void mostrarMenu() {
        System.out.println("--------------------------");
        System.out.println("--- MENU DO TRIÂNGULO  ---");
        System.out.println("--------------------------");
        System.out.println("--- 1- Cadastrar Triângulo ---");
        System.out.println("--- 2- Verificar Área ---");
        System.out.println("--- 3- Verificar Perímetro ---");
        System.out.println("--- 4- Verificar Tipo de Triângulo ---");
        System.out.println("--- 5- Verificar caso seja Triângulo Retângulo ---");
        System.out.println("--- 6- Verificar caso seja Triângulo 3-4-5 ---");
        System.out.println("--- 7- Sair ---");
        System.out.println("--------------------------");
    }

    public void opcaoUsuario() {
        System.out.println("Escolha a opção desejada: ");
    }

    public void mensagemSair() {
        System.out.println("--------------------------");
        System.out.println("--- SAINDO DO SISTEMA ---");
        System.out.println("--------------------------");
    }

    public void mensagemOpcaoValida() {
        System.out.println("Escolha uma opção válida!");
    }

    public void cadastreOTriangulo() {
        System.out.println("--- CADASTRE O TRIÂNGULO ---");
    }

    public void developerLukinhas() {
        System.out.println("DESENVOLVIDO POR Lukinhasc-dev");
        System.out.println("--------------------------");
    }
}
