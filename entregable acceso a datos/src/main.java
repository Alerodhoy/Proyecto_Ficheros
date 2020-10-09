import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.util.EventListener;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        JFrame marco = new JFrame("Practica GUI");
        marco.setSize(650, 650);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(new BorderLayout());
        marco.setResizable(false);

        JTabbedPane tabbedPane1 = new JTabbedPane();

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        SwingUtilities.updateComponentTreeUI(marco);



        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10= new JPanel();
        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();
        JPanel panel13 = new JPanel();
        JPanel panel14 = new JPanel();


        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel6.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel7.setLayout(new GridLayout(3,1));
        panel9.setLayout(new GridLayout(2,2));
        panel10.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel11.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel12.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel13.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel14.setLayout(new FlowLayout(FlowLayout.CENTER));






        JLabel label2 =new JLabel("Introduzca la ruta donde se creara el archivo:");
        JLabel label3 =new JLabel("Introduzca el nombre del archivo:");
        JLabel label5 =new JLabel("Nombre del archivo:");
        JLabel label6 =new JLabel("Tamaño del archivo:");
        JLabel label7 =new JLabel("Extensión del archivo:           ");
        JLabel label8 =new JLabel("Tipo de archivo:");

        JTextField textField2 = new JTextField(20);
        JButton boton1 = new JButton("Crear");
        JButton boton2 = new JButton("Realizar acción");

        boton1.setPreferredSize(new Dimension(130,30));
        boton2.setPreferredSize(new Dimension(150,30));

        marco.add(tabbedPane1);
        tabbedPane1.addTab("Crear fichero", panel1);
        panel1.add(panel3);
        panel3.add(label2);

        JFileChooser fc1 = new JFileChooser();
        fc1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        panel1.add(panel4);
        panel4.add(fc1);

        panel1.add(panel7);
        panel7.add(panel5);
        panel5.add(label3);
        panel5.add(textField2);

        panel7.add(panel8);
        panel7.add(panel6);
        panel6.add(boton1);



        tabbedPane1.addTab("Modificar fichero", panel2);

        JFileChooser fc = new JFileChooser();

        panel2.add(fc);

        panel2.add(panel9);
        panel9.add(panel10);
        panel10.add(label5);
        panel10.setBorder(new EmptyBorder(0,80,0,0));

        panel9.add(panel11);
        panel11.add(label6);
        panel11.setBorder(new EmptyBorder(0,90,0,0));

        panel9.add(panel12);
        panel12.add(label7);
        panel12.setBorder(new EmptyBorder(0,80,0,0));

        panel9.add(panel13);
        panel13.add(label8);
        panel13.setBorder(new EmptyBorder(0,90,0,0));


        panel2.add(panel14);
        panel14.setBorder(new EmptyBorder(40,10,0,0));
        panel14.add(boton2);

        marco.setVisible(true);

        boton1.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame marco2 = new JFrame("Practica GUI");
                marco2.setSize(600, 400);
                marco2.setResizable(false);
                marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                marco2.setLayout(new BorderLayout());
                marco2.setLocationRelativeTo(null);

                JPanel panel1 = new JPanel();
                JPanel panel2 = new JPanel();
                JPanel panel3 = new JPanel();

                panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
                panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
                panel3.setLayout(new FlowLayout(FlowLayout.CENTER));

                JLabel label1 =new JLabel("Escribir en el fichero");
                JTextArea textArea1 = new JTextArea("Escriba aquí si deséa introducir texto en el fichero creado");
                textArea1.setPreferredSize(new Dimension(500,250));

                JButton boton1 = new JButton("Introducir Texto");
                JButton boton2 = new JButton("Dejar fichero en blanco");

                boton1.setPreferredSize(new Dimension(130,30));
                boton2.setPreferredSize(new Dimension(160,30));

                marco2.add(panel1,BorderLayout.NORTH);
                panel1.add(label1);

                marco2.add(panel2,BorderLayout.CENTER);
                panel2.add(textArea1);

                marco2.add(panel3,BorderLayout.SOUTH);
                panel3.add(boton1);
                panel3.add(boton2);

                marco2.setVisible(true);
            }

        });

        boton2.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame marco3 = new JFrame("Practica GUI");
                marco3.setSize(350, 400);
                marco3.setResizable(false);
                marco3.setLocationRelativeTo(null);

                marco3.setLayout(new BorderLayout());

                JPanel panel1 = new JPanel();
                JPanel panel2 = new JPanel();
                JPanel panel3 = new JPanel();
                JPanel panel4 = new JPanel();

                panel1.setLayout(new GridLayout(6,1));
                panel1.setBorder(new EmptyBorder(0,30,0,0));

                panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
                panel4.setLayout(new FlowLayout(FlowLayout.CENTER));

                JLabel label1 =new JLabel("Escoja la acción que desee realizar");

                JButton boton1 = new JButton("Realizar acción");
                boton1.setPreferredSize(new Dimension(130,30));

                ButtonGroup grupobotones =new ButtonGroup();

                JRadioButton radioButton1 = new JRadioButton("Mostrar contenido con la posivilidad de editarlo");
                JRadioButton radioButton2 = new JRadioButton("Borrar archivo");
                JRadioButton radioButton3 = new JRadioButton("Copiar archivo");
                JRadioButton radioButton4 = new JRadioButton("Contar palabras");
                JRadioButton radioButton5 = new JRadioButton("Contar vocales");
                JRadioButton radioButton6 = new JRadioButton("Cifrar archivo");



                grupobotones.add(radioButton1);
                grupobotones.add(radioButton2);
                grupobotones.add(radioButton3);
                grupobotones.add(radioButton4);
                grupobotones.add(radioButton5);
                grupobotones.add(radioButton6);

                marco3.add(panel3,BorderLayout.NORTH);
                panel3.add(label1);
                marco3.add(panel2,BorderLayout.WEST);
                marco3.add(panel1,BorderLayout.CENTER);
                marco3.add(panel4,BorderLayout.SOUTH);

                panel4.add(boton1);

                panel1.add(radioButton1);
                panel1.add(radioButton2);
                panel1.add(radioButton3);
                panel1.add(radioButton4);
                panel1.add(radioButton5);
                panel1.add(radioButton6);

                marco3.setVisible(true);
            }

        });
    }



}
