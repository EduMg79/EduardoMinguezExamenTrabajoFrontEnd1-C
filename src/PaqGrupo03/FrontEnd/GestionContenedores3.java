package PaqGrupo03.FrontEnd;

import javax.swing.*;

public class GestionContenedores3 extends JFrame{
    private JTextArea textArea1;
    private JPanel panel1;



    public GestionContenedores3(String Camostrar){
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        panel1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setContentPane(panel1);
        textArea1.setText(Camostrar);
        if (Camostrar.equals("")){
            textArea1.setText("No hay ninguno que exceda a ese peso");
        }
    }

    public static void main(String[] args) {

    }

}
