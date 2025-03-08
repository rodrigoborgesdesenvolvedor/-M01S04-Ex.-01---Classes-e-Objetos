import java.util.Date;
import java.util.Scanner;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getStatusConservacao() {
        return statusConservacao;
    }

    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    public String getStatusColeta() {
        return statusColeta;
    }

    public void setStatusColeta(String statusColeta) {
        this.statusColeta = statusColeta;
    }

    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo de Resíduo: " + tipoResiduo);
        System.out.println("Quantidade: " + quantidade + " kg");
        System.out.println("Data da Coleta: " + dataColeta);
        System.out.println("Status da Coleta: " + statusColeta);
        System.out.println("Responsável pela Coleta: " + responsavelColeta);
    }
}

// Classe principal para testar as implementações e interagir com o usuário
public class AppSustentabilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma área verde
        System.out.println("Digite o nome da área verde:");
        String nomeArea = scanner.nextLine();
        System.out.println("Digite a localização da área verde:");
        String localizacaoArea = scanner.nextLine();
        System.out.println("Digite o tamanho da área verde em hectares:");
        double tamanhoArea = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        AreaVerde parque = new AreaVerde(nomeArea, localizacaoArea, tamanhoArea);
        System.out.println("Digite o status de conservação:");
        parque.setStatusConservacao(scanner.nextLine());
        System.out.println("Digite o responsável pela área:");
        parque.setResponsavel(scanner.nextLine());

        // Criando um monitoramento de resíduos
        System.out.println("Digite o tipo de resíduo:");
        String tipoResiduo = scanner.nextLine();
        System.out.println("Digite a quantidade de resíduos em kg:");
        int quantidadeResiduo = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        MonitoramentoResiduos monitoramento = new MonitoramentoResiduos(tipoResiduo, quantidadeResiduo, new Date());
        System.out.println("Digite o status da coleta:");
        monitoramento.setStatusColeta(scanner.nextLine());
        System.out.println("Digite o responsável pela coleta:");
        monitoramento.setResponsavelColeta(scanner.nextLine());

        // Exibindo as informações coletadas
        System.out.println("\nInformações da Área Verde:");
        parque.exibirInformacoes();
        System.out.println("\nInformações do Monitoramento de Resíduos:");
        monitoramento.exibirInformacoes();

        scanner.close();
    }
}
