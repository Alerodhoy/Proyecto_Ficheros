import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.io.*;
import java.util.EventListener;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        JFrame marco = new JFrame("Programa manejo de ficheros");
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
        label2.setFont(label2.getFont().deriveFont((float) 20));

        JFileChooser fc = new JFileChooser();

        JLabel label3 =new JLabel("Introduzca el nombre del archivo:");
        JLabel label5 =new JLabel("Nombre del archivo:");
        JLabel label6 =new JLabel("Tamaño del archivo:");
        JLabel label7 =new JLabel("Extensión del archivo:             ");
        JLabel label8 =new JLabel("Ultima modificación del archivo:");

        final String[] a = {""};

        fc.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                File file3 = new File(String.valueOf(fc.getSelectedFile()));
                String [] g= file3.getName().split("\\.");


                label5.setText("Nombre del archivo: "+file3.getName());
                label6.setText("Tamaño del archivo: "+(file3.length()/(Math.pow(10,3))+" KB"));
                label7.setText("Extensión del archivo: "+g[g.length-1]);
                String [] h= file3.getParent().split("\\\\");
                label8.setText("Esta en el directorio: "+h[h.length-1]);

            }
        });

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



        panel2.add(fc);

        panel2.add(panel9);
        panel9.add(panel10);
        panel10.add(label5);
        panel10.setBorder(new EmptyBorder(0,80,0,0));

        panel9.add(panel11);
        panel11.add(label6);
        panel11.setBorder(new EmptyBorder(0,90,0,0));

        panel9.add(panel12);
        panel12.add(label8);
        panel12.setBorder(new EmptyBorder(0,80,0,0));

        panel9.add(panel13);
        panel13.add(label7);
        panel13.setBorder(new EmptyBorder(0,90,0,0));


        panel2.add(panel14);
        panel14.setBorder(new EmptyBorder(40,10,0,0));
        panel14.add(boton2);

        marco.setVisible(true);
        JOptionPane optionPane = new JOptionPane();
        boton1.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String a = textField2.getText();

                File file = new File(String.valueOf(fc1.getSelectedFile())+"\\"+a);

                if(!a.equals("")){

                    if(file.exists()){
                        optionPane.showMessageDialog(null, "El archivo ya existe", "Error creación", JOptionPane.WARNING_MESSAGE);

                    }else{
                        try {
                            file.createNewFile();

                            JFrame marco2 = new JFrame("Insertar texto");
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



                            textArea1.addMouseListener(new MouseListener() {
                                @Override
                                public void mouseClicked(MouseEvent e) {

                                }

                                @Override
                                public void mousePressed(MouseEvent e) {
                                    textArea1.setText("");
                                }

                                @Override
                                public void mouseReleased(MouseEvent e) {

                                }

                                @Override
                                public void mouseEntered(MouseEvent e) {

                                }

                                @Override
                                public void mouseExited(MouseEvent e) {

                                }
                            });

                            boton1.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String textointr = textArea1.getText();

                                    FileWriter escribe = null;
                                    try {
                                        escribe = new FileWriter(file);
                                        BufferedWriter bf = new BufferedWriter(escribe);
                                        bf.write(textointr);
                                        bf.flush();
                                        escribe.close();
                                        optionPane.showMessageDialog(null, "Se ha escrito en el archivo", "Archivo escrito", JOptionPane.INFORMATION_MESSAGE);


                                    } catch (IOException ioException) {
                                        ioException.printStackTrace();
                                    }
                                }
                            });

                            boton2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    marco2.setVisible(false);
                                }
                            });


                            marco2.setVisible(true);

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                }else{
                    optionPane.showMessageDialog(null, "No a introducido el nombre del archivo", "Error creación", JOptionPane.WARNING_MESSAGE);

                }


            }

        });

        boton2.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println(a[0]);
                if(fc.getSelectedFile()== null){
                    optionPane.showMessageDialog(null, "No a seleccionado un archivo", "Archivo no encontrado", JOptionPane.WARNING_MESSAGE);

                }else {
                    File file2 = new File(String.valueOf(fc.getSelectedFile()));

                    JFrame marco3 = new JFrame("Practica GUI");
                    marco3.setSize(350, 400);
                    marco3.setResizable(false);
                    marco3.setLocationRelativeTo(null);

                    marco3.setLayout(new BorderLayout());

                    JPanel panel1 = new JPanel();
                    JPanel panel2 = new JPanel();
                    JPanel panel3 = new JPanel();
                    JPanel panel4 = new JPanel();

                    panel1.setLayout(new GridLayout(6, 1));
                    panel1.setBorder(new EmptyBorder(0, 30, 0, 0));

                    panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
                    panel4.setLayout(new FlowLayout(FlowLayout.CENTER));

                    JLabel label1 = new JLabel("Escoja la acción que desee realizar");
                    label1.setFont(label1.getFont().deriveFont((float) 20));

                    JButton boton1 = new JButton("Realizar acción");
                    boton1.setPreferredSize(new Dimension(130, 30));

                    ButtonGroup grupobotones = new ButtonGroup();

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

                    marco3.add(panel3, BorderLayout.NORTH);
                    panel3.add(label1);
                    marco3.add(panel2, BorderLayout.WEST);
                    marco3.add(panel1, BorderLayout.CENTER);
                    marco3.add(panel4, BorderLayout.SOUTH);

                    panel4.add(boton1);

                    panel1.add(radioButton1);
                    panel1.add(radioButton2);
                    panel1.add(radioButton3);
                    panel1.add(radioButton4);
                    panel1.add(radioButton5);
                    panel1.add(radioButton6);

                    marco3.setVisible(true);

                    JOptionPane optionPane = new JOptionPane();

                    boton1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            if (radioButton1.isSelected()) {

                                JFrame marco2 = new JFrame("Modificar archivo");
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

                                JLabel label1 = new JLabel("Escribir en el fichero");
                                JTextArea textArea1 = new JTextArea("");
                                textArea1.setPreferredSize(new Dimension(500, 250));

                                JButton boton1 = new JButton("Modificar texto");
                                JButton boton2 = new JButton("No modificar el fichero");

                                boton1.setPreferredSize(new Dimension(130, 30));
                                boton2.setPreferredSize(new Dimension(160, 30));

                                marco2.add(panel1, BorderLayout.NORTH);
                                panel1.add(label1);

                                marco2.add(panel2, BorderLayout.CENTER);
                                panel2.add(textArea1);

                                marco2.add(panel3, BorderLayout.SOUTH);
                                panel3.add(boton1);
                                panel3.add(boton2);

                                try {
                                    FileReader fr = new FileReader(file2);
                                    BufferedReader bfr = new BufferedReader(fr);
                                    String o = bfr.readLine();
                                    String tfich="";
                                    while(o!=null){
                                        tfich= tfich+o+"\n";
                                        o =bfr.readLine();
                                    }
                                    textArea1.setText(tfich);

                                    boton1.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            String modif = textArea1.getText();
                                            try {
                                                FileWriter escribe = new FileWriter(file2);
                                                BufferedWriter bw = new BufferedWriter(escribe);
                                                bw.write(modif);
                                                bw.flush();
                                                escribe.close();
                                                optionPane.showMessageDialog(null, "Archivo modificado", "Archivo modificado", JOptionPane.INFORMATION_MESSAGE);

                                            } catch (IOException ioException) {
                                                ioException.printStackTrace();
                                            }

                                        }
                                    });
                                    fr.close();



                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }

                                marco2.setVisible(true);
                            }
                            if (radioButton2.isSelected()) {


                                file2.delete();
                                if (file2.exists()) {
                                    optionPane.showMessageDialog(null, "El archivo no se pudo borrar", "Error al borrar el archivo", JOptionPane.PLAIN_MESSAGE);
                                } else {
                                    optionPane.showMessageDialog(null, "El archivo fue borrado exitosamente", "Archivo borrado", JOptionPane.PLAIN_MESSAGE);

                                }

                            }
                            if (radioButton3.isSelected()) {

                                try {
                                    FileReader leerfich = new FileReader(file2);
                                    BufferedReader bfr = new BufferedReader(leerfich);

                                    String g =bfr.readLine();
                                    String tfich="";
                                    while(g!=null){
                                        tfich= tfich+g+"\n";
                                        g =bfr.readLine();
                                    }

                                    String aux= file2.getAbsolutePath();

                                    String [] j=aux.split("\\.");

                                    FileWriter escribir = new FileWriter(j[0]+"_copia."+j[1],true);
                                    BufferedWriter bf = new BufferedWriter(escribir);
                                    bf.write(tfich);

                                    bf.flush();

                                    leerfich.close();
                                    escribir.close();
                                    optionPane.showMessageDialog(null, "Fichero copiado", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);

                                }  catch (IOException ioException) {
                                    ioException.printStackTrace();

                                    optionPane.showMessageDialog(null, "El fichero no se ha podido copiar", "Acción no realizada", JOptionPane.ERROR_MESSAGE);

                                }

                            }
                            if (radioButton4.isSelected()) {


                                try {
                                    String linea;

                                    FileReader fr = new FileReader(file2);

                                    BufferedReader br = new BufferedReader(fr);

                                    int i, j, a = 0;

                                    while ((linea = br.readLine()) != null) {

                                        for (i = 0; i < linea.length(); i++) {
                                            if (i == 0) {
                                                if (linea.charAt(i) != ' ')
                                                    a++;
                                            } else {
                                                if (linea.charAt(i - 1) == ' ')
                                                    if (linea.charAt(i) != ' ')
                                                        a++;

                                            }
                                        }
                                    }
                                    optionPane.showMessageDialog(null, "Son " + a + " palabras", "Palabras contadas", JOptionPane.INFORMATION_MESSAGE);

                                    fr.close();
                                } catch (IOException a) {
                                    System.out.println(a);
                                }



                            }
                            if (radioButton5.isSelected()) {



                                try {

                                    FileReader fr = new FileReader(file2);
                                    BufferedReader br = new BufferedReader(fr);


                                    Scanner input = new Scanner(file2);
                                    String fileContent = "";


                                    while (input.hasNext()) {
                                        fileContent += input.next() + " ";
                                    }

                                    input.close();

                                    char[] charArr = fileContent.toCharArray();

                                    int counter = 0;
                                    for (char c : charArr) {
                                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                                            counter++;
                                    }


                                    optionPane.showMessageDialog(null, "Son " + counter + " Vocales", "Vocales contadas", JOptionPane.INFORMATION_MESSAGE);

                                    fr.close();
                                } catch (IOException a) {
                                    optionPane.showMessageDialog(null, "Error al contar las vocales", "Error", JOptionPane.WARNING_MESSAGE);
                                }




                            }
                            if (radioButton6.isSelected()) {

                                try {
                                    FileReader leerfich = new FileReader(file2);
                                    BufferedReader bfr = new BufferedReader(leerfich);


                                    String g =bfr.readLine();
                                    String tfich="";
                                    while(g!=null){
                                        String [] listPalabras=g.split(" ");
                                        for(int i=0; i<listPalabras.length;i++){

                                            if(listPalabras[i].length()>4){
                                                String palabraCifrada = Character.toString(listPalabras[i].charAt(0));

                                                for(int z=listPalabras[i].length()-2;z>0;z--) {

                                                    palabraCifrada = palabraCifrada+listPalabras[i].charAt(z);

                                                }


                                                palabraCifrada = palabraCifrada+listPalabras[i].charAt(listPalabras[i].length()-1);
                                                listPalabras[i]= palabraCifrada;
                                            }

                                        }
                                        for(int i=0;i<listPalabras.length;i++){
                                            tfich=tfich+listPalabras[i]+" ";
                                        }
                                        tfich= tfich+"\n";
                                        g =bfr.readLine();
                                    }

                                    String aux= file2.getAbsolutePath();

                                    String [] j=aux.split("\\.");


                                    FileWriter escribir = new FileWriter(j[0]+"_Cifrado."+j[1],true);
                                    BufferedWriter bf = new BufferedWriter(escribir);
                                    bf.write(tfich);
                                    bf.flush();

                                    leerfich.close();
                                    escribir.close();
                                    optionPane.showMessageDialog(null, "Fichero cifrado", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);

                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                    optionPane.showMessageDialog(null, "No se ha podido cifrar el archivo", "Acción no realizada", JOptionPane.ERROR_MESSAGE);

                                }


                            }
                        }
                    });
                }
            }

        });
    }



}
