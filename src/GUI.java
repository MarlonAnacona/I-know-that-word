

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

/**
 * This class is used for ...
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 */
public class GUI extends JFrame {

    private Header header;
    private JTextField texto;
    private JTextArea areaTexto;
    private FileManager fileManager;
    private Escucha escucha;
    private Canvas canvas;
    private Timer timer, iniciar;
    public static String nombreUsario;
    private Font font;
    private JPanel palabras,botones;
    private Diccionario palabra;
    private JButton jugar,ayuda,salir,si,no;

    /**
     * Constructor of GUI class
     */
    public GUI() throws IOException {
        initGUI();

        //Default JFrame configuration
        this.setTitle("FilesManager app");
        this.setSize(500,400);
        //this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() throws IOException {

        fileManager =new FileManager();
        nombreUsario=JOptionPane.showInputDialog("Ingrese su usuario");
        fileManager.escribirUsuario(nombreUsario);
        fileManager.buscarNivelUsuario(nombreUsario);

        header= new Header("FILE MANAGER",Color.black);
        this.add(header,BorderLayout.NORTH);
        //Set up JFrame Container's Layout
        //Create Listener Object and Control Object
        escucha = new Escucha();
        fileManager = new FileManager();
        palabra= new Diccionario();
        //Set up JComponents


        palabras = new JPanel();

        canvas = new Canvas();
        canvas.setFocusable(true);
        add(canvas,BorderLayout.CENTER);

        botones=new JPanel();
        botones.setBackground(Color.BLUE);
        jugar=new JButton("JUGAR");
        ayuda=new JButton("AYUDA");
        botones.add(jugar);
        botones.add(ayuda);
        this.add(botones, BorderLayout.SOUTH);

        jugar.addActionListener(escucha);
        //initTimer.setVisible(false);
         iniciar = new Timer(1000,escucha);
        timer = new Timer(5000,escucha);

        //timer.start();



    }



    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            try {
                GUI miProjectGUI = new GUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener {

        private Random random;
        private int counter,counter2;
        public Escucha(){
            random = new Random();
            counter=0;
        }


        @Override
        public void actionPerformed(ActionEvent e) {

           // areaTexto.setText(palabra.getFrase());

            if(e.getSource()==jugar){

                iniciar.start();
                JOptionPane.showMessageDialog(null,"El juego iniciará");
            }

            if(e.getSource()==iniciar){

                counter2++;

                canvas.conteo(getGraphics(),counter2);
                if(counter2<=4){

                }else{
                    timer.start();
                    iniciar.stop();

                }
            }else{

            }


            if(e.getSource()==timer){

                counter++;

                canvas.paintComponent(getGraphics());
                if(counter<=7){

                }else{
                    timer.stop();

                }
            }else{
                timer.start();
                counter=0;

            }
        }
        }
}


