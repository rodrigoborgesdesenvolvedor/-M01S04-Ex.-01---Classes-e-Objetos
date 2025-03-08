package M01S04ClasseseObjetos;

import java.util.Date;

// Classe que representa uma área verde
class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho;

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public void exibirInformacoes() {
        System.out.println("Área Verde: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanho + " hectares");
    }
}

// Classe que representa o monitoramento de resíduos
class MonitoramentoResiduos {
    private String tipoResiduo;
    private int quantidade;
    private Date dataColeta;

    public MonitoramentoResiduos(String tipoResiduo, int quantidade, Date dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta);
    }
}

