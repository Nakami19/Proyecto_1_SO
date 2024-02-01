/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Developer;
import Clases.Director;
import Clases.Estudio;
import Clases.ProjectManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Natalia
 */
public class Ventana extends javax.swing.JFrame {

            Estudio nick = new Estudio("Nickelodeon", 5);
            Estudio cn = new Estudio("Cartoon Network", 5);
            boolean iniciado=false;
            int max_nk = 13; //Carnet de Natalia Rivas termina en 1
            int max_cn = 12; //Carnet de Tomás Gil termina en 0
            private String path;
    
    /**
     * Creates new form NewJFrame
     */
    public Ventana() {
        initComponents();        
        this.setLocationRelativeTo(null);
        
        
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    public static javax.swing.JLabel getCn_Director_State(){
        return Cn_Director_State;
    }
    
    public static javax.swing.JLabel getCn_Pm_State(){
        return Cn_Pm_State;
    }
    
    public static javax.swing.JLabel getNk_Director_State(){
        return Nk_Director_State;
    }
    
    public static javax.swing.JLabel getNk_Pm_State(){
        return Nk_Pm_State;
    }

    public static JLabel getCn_Cont_Caps() {
        return Cn_Cont_Caps;
    }

    public static void setCn_Cont_Caps(JLabel Cn_Cont_Caps) {
        Ventana.Cn_Cont_Caps = Cn_Cont_Caps;
    }

    public static JLabel getCn_Cont_PW() {
        return Cn_Cont_PW;
    }

    public static void setCn_Cont_PW(JLabel Cn_Cont_PW) {
        Ventana.Cn_Cont_PW = Cn_Cont_PW;
    }

    public static JLabel getDrive_Doblaje_Cn() {
        return Drive_Doblaje_Cn;
    }

    public static void setDrive_Doblaje_Cn(JLabel Drive_Doblaje_Cn) {
        Ventana.Drive_Doblaje_Cn = Drive_Doblaje_Cn;
    }

    public static JLabel getDrive_Doblaje_Nk() {
        return Drive_Doblaje_Nk;
    }

    public static void setDrive_Doblaje_Nk(JLabel Drive_Doblaje_Nk) {
        Ventana.Drive_Doblaje_Nk = Drive_Doblaje_Nk;
    }

    public static JLabel getDrive_Escenario_Cn() {
        return Drive_Escenario_Cn;
    }

    public static void setDrive_Escenario_Cn(JLabel Drive_Escenario_Cn) {
        Ventana.Drive_Escenario_Cn = Drive_Escenario_Cn;
    }

    public static JLabel getDrive_Escenario_Nk() {
        return Drive_Escenario_Nk;
    }

    public static void setDrive_Escenario_Nk(JLabel Drive_Escenario_Nk) {
        Ventana.Drive_Escenario_Nk = Drive_Escenario_Nk;
    }

    public static JLabel getDrive_Guionista_Cn() {
        return Drive_Guionista_Cn;
    }

    public static void setDrive_Guionista_Cn(JLabel Drive_Guionista_Cn) {
        Ventana.Drive_Guionista_Cn = Drive_Guionista_Cn;
    }

    public static JLabel getDrive_Guionista_Nk() {
        return Drive_Guionista_Nk;
    }

    public static void setDrive_Guionista_Nk(JLabel Drive_Guionista_Nk) {
        Ventana.Drive_Guionista_Nk = Drive_Guionista_Nk;
    }

    public static JLabel getDrive_PW_Cn() {
        return Drive_PW_Cn;
    }

    public static void setDrive_PW_Cn(JLabel Drive_PW_Cn) {
        Ventana.Drive_PW_Cn = Drive_PW_Cn;
    }

    public static JLabel getDrive_PW_Nk() {
        return Drive_PW_Nk;
    }

    public static void setDrive_PW_Nk(JLabel Drive_PW_Nk) {
        Ventana.Drive_PW_Nk = Drive_PW_Nk;
    }

    public static JLabel getDrive_Personaje_Cn() {
        return Drive_Personaje_Cn;
    }

    public static void setDrive_Personaje_Cn(JLabel Drive_Personaje_Cn) {
        Ventana.Drive_Personaje_Cn = Drive_Personaje_Cn;
    }

    public static JLabel getDrive_Personaje_Nk() {
        return Drive_Personaje_Nk;
    }

    public static void setDrive_Personaje_Nk(JLabel Drive_Personaje_Nk) {
        Ventana.Drive_Personaje_Nk = Drive_Personaje_Nk;
    }

    public static JLabel getNk_Cont_Caps() {
        return Nk_Cont_Caps;
    }

    public static void setNk_Cont_Caps(JLabel Nk_Cont_Caps) {
        Ventana.Nk_Cont_Caps = Nk_Cont_Caps;
    }

    public static JLabel getNk_Cont_PW() {
        return Nk_Cont_PW;
    }

    public static void setNk_Cont_PW(JLabel Nk_Cont_PW) {
        Ventana.Nk_Cont_PW = Nk_Cont_PW;
    }

    public static JLabel getCn_Fail_Counter() {
        return Cn_Fail_Counter;
    }

    public static void setCn_Fail_Counter(JLabel Cn_Fail_Counter) {
        Ventana.Cn_Fail_Counter = Cn_Fail_Counter;
    }

    public static JLabel getNk_Fail_Counter() {
        return Nk_Fail_Counter;
    }

    public static void setNk_Fail_Counter(JLabel Nk_Fail_Counter) {
        Ventana.Nk_Fail_Counter = Nk_Fail_Counter;
    }

    public static JLabel getCn_Discount_Counter() {
        return Cn_Discount_Counter;
    }

    public static void setCn_Discount_Counter(JLabel Cn_Discount_Counter) {
        Ventana.Cn_Discount_Counter = Cn_Discount_Counter;
    }

    public static JLabel getNk_Discount_Counter() {
        return Nk_Discount_Counter;
    }

    public static void setNk_Discount_Counter(JLabel Nk_Discount_Counter) {
        Ventana.Nk_Discount_Counter = Nk_Discount_Counter;
    }

    public static JLabel getCn_Gain_Counter() {
        return Cn_Gain_Counter;
    }

    public static void setCn_Gain_Counter(JLabel Cn_Gain_Counter) {
        Ventana.Cn_Gain_Counter = Cn_Gain_Counter;
    }

    public static JLabel getCn_Loss_Counter() {
        return Cn_Loss_Counter;
    }

    public static void setCn_Loss_Counter(JLabel Cn_Loss_Counter) {
        Ventana.Cn_Loss_Counter = Cn_Loss_Counter;
    }

    public static JLabel getCn_Utility_Counter() {
        return Cn_Utility_Counter;
    }

    public static void setCn_Utility_Counter(JLabel Cn_Utility_Counter) {
        Ventana.Cn_Utility_Counter = Cn_Utility_Counter;
    }

    public static JLabel getNk_Gain_Counter() {
        return Nk_Gain_Counter;
    }

    public static void setNk_Gain_Counter(JLabel Nk_Gain_Counter) {
        Ventana.Nk_Gain_Counter = Nk_Gain_Counter;
    }

    public static JLabel getNk_Loss_Counter() {
        return Nk_Loss_Counter;
    }

    public static void setNk_Loss_Counter(JLabel Nk_Loss_Counter) {
        Ventana.Nk_Loss_Counter = Nk_Loss_Counter;
    }

    public static JLabel getNk_Utility_Counter() {
        return Nk_Utility_Counter;
    }

    public static void setNk_Utility_Counter(JLabel Nk_Utility_Counter) {
        Ventana.Nk_Utility_Counter = Nk_Utility_Counter;
    }

    public static JLabel getCn_Deadline_Counter() {
        return Cn_Deadline_Counter;
    }

    public static void setCn_Deadline_Counter(JLabel Cn_Deadline_Counter) {
        Ventana.Cn_Deadline_Counter = Cn_Deadline_Counter;
    }

    public static JLabel getNk_Deadline_Counter() {
        return Nk_Deadline_Counter;
    }

    public static void setNk_Deadline_Counter(JLabel Nk_Deadline_Counter) {
        Ventana.Nk_Deadline_Counter = Nk_Deadline_Counter;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Config = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Cont_Deadline = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        Cont_Day_Duration = new javax.swing.JSpinner();
        IniciarSimulacion = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Finn1 = new javax.swing.JLabel();
        Spongebob1 = new javax.swing.JLabel();
        Fondo_Menu1 = new javax.swing.JLabel();
        Cartoon = new javax.swing.JPanel();
        Cont_Guionista_PW_CN = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cont_Guionista_CN = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        Cont_Escenario_CN = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Cont_Animador_CN = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Cont_Actor_Doblaje_CN = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        Cont_Ensamblador_CN = new javax.swing.JSpinner();
        Cn_Director_State = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Cn_Pm_State = new javax.swing.JLabel();
        Cn_Cont_PW = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Drive_Escenario_Cn = new javax.swing.JLabel();
        Drive_Personaje_Cn = new javax.swing.JLabel();
        Drive_Doblaje_Cn = new javax.swing.JLabel();
        Drive_PW_Cn = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Cn_Cont_Caps = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Drive_Guionista_Cn = new javax.swing.JLabel();
        Cn_Fail_Counter = new javax.swing.JLabel();
        Cn_Discount_Counter = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        Cn_Utility_Counter = new javax.swing.JLabel();
        Cn_Gain_Counter = new javax.swing.JLabel();
        Cn_Loss_Counter = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Cn_Deadline_Counter = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Logo_Cn = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Finn = new javax.swing.JLabel();
        Fondo_Cn = new javax.swing.JLabel();
        Nick = new javax.swing.JPanel();
        Gary = new javax.swing.JLabel();
        Logo_Nk = new javax.swing.JLabel();
        Spongebob = new javax.swing.JLabel();
        Jellyfish = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        Nk_Gain_Counter = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Nk_Utility_Counter = new javax.swing.JLabel();
        Nk_Loss_Counter = new javax.swing.JLabel();
        Nk_Deadline_Counter = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Nk_Director_State = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Nk_Pm_State = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Nk_Fail_Counter = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Nk_Discount_Counter = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cont_Guionista_NK = new javax.swing.JSpinner();
        Cont_Animador_NK = new javax.swing.JSpinner();
        Cont_Escenario_NK = new javax.swing.JSpinner();
        Cont_Actor_Doblaje_NK = new javax.swing.JSpinner();
        Cont_Guionista_PW_NK = new javax.swing.JSpinner();
        Cont_Ensamblador_NK = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        Drive_Guionista_Nk = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Drive_Escenario_Nk = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Drive_Personaje_Nk = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Drive_Doblaje_Nk = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Drive_PW_Nk = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Nk_Cont_Caps = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Nk_Cont_PW = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Fondo_Nick = new javax.swing.JLabel();
        Graf = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        Fondo_Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        Config.setBackground(new java.awt.Color(204, 153, 255));
        Config.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("DURACIÓN DE DÍAS (S): ");
        Config.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        saveButton.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        saveButton.setText("GUARDAR");
        saveButton.setBorderPainted(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        Config.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 210, 40));

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Para terminar la simulación y guardar los cambios hechos presione el siguiente botón");
        Config.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        Cont_Deadline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Deadline.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Deadline, ""));
        Cont_Deadline.setValue(1);
        Cont_Deadline.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_DeadlineStateChanged(evt);
            }
        });
        Config.add(Cont_Deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 80, 20));

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("DIAS ENTRE DEADLINES: ");
        Config.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Cont_Day_Duration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Day_Duration.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Day_Duration, ""));
        Cont_Day_Duration.setValue(1);
        Cont_Day_Duration.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Day_DurationStateChanged(evt);
            }
        });
        Config.add(Cont_Day_Duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 80, 20));

        IniciarSimulacion.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        IniciarSimulacion.setText("Iniciar simulacion");
        IniciarSimulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IniciarSimulacion.setDefaultCapable(false);
        IniciarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSimulacionActionPerformed(evt);
            }
        });
        Config.add(IniciarSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 110, 200, 40));

        jLabel68.setBackground(new java.awt.Color(0, 0, 0));
        jLabel68.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("EN VENEZUELA");
        Config.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel70.setBackground(new java.awt.Color(0, 0, 0));
        jLabel70.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("BIENVENIDOS A LA SIMULACIÓN DE ESTUDIOS DE ANIMACIÓN");
        Config.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jLabel23.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Para iniciar la simulación, presione el siguiente botón y seleccione el archivo correspondiente");
        Config.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel24.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Aquí podrá cambiar diversas configuraciones (los cambios de estos se reflejarán al reiniciar):");
        Config.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        Finn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Finn_the_Human_Portrait_Full1.png"))); // NOI18N
        Finn1.setName(""); // NOI18N
        Config.add(Finn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 190, 200));

        Spongebob1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/SpongebobFullRender.png"))); // NOI18N
        Spongebob1.setName(""); // NOI18N
        Config.add(Spongebob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 200));

        Fondo_Menu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo_Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/MenuBg.jpg"))); // NOI18N
        Config.add(Fondo_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 520));

        jTabbedPane1.addTab("Config", Config);

        Cartoon.setBackground(new java.awt.Color(0, 0, 0));
        Cartoon.setForeground(new java.awt.Color(255, 255, 255));
        Cartoon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cont_Guionista_PW_CN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Guionista_PW_CN.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Guionista_PW_CN, ""));
        Cont_Guionista_PW_CN.setValue(1);
        Cont_Guionista_PW_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_PW_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Guionista_PW_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 80, 20));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENSAMBLADORES:");
        Cartoon.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 210, -1));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Capitulos Plot-Twist:");
        Cartoon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        Cont_Guionista_CN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Guionista_CN.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Guionista_CN, ""));
        Cont_Guionista_CN.setValue(1);
        Cont_Guionista_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Guionista_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 20));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DISEÑADORES DE  ESCENARIOS:");
        Cartoon.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, -1));

        Cont_Escenario_CN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Escenario_CN.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Escenario_CN, ""));
        Cont_Escenario_CN.setValue(1);
        Cont_Escenario_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Escenario_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Escenario_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 20));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ANIMADORES DE  PERSONAJES:");
        Cartoon.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, -1));

        Cont_Animador_CN.setModel(new javax.swing.SpinnerNumberModel());
        Cont_Animador_CN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Animador_CN.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Animador_CN, ""));
        Cont_Animador_CN.setValue(1);
        Cont_Animador_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Animador_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Animador_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 80, 20));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ACTORES DE DOBLAJE:");
        Cartoon.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, -1));

        Cont_Actor_Doblaje_CN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Actor_Doblaje_CN.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Actor_Doblaje_CN, ""));
        Cont_Actor_Doblaje_CN.setValue(1);
        Cont_Actor_Doblaje_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Actor_Doblaje_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Actor_Doblaje_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 80, 20));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GUIONISTAS DE PLOT-TWIST:");
        Cartoon.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, -1));

        Cont_Ensamblador_CN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Ensamblador_CN.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Ensamblador_CN, ""));
        Cont_Ensamblador_CN.setValue(1);
        Cont_Ensamblador_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Ensamblador_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Ensamblador_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 80, -1));

        Cn_Director_State.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Director_State.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Director_State.setText("Trabajando");
        Cartoon.add(Cn_Director_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("GUIONISTAS:");
        Cartoon.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PROJECT MANAGER:");
        Cartoon.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("UTILIDAD:");
        Cartoon.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel26.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("DIRECTOR:");
        Cartoon.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Cn_Pm_State.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Pm_State.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Pm_State.setText("Trabajando");
        Cartoon.add(Cn_Pm_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        Cn_Cont_PW.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Cont_PW.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Cont_PW.setText("0");
        Cartoon.add(Cn_Cont_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 30, -1));

        jLabel28.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Elementos Drive:");
        Cartoon.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jLabel29.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Elementos Drive:");
        Cartoon.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel30.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Elementos Drive:");
        Cartoon.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel31.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Elementos Drive:");
        Cartoon.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel32.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Sueldo Descontado:");
        Cartoon.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Drive_Escenario_Cn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Escenario_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Escenario_Cn.setText("0");
        Cartoon.add(Drive_Escenario_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        Drive_Personaje_Cn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Personaje_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Personaje_Cn.setText("0");
        Cartoon.add(Drive_Personaje_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        Drive_Doblaje_Cn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Doblaje_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Doblaje_Cn.setText("0");
        Cartoon.add(Drive_Doblaje_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        Drive_PW_Cn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_PW_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Drive_PW_Cn.setText("0");
        Cartoon.add(Drive_PW_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel33.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Capitulos Normales:");
        Cartoon.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        Cn_Cont_Caps.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Cont_Caps.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Cont_Caps.setText("0");
        Cartoon.add(Cn_Cont_Caps, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 30, -1));

        jLabel49.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("/25");
        Cartoon.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel50.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("/20");
        Cartoon.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        jLabel51.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("/55");
        Cartoon.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel52.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("/35");
        Cartoon.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jLabel53.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("/10");
        Cartoon.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        jLabel35.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Elementos Drive:");
        Cartoon.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel36.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Faltas del PM:");
        Cartoon.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Drive_Guionista_Cn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Guionista_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Guionista_Cn.setText("0");
        Cartoon.add(Drive_Guionista_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        Cn_Fail_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Fail_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Fail_Counter.setText("0");
        Cartoon.add(Cn_Fail_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        Cn_Discount_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Discount_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Discount_Counter.setText("0");
        Cartoon.add(Cn_Discount_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("GANANCIAS:");
        Cartoon.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel55.setBackground(new java.awt.Color(0, 0, 0));
        jLabel55.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("GASTOS:");
        Cartoon.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        Cn_Utility_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Utility_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Utility_Counter.setText("0");
        Cartoon.add(Cn_Utility_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        Cn_Gain_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Gain_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Gain_Counter.setText("0");
        Cartoon.add(Cn_Gain_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        Cn_Loss_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cn_Loss_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Loss_Counter.setText("0");
        Cartoon.add(Cn_Loss_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("DEADLINE:");
        Cartoon.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        Cn_Deadline_Counter.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        Cn_Deadline_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Cn_Deadline_Counter.setText("0");
        Cartoon.add(Cn_Deadline_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CANTIDAD DE TRABAJADORES:");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MANEJADOR DE");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        Cartoon.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 530, 330));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setBackground(new java.awt.Color(0, 0, 0));
        jLabel60.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("ESTADOS:");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        Cartoon.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 140));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        Cartoon.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 180, 140));

        Logo_Cn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Cn_Logo2.svg.png"))); // NOI18N
        Cartoon.add(Logo_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 150));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Jakesalad2.png"))); // NOI18N
        jLabel64.setText("jLabel64");
        Cartoon.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 140, 180));

        Finn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Finn.png"))); // NOI18N
        Finn.setName(""); // NOI18N
        Cartoon.add(Finn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 190, 200));

        Fondo_Cn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Cn_Bg.jpg"))); // NOI18N
        Cartoon.add(Fondo_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

        jTabbedPane1.addTab("Cartoon", Cartoon);

        Nick.setBackground(new java.awt.Color(255, 153, 0));
        Nick.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Gary_looking_up_stock_art2.png"))); // NOI18N
        Nick.add(Gary, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 260, 220));

        Logo_Nk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Nk_Logo.png"))); // NOI18N
        Nick.add(Logo_Nk, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 170, 150));

        Spongebob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Spongebob.png"))); // NOI18N
        Spongebob.setName(""); // NOI18N
        Nick.add(Spongebob, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 190, 200));

        Jellyfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Jellyfish.png"))); // NOI18N
        Jellyfish.setName(""); // NOI18N
        Nick.add(Jellyfish, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 190, 130));

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("UTILIDAD:");
        Nick.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("GASTOS:");
        Nick.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("DEADLINE:");
        Nick.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        Nk_Gain_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Gain_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Gain_Counter.setText("0");
        Nick.add(Nk_Gain_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("GANANCIAS:");
        Nick.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        Nk_Utility_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Utility_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Utility_Counter.setText("0");
        Nick.add(Nk_Utility_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        Nk_Loss_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Loss_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Loss_Counter.setText("0");
        Nick.add(Nk_Loss_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        Nk_Deadline_Counter.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        Nk_Deadline_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Deadline_Counter.setText("0");
        Nick.add(Nk_Deadline_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Nick.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 180, 140));

        jLabel66.setBackground(new java.awt.Color(0, 0, 0));
        jLabel66.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("ESTADOS:");
        Nick.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DIRECTOR:");
        Nick.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Nk_Director_State.setBackground(new java.awt.Color(0, 0, 0));
        Nk_Director_State.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Director_State.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Director_State.setText("Trabajando");
        Nick.add(Nk_Director_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PROJECT MANAGER:");
        Nick.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Nk_Pm_State.setBackground(new java.awt.Color(0, 0, 0));
        Nk_Pm_State.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Pm_State.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Pm_State.setText("Trabajando");
        Nick.add(Nk_Pm_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel37.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Faltas del PM:");
        Nick.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Nk_Fail_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Fail_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Fail_Counter.setText("0");
        Nick.add(Nk_Fail_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel38.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Sueldo Descontado:");
        Nick.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Nk_Discount_Counter.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Discount_Counter.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Discount_Counter.setText("0");
        Nick.add(Nk_Discount_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Nick.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 140));

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ENSAMBLADORES:");
        Nick.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 210, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DISEÑADORES DE  ESCENARIOS:");
        Nick.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, -1));

        jLabel65.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("MANEJADOR DE");
        jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nick.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GUIONISTAS:");
        Nick.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel71.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("MANEJADOR DE");
        jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nick.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel63.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("CANTIDAD DE TRABAJADORES:");
        jLabel63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nick.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ANIMADORES DE  PERSONAJES:");
        Nick.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, -1));

        jLabel69.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("CANTIDAD DE TRABAJADORES:");
        jLabel69.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nick.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ACTORES DE DOBLAJE:");
        Nick.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GUIONISTAS DE PLOT-TWIST:");
        Nick.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, -1));

        Cont_Guionista_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Guionista_NK.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Guionista_NK, ""));
        Cont_Guionista_NK.setValue(1);
        Cont_Guionista_NK.setVerifyInputWhenFocusTarget(false);
        Cont_Guionista_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Guionista_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 20));

        Cont_Animador_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Animador_NK.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Animador_NK, ""));
        Cont_Animador_NK.setValue(1);
        Cont_Animador_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Animador_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Animador_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 80, 20));

        Cont_Escenario_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Escenario_NK.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Escenario_NK, ""));
        Cont_Escenario_NK.setValue(1);
        Cont_Escenario_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Escenario_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Escenario_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 20));

        Cont_Actor_Doblaje_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Actor_Doblaje_NK.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Actor_Doblaje_NK, ""));
        Cont_Actor_Doblaje_NK.setValue(1);
        Cont_Actor_Doblaje_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Actor_Doblaje_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Actor_Doblaje_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 80, 20));

        Cont_Guionista_PW_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Guionista_PW_NK.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Guionista_PW_NK, ""));
        Cont_Guionista_PW_NK.setValue(1);
        Cont_Guionista_PW_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_PW_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Guionista_PW_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 80, 20));

        Cont_Ensamblador_NK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont_Ensamblador_NK.setEditor(new javax.swing.JSpinner.NumberEditor(Cont_Ensamblador_NK, ""));
        Cont_Ensamblador_NK.setValue(1);
        Cont_Ensamblador_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Ensamblador_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Ensamblador_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 80, -1));

        jLabel39.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Elementos Drive:");
        Nick.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        Drive_Guionista_Nk.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Guionista_Nk.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Guionista_Nk.setText("0");
        Nick.add(Drive_Guionista_Nk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jLabel41.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("/25");
        Nick.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel40.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Elementos Drive:");
        Nick.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        Drive_Escenario_Nk.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Escenario_Nk.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Escenario_Nk.setText("0");
        Nick.add(Drive_Escenario_Nk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel43.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("/20");
        Nick.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        jLabel42.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Elementos Drive:");
        Nick.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        Drive_Personaje_Nk.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Personaje_Nk.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Personaje_Nk.setText("0");
        Nick.add(Drive_Personaje_Nk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel45.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("/55");
        Nick.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel44.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Elementos Drive:");
        Nick.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        Drive_Doblaje_Nk.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_Doblaje_Nk.setForeground(new java.awt.Color(255, 255, 255));
        Drive_Doblaje_Nk.setText("0");
        Nick.add(Drive_Doblaje_Nk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jLabel47.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("/35");
        Nick.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jLabel46.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Elementos Drive:");
        Nick.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        Drive_PW_Nk.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Drive_PW_Nk.setForeground(new java.awt.Color(255, 255, 255));
        Drive_PW_Nk.setText("0");
        Nick.add(Drive_PW_Nk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel48.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("/10");
        Nick.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        jLabel34.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Capitulos Normales:");
        Nick.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        Nk_Cont_Caps.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Cont_Caps.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Cont_Caps.setText("0");
        Nick.add(Nk_Cont_Caps, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 30, -1));

        jLabel27.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Capitulos Plot-Twist:");
        Nick.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        Nk_Cont_PW.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Nk_Cont_PW.setForeground(new java.awt.Color(255, 255, 255));
        Nk_Cont_PW.setText("0");
        Nick.add(Nk_Cont_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 30, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Nick.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 530, 330));

        Fondo_Nick.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Fondo_Nick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/il_fullxfull.4079544308_c7w1.jpg"))); // NOI18N
        Nick.add(Fondo_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        jTabbedPane1.addTab("Nick", Nick);

        Graf.setBackground(new java.awt.Color(204, 153, 255));
        Graf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setBackground(new java.awt.Color(0, 0, 0));
        jLabel67.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("GRÁFICO DE GANANCIAS:");
        Graf.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        Fondo_Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/MenuBg.jpg"))); // NOI18N
        Graf.add(Fondo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 520));

        jTabbedPane1.addTab("Grafico", Graf);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cont_Guionista_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_CNStateChanged
        if(iniciado == true){
            if((int)this.Cont_Guionista_CN.getValue() <= 0){
                this.Cont_Guionista_CN.setValue(1);
                this.repaint();
            }        
            else if((int)this.Cont_Guionista_CN.getValue() + (int)this.Cont_Escenario_CN.getValue() + (int)this.Cont_Animador_CN.getValue() + (int)this.Cont_Actor_Doblaje_CN.getValue() + (int)this.Cont_Ensamblador_CN.getValue() + (int)this.Cont_Guionista_PW_CN.getValue() > max_cn){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Guionista_CN.setValue((int)this.Cont_Guionista_CN.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = cn.getListaGuion().getSize();
                int cont2 = (int) Cont_Guionista_CN.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        cn.deleteDeveloper(0);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        cn.AddDeveloper(0, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Guionista_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Guionista_CNStateChanged

    private void Cont_Escenario_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Escenario_CNStateChanged
        if(iniciado == true){
            if((int)this.Cont_Escenario_CN.getValue() <= 0){
                this.Cont_Escenario_CN.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_CN.getValue() + (int)this.Cont_Escenario_CN.getValue() + (int)this.Cont_Animador_CN.getValue() + (int)this.Cont_Actor_Doblaje_CN.getValue() + (int)this.Cont_Ensamblador_CN.getValue() + (int)this.Cont_Guionista_PW_CN.getValue() > max_cn){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Escenario_CN.setValue((int)this.Cont_Escenario_CN.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = cn.getListaEscenario().getSize();
                int cont2 = (int) Cont_Escenario_CN.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        cn.deleteDeveloper(1);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        cn.AddDeveloper(1, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Escenario_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Escenario_CNStateChanged

    private void Cont_Animador_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Animador_CNStateChanged
        if(iniciado == true){
            if((int)this.Cont_Animador_CN.getValue() <= 0){
                this.Cont_Animador_CN.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_CN.getValue() + (int)this.Cont_Escenario_CN.getValue() + (int)this.Cont_Animador_CN.getValue() + (int)this.Cont_Actor_Doblaje_CN.getValue() + (int)this.Cont_Ensamblador_CN.getValue() + (int)this.Cont_Guionista_PW_CN.getValue() > max_cn){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Animador_CN.setValue((int)this.Cont_Animador_CN.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = cn.getListaAnimacion().getSize();
                int cont2 = (int) Cont_Animador_CN.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        cn.deleteDeveloper(2);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        cn.AddDeveloper(2, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Animador_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Animador_CNStateChanged

    private void Cont_Actor_Doblaje_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Actor_Doblaje_CNStateChanged
        if(iniciado == true){
            if((int)this.Cont_Actor_Doblaje_CN.getValue() <= 0){
                this.Cont_Actor_Doblaje_CN.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_CN.getValue() + (int)this.Cont_Escenario_CN.getValue() + (int)this.Cont_Animador_CN.getValue() + (int)this.Cont_Actor_Doblaje_CN.getValue() + (int)this.Cont_Ensamblador_CN.getValue() + (int)this.Cont_Guionista_PW_CN.getValue() > max_cn){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Actor_Doblaje_CN.setValue((int)this.Cont_Actor_Doblaje_CN.getValue() - 1);
                this.repaint();
            }
            else{        
                int cont = cn.getListaDoblaje().getSize();
                int cont2 = (int) Cont_Actor_Doblaje_CN.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        cn.deleteDeveloper(3);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        cn.AddDeveloper(3, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Actor_Doblaje_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Actor_Doblaje_CNStateChanged

    private void Cont_Guionista_PW_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_PW_CNStateChanged
        if(iniciado==true){
            if((int)this.Cont_Guionista_PW_CN.getValue() <= 0){
                this.Cont_Guionista_PW_CN.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_CN.getValue() + (int)this.Cont_Escenario_CN.getValue() + (int)this.Cont_Animador_CN.getValue() + (int)this.Cont_Actor_Doblaje_CN.getValue() + (int)this.Cont_Ensamblador_CN.getValue() + (int)this.Cont_Guionista_PW_CN.getValue() > max_cn){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Guionista_PW_CN.setValue((int)this.Cont_Guionista_PW_CN.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = cn.getListaPlotTwist().getSize();
                int cont2 = (int) Cont_Guionista_PW_CN.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        cn.deleteDeveloper(4);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        cn.AddDeveloper(4, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Guionista_PW_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Guionista_PW_CNStateChanged

    private void Cont_Guionista_PW_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_PW_NKStateChanged
        if(iniciado == true){
            if((int)this.Cont_Guionista_PW_NK.getValue() <= 0){
                this.Cont_Guionista_PW_NK.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_NK.getValue() + (int)this.Cont_Escenario_NK.getValue() + (int)this.Cont_Animador_NK.getValue() + (int)this.Cont_Actor_Doblaje_NK.getValue() + (int)this.Cont_Ensamblador_NK.getValue() + (int)this.Cont_Guionista_PW_NK.getValue() > max_nk){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Guionista_PW_NK.setValue((int)this.Cont_Guionista_PW_NK.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = nick.getListaPlotTwist().getSize();
                int cont2 = (int) Cont_Guionista_PW_NK.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        nick.deleteDeveloper(4);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        nick.AddDeveloper(4, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Guionista_PW_NK.setValue(1);
            this.repaint();
        }        
    }//GEN-LAST:event_Cont_Guionista_PW_NKStateChanged

    private void Cont_Guionista_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_NKStateChanged
        if(iniciado == true){
            if((int)this.Cont_Guionista_NK.getValue() <= 0){
                this.Cont_Guionista_NK.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_NK.getValue() + (int)this.Cont_Escenario_NK.getValue() + (int)this.Cont_Animador_NK.getValue() + (int)this.Cont_Actor_Doblaje_NK.getValue() + (int)this.Cont_Ensamblador_NK.getValue() + (int)this.Cont_Guionista_PW_NK.getValue() > max_nk){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Guionista_NK.setValue((int)this.Cont_Guionista_NK.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = nick.getListaGuion().getSize();
                int cont2 = (int) Cont_Guionista_NK.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        nick.deleteDeveloper(0);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        nick.AddDeveloper(0, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Guionista_NK.setValue(1);
            this.repaint();
        }        
    }//GEN-LAST:event_Cont_Guionista_NKStateChanged

    private void Cont_Escenario_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Escenario_NKStateChanged
        if(iniciado == true){
            if((int)this.Cont_Escenario_NK.getValue() <= 0){
                this.Cont_Escenario_NK.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_NK.getValue() + (int)this.Cont_Escenario_NK.getValue() + (int)this.Cont_Animador_NK.getValue() + (int)this.Cont_Actor_Doblaje_NK.getValue() + (int)this.Cont_Ensamblador_NK.getValue() + (int)this.Cont_Guionista_PW_NK.getValue() > max_nk){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Escenario_NK.setValue((int)this.Cont_Escenario_NK.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = nick.getListaEscenario().getSize();
                int cont2 = (int) Cont_Escenario_NK.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        nick.deleteDeveloper(1);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        nick.AddDeveloper(1, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Escenario_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Escenario_NKStateChanged

    private void Cont_Animador_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Animador_NKStateChanged
        if(iniciado == true){
            if((int)this.Cont_Animador_NK.getValue() <= 0){
                this.Cont_Animador_NK.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_NK.getValue() + (int)this.Cont_Escenario_NK.getValue() + (int)this.Cont_Animador_NK.getValue() + (int)this.Cont_Actor_Doblaje_NK.getValue() + (int)this.Cont_Ensamblador_NK.getValue() + (int)this.Cont_Guionista_PW_NK.getValue() > max_nk){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Animador_NK.setValue((int)this.Cont_Animador_NK.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = nick.getListaAnimacion().getSize();
                int cont2 = (int) Cont_Animador_NK.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        nick.deleteDeveloper(2);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        nick.AddDeveloper(2, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Animador_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Animador_NKStateChanged

    private void Cont_Actor_Doblaje_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Actor_Doblaje_NKStateChanged
        if(iniciado == true){
            if((int)this.Cont_Actor_Doblaje_NK.getValue() <= 0){
                this.Cont_Actor_Doblaje_NK.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_NK.getValue() + (int)this.Cont_Escenario_NK.getValue() + (int)this.Cont_Animador_NK.getValue() + (int)this.Cont_Actor_Doblaje_NK.getValue() + (int)this.Cont_Ensamblador_NK.getValue() + (int)this.Cont_Guionista_PW_NK.getValue() > max_nk){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Actor_Doblaje_NK.setValue((int)this.Cont_Actor_Doblaje_NK.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = nick.getListaDoblaje().getSize();
                int cont2 = (int) Cont_Actor_Doblaje_NK.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        nick.deleteDeveloper(3);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        nick.AddDeveloper(3, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Actor_Doblaje_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Actor_Doblaje_NKStateChanged

    private void Cont_Ensamblador_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Ensamblador_CNStateChanged
        if(iniciado == true){
            if((int)this.Cont_Ensamblador_CN.getValue() <= 0){
                this.Cont_Ensamblador_CN.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_CN.getValue() + (int)this.Cont_Escenario_CN.getValue() + (int)this.Cont_Animador_CN.getValue() + (int)this.Cont_Actor_Doblaje_CN.getValue() + (int)this.Cont_Ensamblador_CN.getValue() + (int)this.Cont_Guionista_PW_CN.getValue() > max_cn){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Ensamblador_CN.setValue((int)this.Cont_Ensamblador_CN.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = cn.getListaEnsamblador().getSize();
                int cont2 = (int) Cont_Ensamblador_CN.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        cn.deleteDeveloper(5);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        cn.AddDeveloper(5, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Ensamblador_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Ensamblador_CNStateChanged

    private void Cont_Ensamblador_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Ensamblador_NKStateChanged
        if(iniciado == true){
            if((int)this.Cont_Ensamblador_NK.getValue() <= 0){
                this.Cont_Ensamblador_NK.setValue(1);
                this.repaint();
            }
            else if((int)this.Cont_Guionista_NK.getValue() + (int)this.Cont_Escenario_NK.getValue() + (int)this.Cont_Animador_NK.getValue() + (int)this.Cont_Actor_Doblaje_NK.getValue() + (int)this.Cont_Ensamblador_NK.getValue() + (int)this.Cont_Guionista_PW_NK.getValue() > max_nk){
                JOptionPane.showMessageDialog(null,"Número máximo de Empleados Alcanzado!");
                this.Cont_Ensamblador_NK.setValue((int)this.Cont_Ensamblador_NK.getValue() - 1);
                this.repaint();
            }
            else{
                int cont = nick.getListaEnsamblador().getSize();
                int cont2 = (int) Cont_Ensamblador_NK.getValue();

                if (cont > cont2){
                    while (cont > cont2){
                        nick.deleteDeveloper(5);
                        cont --;
                    }
                }else if (cont < cont2){

                    while (cont < cont2){
                        nick.AddDeveloper(5, 1);
                        cont ++;
                    }
                }
            }
        }else{
            this.Cont_Ensamblador_NK.setValue(1);
            this.repaint();
        }        
    }//GEN-LAST:event_Cont_Ensamblador_NKStateChanged

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(iniciado == true){
            //Cartoon
            int guionCN=(int) this.Cont_Guionista_CN.getValue();
            int escCN=(int) this.Cont_Escenario_CN.getValue();
            int aniCn=(int) this.Cont_Animador_CN.getValue();
            int doblaCN=(int) this.Cont_Actor_Doblaje_CN.getValue();
            int plotCN=(int) this.Cont_Guionista_PW_CN.getValue();
            int ensamCN=(int) this.Cont_Ensamblador_CN.getValue();
            //Nick
            int guionN=(int) this.Cont_Guionista_NK.getValue();
            int escN=(int) this.Cont_Escenario_NK.getValue();
            int aniN=(int) this.Cont_Animador_NK.getValue();
            int doblaN=(int) this.Cont_Actor_Doblaje_NK.getValue();
            int plotN=(int) this.Cont_Guionista_PW_NK.getValue();
            int ensamN=(int) this.Cont_Ensamblador_NK.getValue();
            
            int deadline=(int) this.Cont_Deadline.getValue();
            int DuracionD=(int) this.Cont_Day_Duration.getValue();
            
            String TodoTXT="Duracion\n"+DuracionD+";\nDeadline\n"+deadline+";\nCartoon-\nTrabajadores:\nguionista,"+guionCN+
                    "\nescenarios,"+escCN+"\nanimador,"+aniCn+"\ndoblaje,"+doblaCN+"\nplotTwist,"+plotCN+"\nensambladores,"+ensamCN+";\n"
                    + "Nick-\nTrabajadores:\nguionista,"+guionN+
                    "\nescenarios,"+escN+"\nanimador,"+aniN+"\ndoblaje,"+doblaN+"\nplotTwist,"+plotN+"\nensambladores,"+ensamN;
            
            System.out.println(TodoTXT);
            
            try {
            if(getPath()!=null) {
            PrintWriter pw=new PrintWriter(getPath());
            pw.print(TodoTXT);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
            //System.exit(0);
            }
            else{JOptionPane.showMessageDialog(null, "Error!! Primero debe cargar un archivo txt");}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!!!");
            System.exit(0);
        } 
        
        }else{
            JOptionPane.showMessageDialog(null,"La simulación no ha empezado todavía, no se puede guardar");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void Cont_DeadlineStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_DeadlineStateChanged
        if(iniciado == true){
            if((int)this.Cont_Deadline.getValue() <= 0){
                this.Cont_Deadline.setValue(1);
                this.repaint();
            }
        }else{
            this.Cont_Deadline.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_DeadlineStateChanged

    private void Cont_Day_DurationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Day_DurationStateChanged
        if(iniciado == true){
            if((int)this.Cont_Day_Duration.getValue() <= 0){
                this.Cont_Day_Duration.setValue(1);
                this.repaint();
            }
        }else{
            this.Cont_Day_Duration.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Day_DurationStateChanged

    private void IniciarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSimulacionActionPerformed
        // TODO add your handling code here:
//    
//    //se lee el txt
    if (iniciado==false){
        iniciado=true;
    JFileChooser file = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(".TXT","txt");
    file.setFileSelectionMode(JFileChooser.FILES_ONLY);
    file.setFileFilter(filter);
    int selection=file.showOpenDialog(this);
    
    if(selection==JFileChooser.APPROVE_OPTION) {
        File archive=file.getSelectedFile(); 
        String path=archive.getAbsolutePath();
        setPath(path);
    
        if(!path.contains("txt")) {
        JOptionPane.showMessageDialog(null, "Por favor elija un archivo del tipo txt");
        }
        else {
        try{
            File archivo = new File (path);
            FileReader fr = new FileReader(archivo); 
            BufferedReader br = new BufferedReader(fr); 
                 
            String cadena;
            String complete=""; 
      
            while ((cadena=br.readLine())!=null) { //lee hasta llegar a null que significa que se acabo el archivo

                if(!cadena.isEmpty()&& !cadena.isBlank()) { //revisa que la linea no sea vacia/que el tamaño de la cadena sea 0
                    complete+=cadena+"\n";
                }
            }
                
            fr.close();
            br.close();
            complete=complete.trim(); //quita linea en blanco al final
            //el !"".equals es para verificar que el string no sea solo un espacio en blanco
            if(!"".equals(complete)) {
                String[] info;
                String [] todo=complete.split(";");
                String [] Dias=todo[0].split("\n");
                int duracionDias=Integer.parseInt(Dias[1]);
                if(duracionDias<=0) {
                    throw new Exception("La duracion del dia no puede ser 0");
                }
                this.Cont_Day_Duration.setValue(duracionDias);
                //System.out.println(duracionDias); //todo bien aqui
                String[] Diasdead=todo[1].split("\n");
                //System.out.println(Diasdead[1]);
                int Deadline=Integer.parseInt(Diasdead[2]);
                if(Deadline<=0) {
                    throw new Exception("El tiempo de entrega no puede ser 0");
                }
                this.Cont_Deadline.setValue(Deadline);
                getNk_Deadline_Counter().setText(Integer.toString(Deadline));
                getCn_Deadline_Counter().setText(Integer.toString(Deadline));
                
                //ya tengo la duracion del dia y la deadline se crean/agregan las cosas
                nick.setDuracionDia(duracionDias);
                cn.setDuracionDia(duracionDias);
                nick.setDiasEntrega(Deadline);
                cn.setDiasEntrega(Deadline);
                
                nick.getPersonalDrive().setDiasEntrega(Deadline);
                nick.getPersonalDrive().setDiasEntregaOriginal(Deadline);
                
                cn.getPersonalDrive().setDiasEntrega(Deadline);
                cn.getPersonalDrive().setDiasEntregaOriginal(Deadline);
                
                ProjectManager nickpm=new ProjectManager(40,duracionDias,nick.getMutex(),nick.getPersonalDrive());
                Director nickDir = new Director(60, duracionDias, nick.getMutex(), nick.getPersonalDrive(), nickpm);
                ProjectManager cartoonpm=new ProjectManager(40,duracionDias,cn.getMutex(),cn.getPersonalDrive());
                Director cartoonDir = new Director(60, duracionDias, cn.getMutex(), cn.getPersonalDrive(), cartoonpm);
                
               //todo2 tiene cosas de cartoon
                todo[2]=todo[2].trim();
                String [] infoestu1=todo[2].split("-");
                //todo3 tiene cosas de nick
                todo[3]=todo[3].trim();
                String [] infoestu2=todo[3].split("-");
                
                if (infoestu1[0].compareTo("Cartoon")==0) { //el if es porsia 
//                     System.out.println("jajajaj "+infoestu1[0]);
//                     System.out.println(infoestu1[1]);
                     infoestu1[1]=infoestu1[1].trim();
                     String [] divTra=infoestu1[1].split(":");
                     divTra[1]=divTra[1].trim();
                     String [] trabajadores=divTra[1].split("\n");
                     
                     for (int i = 0; i < trabajadores.length; i++) {
                         //System.out.println(i+" "+trabajadores[i]);
                         String [] cantidad=trabajadores[i].split(",");
                         //cantidad[0] debe tener el nombre del trabajador y el [1] la cantidad de ese tipo
                         //cuando se vaya a crear el dev le paso i que seria el tipo y cantidad[1] que seria la cantidad
                         //System.out.println(cantidad[1]);
                         if(Integer.parseInt(cantidad[1])>0) {
                            cn.AddDeveloper(i,Integer.parseInt(cantidad[1]));
                         }else {
                         throw new Exception("La cantidad de trabajadores no puede ser 0");
                         }
                         
                     }
                    cartoonpm.start();
                    cartoonDir.start();
                    System.out.println("Listo cartoon");
                    this.Cont_Actor_Doblaje_CN.setValue(cn.getListaDoblaje().getSize());
                    this.Cont_Animador_CN.setValue(cn.getListaAnimacion().getSize());
                    this.Cont_Ensamblador_CN.setValue(cn.getListaEnsamblador().getSize());
                    this.Cont_Escenario_CN.setValue(cn.getListaEscenario().getSize());
                    this.Cont_Guionista_CN.setValue(cn.getListaGuion().getSize());
                    this.Cont_Guionista_PW_CN.setValue(cn.getListaPlotTwist().getSize());
                 
                 }
                 else if (infoestu1[0].compareTo("Nick")==0) {
                     infoestu1[1]=infoestu1[1].trim();
                     String [] divTra=infoestu1[1].split(":");
                     divTra[1]=divTra[1].trim();
                     String [] trabajadores=divTra[1].split("\n");
                     
                     for (int i = 0; i < trabajadores.length; i++) {
                         //System.out.println(i+" "+trabajadores[i]);
                         String [] cantidad=trabajadores[i].split(",");
                         //cantidad[0] debe tener el nombre del trabajador y el [1] la cantidad de ese tipo
                         //cuando se vaya a crear el dev le paso i que seria el tipo y cantidad[1] que seria la cantidad
                         //System.out.println(cantidad[1]);
                         if(Integer.parseInt(cantidad[1])>0) {
                            nick.AddDeveloper(i,Integer.parseInt(cantidad[1]));
                         } else {
                         throw new Exception("La cantidad de trabajadores no puede ser 0");
                         }
                         
                    }
                    nickpm.start();
                    nickDir.start(); 
                    this.Cont_Actor_Doblaje_NK.setValue(nick.getListaDoblaje().getSize());
                    this.Cont_Animador_NK.setValue(nick.getListaAnimacion().getSize());
                    this.Cont_Ensamblador_NK.setValue(nick.getListaEnsamblador().getSize());
                    this.Cont_Escenario_NK.setValue(nick.getListaEscenario().getSize());
                    this.Cont_Guionista_NK.setValue(nick.getListaGuion().getSize());
                    this.Cont_Guionista_PW_NK.setValue(nick.getListaPlotTwist().getSize());
                    
                 }
                 
                 if (infoestu2[0].compareTo("Cartoon")==0) {
//                     System.out.println("jejejeje "+infoestu2[0]);
//                     System.out.println(infoestu2[1]);
                     infoestu1[1]=infoestu1[1].trim();
                     String [] divTra=infoestu1[1].split(":");
                     divTra[1]=divTra[1].trim();
                     String [] trabajadores=divTra[1].split("\n");
                     
                     for (int i = 0; i < trabajadores.length; i++) {
                         //System.out.println(i+" "+trabajadores[i]);
                         String [] cantidad=trabajadores[i].split(",");
                         //cantidad[0] debe tener el nombre del trabajador y el [1] la cantidad de ese tipo
                         //cuando se vaya a crear el dev le paso i que seria el tipo y cantidad[1] que seria la cantidad
                         //System.out.println(cantidad[1]);
                         if(Integer.parseInt(cantidad[1])>0) { 
                         cn.AddDeveloper(i, Integer.parseInt(cantidad[1]));
                        }else {
                         throw new Exception("La cantidad de trabajadores no puede ser 0");
                         }
                         
                     }
                    cartoonpm.start();
                    cartoonDir.start(); 
                    this.Cont_Actor_Doblaje_CN.setValue(cn.getListaDoblaje().getSize());
                    this.Cont_Animador_CN.setValue(cn.getListaAnimacion().getSize());
                    this.Cont_Ensamblador_CN.setValue(cn.getListaEnsamblador().getSize());
                    this.Cont_Escenario_CN.setValue(cn.getListaEscenario().getSize());
                    this.Cont_Guionista_CN.setValue(cn.getListaGuion().getSize());
                    this.Cont_Guionista_PW_CN.setValue(cn.getListaPlotTwist().getSize());
                 }
                 else if (infoestu2[0].compareTo("Nick")==0) {
                     String [] divTra=infoestu2[1].split(":");
                     divTra[1]=divTra[1].trim();
                     String [] trabajadores=divTra[1].split("\n");
                     System.out.println(infoestu2[0]);
                     for (int i = 0; i < trabajadores.length; i++) {
                         //System.out.println(i+" "+trabajadores[i]);
                         String [] cantidad=trabajadores[i].split(",");
                         //cantidad[0] debe tener el nombre del trabajador y el [1] la cantidad de ese tipo
                         //cuando se vaya a crear el dev le paso i que seria el tipo y cantidad[1] que seria la cantidad
                         //System.out.println(cantidad[1]);
                         if(Integer.parseInt(cantidad[1])>0) {
                            nick.AddDeveloper(i, Integer.parseInt(cantidad[1]));
                         }else {
                         throw new Exception("La cantidad de trabajadores no puede ser 0");
                         }
                         
                     }
                    nickpm.start();
                    nickDir.start(); 
                    this.Cont_Actor_Doblaje_NK.setValue(nick.getListaDoblaje().getSize());
                    this.Cont_Animador_NK.setValue(nick.getListaAnimacion().getSize());
                    this.Cont_Ensamblador_NK.setValue(nick.getListaEnsamblador().getSize());
                    this.Cont_Escenario_NK.setValue(nick.getListaEscenario().getSize());
                    this.Cont_Guionista_NK.setValue(nick.getListaGuion().getSize());
                    this.Cont_Guionista_PW_NK.setValue(nick.getListaPlotTwist().getSize());
                      
                      System.out.println("Listo nick");
                 
                 
                 }
                 
                
//                for (int i = 0; i < todo.length; i++) {
//                  System.out.println(todo[i]);  
//                }
                
            
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erorr!!!! Asegurate de haber cargado el archivo correcto");
            System.exit(0);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "La simulacion ya ha iniciado");
    }
    }

//    nickpm.start();
//    nickDir.start();
    }//GEN-LAST:event_IniciarSimulacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cartoon;
    private static javax.swing.JLabel Cn_Cont_Caps;
    private static javax.swing.JLabel Cn_Cont_PW;
    private static javax.swing.JLabel Cn_Deadline_Counter;
    private static javax.swing.JLabel Cn_Director_State;
    private static javax.swing.JLabel Cn_Discount_Counter;
    private static javax.swing.JLabel Cn_Fail_Counter;
    private static javax.swing.JLabel Cn_Gain_Counter;
    private static javax.swing.JLabel Cn_Loss_Counter;
    private static javax.swing.JLabel Cn_Pm_State;
    private static javax.swing.JLabel Cn_Utility_Counter;
    private javax.swing.JPanel Config;
    private javax.swing.JSpinner Cont_Actor_Doblaje_CN;
    private javax.swing.JSpinner Cont_Actor_Doblaje_NK;
    private javax.swing.JSpinner Cont_Animador_CN;
    private javax.swing.JSpinner Cont_Animador_NK;
    private javax.swing.JSpinner Cont_Day_Duration;
    private javax.swing.JSpinner Cont_Deadline;
    private javax.swing.JSpinner Cont_Ensamblador_CN;
    private javax.swing.JSpinner Cont_Ensamblador_NK;
    private javax.swing.JSpinner Cont_Escenario_CN;
    private javax.swing.JSpinner Cont_Escenario_NK;
    private javax.swing.JSpinner Cont_Guionista_CN;
    private javax.swing.JSpinner Cont_Guionista_NK;
    private javax.swing.JSpinner Cont_Guionista_PW_CN;
    private javax.swing.JSpinner Cont_Guionista_PW_NK;
    private static javax.swing.JLabel Drive_Doblaje_Cn;
    private static javax.swing.JLabel Drive_Doblaje_Nk;
    private static javax.swing.JLabel Drive_Escenario_Cn;
    private static javax.swing.JLabel Drive_Escenario_Nk;
    private static javax.swing.JLabel Drive_Guionista_Cn;
    private static javax.swing.JLabel Drive_Guionista_Nk;
    private static javax.swing.JLabel Drive_PW_Cn;
    private static javax.swing.JLabel Drive_PW_Nk;
    private static javax.swing.JLabel Drive_Personaje_Cn;
    private static javax.swing.JLabel Drive_Personaje_Nk;
    private javax.swing.JLabel Finn;
    private javax.swing.JLabel Finn1;
    private javax.swing.JLabel Fondo_Cn;
    private javax.swing.JLabel Fondo_Menu;
    private javax.swing.JLabel Fondo_Menu1;
    private javax.swing.JLabel Fondo_Nick;
    private javax.swing.JLabel Gary;
    private javax.swing.JPanel Graf;
    private javax.swing.JButton IniciarSimulacion;
    private javax.swing.JLabel Jellyfish;
    private javax.swing.JLabel Logo_Cn;
    private javax.swing.JLabel Logo_Nk;
    private javax.swing.JPanel Nick;
    private static javax.swing.JLabel Nk_Cont_Caps;
    private static javax.swing.JLabel Nk_Cont_PW;
    private static javax.swing.JLabel Nk_Deadline_Counter;
    private static javax.swing.JLabel Nk_Director_State;
    private static javax.swing.JLabel Nk_Discount_Counter;
    private static javax.swing.JLabel Nk_Fail_Counter;
    private static javax.swing.JLabel Nk_Gain_Counter;
    private static javax.swing.JLabel Nk_Loss_Counter;
    private static javax.swing.JLabel Nk_Pm_State;
    private static javax.swing.JLabel Nk_Utility_Counter;
    private javax.swing.JLabel Spongebob;
    private javax.swing.JLabel Spongebob1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
