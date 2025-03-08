package M01S04ClasseseObjetos;

import java.util.Date;

// Classe principal para testar as implementações
public class Main {
    public static void main(String[] args) {
        // Criando uma área verde
        AreaVerde parque = new AreaVerde("Parque Zoobotânico", "Joinville - Centro", 15.2);
        parque.exibirInformacoes();

        System.out.println();

        // Criando um monitoramento de resíduos
        MonitoramentoResiduos monitoramento = new MonitoramentoResiduos("Plástico", 120, new Date());
        monitoramento.exibirInformacoes();
    }
}
