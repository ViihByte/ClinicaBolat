import javax.swing.*;

public class  Paciente {
    private String nomePaciente;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String emailPaciente;
    private String telefonePaciente;
    private String enderecoPaciente;
    private String convenioPaciente;
    private int idadePaciente;
    private String sexoPaciente;
    private String nomeImagemPaciente;



    public void loginPaciente() {
        setNomePaciente(JOptionPane.showInputDialog(null,"Nome do Paciente: ", "Nome Paciente", JOptionPane.QUESTION_MESSAGE));
        setIdadePaciente(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade Paciente: ", "Idade Paciente", JOptionPane.QUESTION_MESSAGE)));
        setSexoPaciente(JOptionPane.showInputDialog(null,"Sexo: ", "Sexo Paciente", JOptionPane.QUESTION_MESSAGE));
        setCpf(JOptionPane.showInputDialog(null,"CPF: ", "CPF Paciente", JOptionPane.QUESTION_MESSAGE));
        setRg(JOptionPane.showInputDialog(null,"RG: ", "RG Paciente", JOptionPane.QUESTION_MESSAGE));
        setDataNascimento(JOptionPane.showInputDialog(null,"Data de Nascimento: ", "Data de nascimento", JOptionPane.QUESTION_MESSAGE));
        setEmailPaciente(JOptionPane.showInputDialog(null,"E-mail do paciente:", "E-mail Paciente", JOptionPane.QUESTION_MESSAGE));
        setTelefonePaciente(JOptionPane.showInputDialog(null,"Telefone: ", "Telefone Paciente", JOptionPane.QUESTION_MESSAGE));
        setEnderecoPaciente(JOptionPane.showInputDialog(null,"Endereço do paciente: ", "Endereço Paciente", JOptionPane.QUESTION_MESSAGE));
        setConvenioPaciente(JOptionPane.showInputDialog(null,"Convênio: ", "Convênio Paciente", JOptionPane.QUESTION_MESSAGE));
        ImprimirDadosPaciente();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() <= 12 ) {
            this.cpf = cpf;
        } else {
            JOptionPane.showMessageDialog(null, "Erro! CPF inválido.", "Erro CPF", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }

    public int getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(int idadePaciente) {
        if (idadePaciente > 0) {
            this.idadePaciente = idadePaciente;
        } else {
            JOptionPane.showMessageDialog(null, "Erro! Idade inválida.", "Erro Idade", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

    }

    public String getConvenioPaciente() {
        return convenioPaciente;
    }

    public void setConvenioPaciente(String convenioPaciente) {
        switch (convenioPaciente) {
            case "Bradesco":
            case "Unimed":
            case "SulAmérica Saúde":
            case "Amil":
            case "NotreDame Intermédica":
            case "Porto Seguro Saúde":
                this.convenioPaciente = convenioPaciente;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Convênio inválido!", "Erro Convênio", JOptionPane.ERROR_MESSAGE);
                this.convenioPaciente = "Convênio não reconhecido";
                break;
        }
    }

    String caminhoImagemPaciente = String.format("C:\\Users\\faria\\OneDrive\\Desktop\\Projeto - Clinica Bolat\\ClinicaBolat\\src\\CadastroPaciente.png", nomeImagemPaciente);
    ImageIcon iconePaciente = new ImageIcon(caminhoImagemPaciente);

        public void ImprimirDadosPaciente(){
            JOptionPane.showMessageDialog(null, "Paciente: " + getNomePaciente() +
                    ". Idade" + getIdadePaciente() + "\nSexo: " + getSexoPaciente() +
                    "\nCPF: " + getCpf() + ". RG: " + getRg() +
                    "\nData de nascimento: " + getDataNascimento() +
                    "\nTelefone: " + getTelefonePaciente() +
                    "\nEndereço: " + getEnderecoPaciente() +
                    "\nConvênio: " + getConvenioPaciente(), "Dados do Paciente", JOptionPane.INFORMATION_MESSAGE, iconePaciente);
        }

    }


