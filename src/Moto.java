public class Moto extends Veiculo {
    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano) {
        // Chama o construtor da classe base Veiculo
        super(marca, modelo, ano, 120);
    }

    // Método para empinar a moto
    public void empinar() {
        // Verifica se a velocidade atual está entre 20 e 50 km/h
        if (this.getVelocidadeAtual() > 20 && this.getVelocidadeAtual() < 50) {
            System.out.println("A moto está empinando!");
        } else {
            System.out.println("Não é possível empinar a moto nesta velocidade.");
        }
    }
}