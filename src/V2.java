import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V2 {
    private JPanel panel1;
    private JTextField Alt1;
    private JTextField Pes1;
    private JButton button1;
    private JButton button2;
    private JButton respuestaDeSuIMCButton;
    private JLabel Respuesta;

    public V2() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese la altura: ");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese el Peso: ");

            }
        });
        respuestaDeSuIMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String peso = Pes1.getText();
                String altura = Alt1.getText();
                double icm_peso = Double.parseDouble(peso);
                double icm_altura = Double.parseDouble(altura);
                double formula=Math.pow(icm_altura,2)/icm_peso;
                String icFor = String.format("%,2f",formula);
                System.out.println("La respuesta es: ");
                Respuesta.setText("IMC"+icFor);
            }
        });
        Alt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alt1.getText();
                Respuesta.setText("89");

            }
        });
        Pes1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pes1.getText();
                Respuesta.setText("89");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Venta_Uno");
        frame.setContentPane(new V2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
