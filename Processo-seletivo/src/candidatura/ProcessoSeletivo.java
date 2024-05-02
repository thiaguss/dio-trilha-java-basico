package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(2000.0);
        // analisarCandidato(1500.0);
        // analisarCandidato(3000.0);

        selecaoCandidatos();

    }

    static void selecaoCandidatos() {

        String[] candidatos = { "FELIPE", "ARTUR", "MARIANA", "DEBORA", "MARCOS", "VINICIUS", "DOUGLAS", "BIANCA",
                "VITORIA", "JESSICA" };
        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        final double SALARIO_BASE = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);

            if (SALARIO_BASE >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }

            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        double valor = ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        return Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
    }

    static void analisarCandidato(double salarioPretendido) {
        final double SALARIO_BASE = 2000.0;

        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("Ligar para o candidato e fazer contraproposta.");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
