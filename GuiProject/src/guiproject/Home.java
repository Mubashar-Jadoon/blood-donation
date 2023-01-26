/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;
import javax.swing.ImageIcon;
import javax.swing.JLabel;/**
 *
 * @author abc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        setTitle("Home Page");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Title = new javax.swing.JLabel();
        JL_Donar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_DOnar = new javax.swing.JTextArea();
        JL_Receiver = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_receiver = new javax.swing.JTextArea();
        btn_Search_Donar = new javax.swing.JButton();
        btn_Add_DOnar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        JL_Title.setBackground(new java.awt.Color(153, 153, 153));
        JL_Title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_Title.setForeground(new java.awt.Color(255, 0, 51));
        JL_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Title.setText("Welcome To Blood Donation Community");
        JL_Title.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JL_Title.setIconTextGap(8);
        JL_Title.setMaximumSize(new java.awt.Dimension(219, 30));
        JL_Title.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        JL_Donar.setBackground(new java.awt.Color(102, 102, 102));
        JL_Donar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Donar.setForeground(new java.awt.Color(255, 51, 0));
        JL_Donar.setText("Donar");

        txt_DOnar.setColumns(20);
        txt_DOnar.setRows(5);
        txt_DOnar.setText("Donar are those who Donate Blood for \nthe patient of Thelisemia and  save lot of \nInnocent Life.");
        jScrollPane1.setViewportView(txt_DOnar);

        JL_Receiver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JL_Receiver.setForeground(new java.awt.Color(0, 153, 0));
        JL_Receiver.setText("Receiver");

        txt_receiver.setColumns(20);
        txt_receiver.setRows(5);
        txt_receiver.setText("Receiver will search on this this platform \nand find easily according to their required\nBlood Group.\n");
        jScrollPane3.setViewportView(txt_receiver);

        btn_Search_Donar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Search_Donar.setForeground(new java.awt.Color(51, 0, 255));
        btn_Search_Donar.setText("Search  Donar");
        btn_Search_Donar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Search_DonarActionPerformed(evt);
            }
        });

        btn_Add_DOnar.setForeground(new java.awt.Color(51, 0, 255));
        btn_Add_DOnar.setText("Add Donar");
        btn_Add_DOnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_DOnarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_Donar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Receiver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(541, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btn_Add_DOnar)
                .addGap(33, 33, 33)
                .addComponent(btn_Search_Donar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_Donar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_Receiver)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Add_DOnar)
                    .addComponent(btn_Search_Donar))
                .addContainerGap(584, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Search_DonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Search_DonarActionPerformed
        // TODO add your handling code here:
        Details_of_Donar dd=new Details_of_Donar();
        dd.setVisible(true);
    }//GEN-LAST:event_btn_Search_DonarActionPerformed

    private void btn_Add_DOnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_DOnarActionPerformed
        // TODO add your handling code here:
        Donar dn=new Donar();
        dn.setVisible(true);
    }//GEN-LAST:event_btn_Add_DOnarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Donar;
    private javax.swing.JLabel JL_Receiver;
    private javax.swing.JLabel JL_Title;
    private javax.swing.JButton btn_Add_DOnar;
    private javax.swing.JButton btn_Search_Donar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txt_DOnar;
    private javax.swing.JTextArea txt_receiver;
    // End of variables declaration//GEN-END:variables
}