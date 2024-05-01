public class Carro extends Veiculo {
    // Atributo específico da classe Carro
    private boolean arCondicionadoLigado;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano) {
        // Chama o construtor da classe base Veiculo
        super(marca, modelo, ano, 180);
        this.arCondicionadoLigado = false;
    }

    // Método para ligar o ar condicionado
    public void ligarArCondicionado() {
        this.arCondicionadoLigado = true;
    }

    // Método para desligar o ar condicionado
    public void desligarArCondicionado() {
        this.arCondicionadoLigado = false;
    }

    // Sobrescreve o método obterStatus da classe base
    @Override
    public void obterStatus() {
        // Chama o método obterStatus da classe base
        super.obterStatus();
        // Imprime o status do ar condicionado
        System.out.println("Ar Condicionado: " + (this.arCondicionadoLigado ? "Ligado" : "Desligado"));
    }
}