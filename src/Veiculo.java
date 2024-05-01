public class Veiculo {
    // Atributos privados da classe Veiculo
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    // Método para acelerar o veículo
    public void acelerar(int incremento) {
        this.velocidadeAtual += incremento;
        // Verifica se a velocidade atual não ultrapassou a velocidade máxima
        if (this.velocidadeAtual > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    // Método para reduzir a velocidade do veículo
    public void reduzirVelocidade(int decremento) {
        this.velocidadeAtual -= decremento;
        // Verifica se a velocidade atual não ficou negativa
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    // Método para obter o status do veículo
    public void obterStatus() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }

    // Método getter para obter a velocidade atual do veículo
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
}