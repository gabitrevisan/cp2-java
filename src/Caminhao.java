public class Caminhao extends Veiculo {
    // Atributo específico da classe Caminhão
    private int capacidadeCarga;

    // Construtor da classe Caminhão
    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        // Chama o construtor da classe base Veiculo
        super(marca, modelo, ano, 100);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Método para carregar carga no caminhão
    public void carregarCarga(int carga) {
        // Verifica se a carga a ser carregada não excede a capacidade do caminhão
        if (carga <= this.capacidadeCarga) {
            System.out.println("Carga de " + carga + " toneladas carregada com sucesso.");
        } else {
            System.out.println("Não é possível carregar essa quantidade de carga. Capacidade máxima: " + this.capacidadeCarga + " toneladas.");
        }
    }

    // Sobrescreve o método obterStatus da classe base
    @Override
    public void obterStatus() {
        // Chama o método obterStatus da classe base
        super.obterStatus();
        // Imprime a capacidade de carga do caminhão
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga + " toneladas");
    }
}