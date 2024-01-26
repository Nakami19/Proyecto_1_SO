/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Natalia
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Ventana() {
        initComponents();        
        this.setLocationRelativeTo(null);
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
        Cartoon = new javax.swing.JPanel();
        Cont_Guionista_PW_CN = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cont_Guionista_CN = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        Cont_Diseñador_CN = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Cont_Animador_CN = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Cont_Actor_Doblaje_CN = new javax.swing.JSpinner();
        Nick = new javax.swing.JPanel();
        Cont_Guionista_PW_NK = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cont_Guionista_NK = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        Cont_Diseñador_NK = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        Cont_Animador_NK = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        Cont_Actor_Doblaje_NK = new javax.swing.JSpinner();
        Graf = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Config.setBackground(new java.awt.Color(204, 153, 255));
        Config.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Config", Config);

        Cartoon.setBackground(new java.awt.Color(0, 0, 0));
        Cartoon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cont_Guionista_PW_CN.setValue(1);
        Cont_Guionista_PW_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_PW_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Guionista_PW_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 20));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setText("GUIONISTAS DE PLOT-TWIST:");
        Cartoon.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, -1));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setText("GUIONISTAS:");
        Cartoon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Cont_Guionista_CN.setValue(1);
        Cont_Guionista_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Guionista_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, 20));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setText("DISEÑADORES DE  PERSONAJES:");
        Cartoon.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, -1));

        Cont_Diseñador_CN.setValue(1);
        Cont_Diseñador_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Diseñador_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Diseñador_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 80, 20));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setText("ANIMADORES DE  PERSONAJES:");
        Cartoon.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, -1));

        Cont_Animador_CN.setValue(1);
        Cont_Animador_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Animador_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Animador_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, 20));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setText("ACTORES DE DOBLAJE:");
        Cartoon.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        Cont_Actor_Doblaje_CN.setValue(1);
        Cont_Actor_Doblaje_CN.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Actor_Doblaje_CNStateChanged(evt);
            }
        });
        Cartoon.add(Cont_Actor_Doblaje_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 20));

        jTabbedPane1.addTab("Cartoon", Cartoon);

        Nick.setBackground(new java.awt.Color(255, 153, 0));
        Nick.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cont_Guionista_PW_NK.setValue(1);
        Cont_Guionista_PW_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_PW_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Guionista_PW_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("GUIONISTAS DE PLOT-TWIST:");
        Nick.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GUIONISTAS:");
        Nick.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Cont_Guionista_NK.setValue(1);
        Cont_Guionista_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Guionista_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Guionista_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DISEÑADORES DE  PERSONAJES:");
        Nick.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, -1));

        Cont_Diseñador_NK.setValue(1);
        Cont_Diseñador_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Diseñador_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Diseñador_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 80, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ANIMADORES DE  PERSONAJES:");
        Nick.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, -1));

        Cont_Animador_NK.setValue(1);
        Cont_Animador_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Animador_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Animador_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ACTORES DE DOBLAJE:");
        Nick.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        Cont_Actor_Doblaje_NK.setValue(1);
        Cont_Actor_Doblaje_NK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Cont_Actor_Doblaje_NKStateChanged(evt);
            }
        });
        Nick.add(Cont_Actor_Doblaje_NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 20));

        jTabbedPane1.addTab("Nick", Nick);

        Graf.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout GrafLayout = new javax.swing.GroupLayout(Graf);
        Graf.setLayout(GrafLayout);
        GrafLayout.setHorizontalGroup(
            GrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        GrafLayout.setVerticalGroup(
            GrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Grafico", Graf);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cont_Guionista_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_CNStateChanged
        if((int)this.Cont_Guionista_CN.getValue() <= 0){
            this.Cont_Guionista_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Guionista_CNStateChanged

    private void Cont_Diseñador_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Diseñador_CNStateChanged
        if((int)this.Cont_Diseñador_CN.getValue() <= 0){
            this.Cont_Diseñador_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Diseñador_CNStateChanged

    private void Cont_Animador_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Animador_CNStateChanged
        if((int)this.Cont_Animador_CN.getValue() <= 0){
            this.Cont_Animador_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Animador_CNStateChanged

    private void Cont_Actor_Doblaje_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Actor_Doblaje_CNStateChanged
        if((int)this.Cont_Actor_Doblaje_CN.getValue() <= 0){
            this.Cont_Actor_Doblaje_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Actor_Doblaje_CNStateChanged

    private void Cont_Guionista_PW_CNStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_PW_CNStateChanged
        if((int)this.Cont_Guionista_PW_CN.getValue() <= 0){
            this.Cont_Guionista_PW_CN.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Guionista_PW_CNStateChanged

    private void Cont_Guionista_PW_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_PW_NKStateChanged
        if((int)this.Cont_Guionista_PW_NK.getValue() <= 0){
            this.Cont_Guionista_PW_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Guionista_PW_NKStateChanged

    private void Cont_Guionista_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Guionista_NKStateChanged
        if((int)this.Cont_Guionista_NK.getValue() <= 0){
            this.Cont_Guionista_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Guionista_NKStateChanged

    private void Cont_Diseñador_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Diseñador_NKStateChanged
        if((int)this.Cont_Diseñador_NK.getValue() <= 0){
            this.Cont_Diseñador_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Diseñador_NKStateChanged

    private void Cont_Animador_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Animador_NKStateChanged
        if((int)this.Cont_Animador_NK.getValue() <= 0){
            this.Cont_Animador_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Animador_NKStateChanged

    private void Cont_Actor_Doblaje_NKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Cont_Actor_Doblaje_NKStateChanged
        if((int)this.Cont_Actor_Doblaje_NK.getValue() <= 0){
            this.Cont_Actor_Doblaje_NK.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_Cont_Actor_Doblaje_NKStateChanged

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
    private javax.swing.JPanel Config;
    private javax.swing.JSpinner Cont_Actor_Doblaje_CN;
    private javax.swing.JSpinner Cont_Actor_Doblaje_NK;
    private javax.swing.JSpinner Cont_Animador_CN;
    private javax.swing.JSpinner Cont_Animador_NK;
    private javax.swing.JSpinner Cont_Diseñador_CN;
    private javax.swing.JSpinner Cont_Diseñador_NK;
    private javax.swing.JSpinner Cont_Guionista_CN;
    private javax.swing.JSpinner Cont_Guionista_NK;
    private javax.swing.JSpinner Cont_Guionista_PW_CN;
    private javax.swing.JSpinner Cont_Guionista_PW_NK;
    private javax.swing.JPanel Graf;
    private javax.swing.JPanel Nick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
