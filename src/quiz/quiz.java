/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mneeraalbaoud
 * @author valeria
 */
public class quiz extends javax.swing.JDialog {

    /**
     * Creates new form quiz
     * @param parent
     * @param modal
     */
    public quiz(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        QList=new ArrayList <>();
        List<String> Q;
        ArrayList<String> correctans = new ArrayList<>();
        
        try {
 
            Scanner Sscanner = new Scanner(new File("src/quiz/questionbank.csv"));
            Sscanner.useDelimiter(",");
            String[] f = Sscanner.nextLine().split(",");
            
            while(Sscanner.hasNext()) {
            	Q = Arrays.asList(Sscanner.nextLine().split(","));
            	QList.add(Q);
                
            }
            Sscanner.close();
            
            jLabel1.setText("<html>"+QList.get(0).get(0)+"<html>");
            jLabel1.setFont(new java.awt.Font("Consolas", 0, 14));
            jRadioButton1.setText("<html>"+QList.get(0).get(1)+"<html>");
            jRadioButton1.setFont(new java.awt.Font("Consolas", 0, 12));
            jRadioButton2.setText("<html>"+QList.get(0).get(2)+"<html>");
            jRadioButton2.setFont(new java.awt.Font("Consolas", 0, 12));
            jRadioButton3.setText("<html>"+QList.get(0).get(3)+"<html>");
            jRadioButton3.setFont(new java.awt.Font("Consolas", 0, 12));
            jRadioButton4.setText("<html>"+QList.get(0).get(4)+"<html>");
            jRadioButton4.setFont(new java.awt.Font("Consolas", 0, 12));
            
            for (int i=0; i < QList.size(); ++i){
                correctans.add(QList.get(i).get(5));
            }
            
           //System.out.println(correctans);
        } 
        catch ( FileNotFoundException ex ) {
            System.out.println( "File not found!" );
        }
        catch ( NoSuchElementException ex ) {
            System.out.println( "File not1 found!" );
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Next");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        
        jButton3.setText("Quit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(45, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setActionCommand("A");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.setActionCommand("B");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.setActionCommand("C");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.setActionCommand("D");
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton4.setText("back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.out.println(An);
        System.exit(0);
         
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {                                      
        home back = new home();
        back.setLocationRelativeTo(null);
        back.setVisible(true);
        //back.setAlwaysOnTop(true);
        //quiz takequiz = new quiz(Frame, false);
        dispose();
    } 
    public void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(buttonGroup1.getSelection()==null){
            An.add("NA");
        }
        else{
            An.add(buttonGroup1.getSelection().getActionCommand());
            System.out.println(QList.get(An.size()-1).get(5));
            if (buttonGroup1.getSelection().getActionCommand().equals(QList.get(An.size()-1).get(5))){
                JOptionPane.showMessageDialog(null, String.format("<html><center>Correct!</center></html>"), null, JOptionPane.PLAIN_MESSAGE);
                score = score + 1;
            } else {
                JOptionPane.showMessageDialog(null, String.format("<html><center> Wrong answer :( <br>%s</center></html>", (QList.get(An.size()-1).get(6))), null, JOptionPane.ERROR_MESSAGE);
            }
           
        }
        
        if(An.size()<QList.size()){
            jLabel1.setText("<html>"+QList.get(An.size()).get(0)+"<html>");
            jLabel1.setFont(new java.awt.Font("Consolas", 0, 14));
            jRadioButton1.setText("<html>"+QList.get(An.size()).get(1)+"<html>");
            jRadioButton1.setFont(new java.awt.Font("Consolas", 0, 12));
            jRadioButton2.setText("<html>"+QList.get(An.size()).get(2)+"<html>");
            jRadioButton2.setFont(new java.awt.Font("Consolas", 0, 12));
            jRadioButton3.setText("<html>"+QList.get(An.size()).get(3)+"<html>");
            jRadioButton3.setFont(new java.awt.Font("Consolas", 0, 12));
            jRadioButton4.setText("<html>"+QList.get(An.size()).get(4)+"<html>");
            jRadioButton4.setFont(new java.awt.Font("Consolas", 0, 12));
            buttonGroup1.clearSelection();
        }
        else{
            jLabel1.setText("You got " + score + " questions right.");
            jLabel1.setFont(new java.awt.Font("Consolas", 0, 16));
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
            
            //JOptionPane.showMessageDialog(null, "You got " + score + " questions right.");
        }
    }//GEN-LAST:event_jButton1MouseClicked
    
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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                quiz dialog = new quiz(new javax.swing.JFrame(), true);
                dialog.setLocationRelativeTo(null);
                dialog.setSize(600,500);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    ArrayList <List<String>> QList;
    ArrayList<String> An=new ArrayList<>();
    ArrayList<String> CorrectAns = new ArrayList<>();
    Integer score = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JFrame Frame;
    // End of variables declaration//GEN-END:variables
}