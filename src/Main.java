//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando um Carro
        Carro carro = new Carro("Fiat", "Uno", 2020);
        carro.acelerar(50);
        carro.ligarArCondicionado();
        carro.obterStatus();
        System.out.println();

        // Criando uma Moto
        Moto moto = new Moto("Honda", "CG 160", 2018);
        moto.acelerar(30);
        moto.empinar();
        moto.obterStatus();
        System.out.println();

        // Criando um Caminhão
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2022, 20);
        caminhao.acelerar(80);
        caminhao.carregarCarga(15);
        caminhao.obterStatus();
    }
}