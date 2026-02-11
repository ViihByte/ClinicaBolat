public class Teste {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        clinica.fornecerAtendimento();

        Paciente p1 = new Paciente();
        p1.loginPaciente();
        Consulta consulta = new Consulta();
        consulta.informacoesConsulta();

    }
}