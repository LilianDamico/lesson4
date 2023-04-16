package curso_java;

import javax.swing.*;

public class lesson4 {
    public static void main(String[] args){
        int dias = Integer.parseInt(JOptionPane.showInputDialog(("Informe quantos dias dura a viagem")));
        int horas = Integer.parseInt(JOptionPane.showInputDialog(("Informe de quantas horas é a jornada diária")));
        int tot_horas = dias * horas;
        JOptionPane.showMessageDialog(null, "O total de horas de viagem foi " + tot_horas);
    }
}
