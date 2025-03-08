import java.util.Date;

// Classe que representa uma área verde
class AreaVerde {
    private String nome;
    private String localizacao;
    private double tamanho;
    private String statusConservacao;
    private String responsavel;

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public String getStatusConservacao() {
        return statusConservacao;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void exibirInformacoes() {
        System.out.println("Área Verde: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanho + " hectares");
        System.out.println("Status de Conservação: " + statusConservacao);
        System.out.println("Responsável: " + responsavel);
    }
}

// Classe que representa o monitoramento de resíduos
class MonitoramentoResiduos {
    private String tipoResiduo;
    private int quantidade;
    private Date dataColeta;
    private String statusColeta;
    private String responsavelColeta;

    public MonitoramentoResiduos(String tipoResiduo, int quantidade, Date dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }

    public void setStatusColeta(String statusColeta) {
        this.statusColeta = statusColeta;
    }

    public String getStatusColeta() {
        return statusColeta;
    }

    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }

    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta);
        System.out.println("Status da Coleta: " + statusColeta);
        System.out.println("Responsável pela Coleta: " + responsavelColeta);
    }
}

// Classe principal para testar as implementações
public class Main {
    public static void main(String[] args) {
        // Criando uma área verde
        AreaVerde parque = new AreaVerde("Parque Zoobotânico", "Joinville - Centro", 15.2);
        parque.setStatusConservacao("Bem preservado");
        parque.setResponsavel("Prefeitura de Joinville");
        parque.exibirInformacoes();

        System.out.println();

        // Criando um monitoramento de resíduos
        MonitoramentoResiduos monitoramento = new MonitoramentoResiduos("Plástico", 120, new Date());
        monitoramento.setStatusColeta("Coleta concluída");
        monitoramento.setResponsavelColeta("Empresa de Limpeza Urbana");
        monitoramento.exibirInformacoes();
    }
}
