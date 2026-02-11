import javax.swing.*;

public class Clinica {
    private String localidade  = "Bahia Cristal - SP.\nRua Rômenia Hawkins - 203. CEP: 0889-876";
    private String instituicao = "Clínica Bolat";
    private String especializacao  = "Clínica Dermatológica";
    private String telefone  = "(11) 2203-8941";
    private String nomeImagem = " ";
    private String horarioAtendimento = "Segunda a Sexta - 9h ás 18h. Sábado - 11h ás 15h30.";



    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;

    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;

    }

    //Referenciando o caminho da imagem para colocar na interface
    String caminhoImagem = String.format("C:\\Users\\faria\\OneDrive\\Desktop\\Projeto - Clinica Bolat\\ClinicaBolat\\src\\ImagemClinica.jpg", nomeImagem);
    ImageIcon icone = new ImageIcon(caminhoImagem);

    public void fornecerAtendimento(){
       JOptionPane.showMessageDialog(null,"Seja Bem-Vindo(a) a nossa " + getInstituicao() +
               "! Saiba mais sobre quem somos: \nEspecialização " + getEspecializacao() +
               "\nLocalidade: " + getLocalidade() +
               "\nHorario de Atendimento: "+ getHorarioAtendimento() + "\nTelefone: " + getTelefone(), "Saiba Mais", JOptionPane.INFORMATION_MESSAGE, icone);
    }
}
