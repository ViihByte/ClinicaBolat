import javax.swing.*;

public class Consulta {
    private String sintomas;
    private String tipoConsulta;
    private String nomeMedico;
    private String formaPagamento;
    private double valorConsulta;
    private String diaDaConsulta;


    public void informacoesConsulta() {
        String consulta = JOptionPane.showInputDialog(
                null,
                "Com qual médico deseja passar (Dermatologista ou Podólogo):",
                "Consulta",
                JOptionPane.QUESTION_MESSAGE
        );

        if (consulta == null) return;

        if (consulta.equalsIgnoreCase("Dermatologista")) {
            tipoConsulta = "Dermatologista";
            nomeMedico = "Dro. Serkan bolat";
            valorConsulta = 250.0;

        } else if (consulta.equalsIgnoreCase("Podologo")) {
            tipoConsulta = "Podólogo";
            nomeMedico = "Dra. Eda";
            valorConsulta = 180.0;

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "NÃO TEMOS ESSA ESPECIALIZAÇÃO!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        sintomas = JOptionPane.showInputDialog(
                null,
                "Quais são os seus sintomas :",
                "Sintomas",
                JOptionPane.QUESTION_MESSAGE
        );

        formaPagamento = JOptionPane.showInputDialog(
                null,
                "Forma de pagamento (Dinheiro, Cartão, Pix):",
                "Pagamento",
                JOptionPane.QUESTION_MESSAGE
        );

        diaDaConsulta = JOptionPane.showInputDialog(
                null,
                "Escolha o dia da sua consulta: ",
                "Data",
                JOptionPane.QUESTION_MESSAGE);



        JOptionPane.showMessageDialog(
                null,
                "Consulta agendada!\n" +
                        "Médico: " + nomeMedico + "\n" +
                        "Especialização: " + tipoConsulta + "\n" +
                        "Sintomas: " + sintomas + "\n" +
                        "Forma de pagamento: " + formaPagamento + "\n" +
                        "Valor da consulta: R$ " + valorConsulta + "\n" + "Data da consulta: " + diaDaConsulta,
                "Confirmação",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


    public String getSintomas() { return sintomas; }

    public String getTipoConsulta() { return tipoConsulta; }

    public String getNomeMedico() { return nomeMedico; }

    public String getFormaPagamento() { return formaPagamento; }

    public double getValorConsulta() { return valorConsulta; }

    public String getDiaDaConsulta() {
        return diaDaConsulta;
    }
}
