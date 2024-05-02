package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(2000.0);
        analisarCandidato(1500.0);
        analisarCandidato(3000.0);

    }

    static void analisarCandidato(double salarioPretendido){
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
