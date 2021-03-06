/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valeria
 */
public class statistics extends javax.swing.JFrame {

    ArrayList<List<String>> SList; //list of answers given 
    ArrayList correct = new ArrayList();
    ArrayList mostIncCorr = new ArrayList();
    int pertimes;
    String getMostInc;
    String getMostCorr;
    String timesPer;
    
    public statistics() {
        //reading file .csv
        try {
            initComponents();
            SList = new ArrayList<>();
            List<String> scores;
            Scanner stats = new Scanner(new File("src/quiz/statistics.csv"));
            stats.useDelimiter(",");
            String[] f = stats.nextLine().split(",");

            while (stats.hasNext()) {
                scores = Arrays.asList(stats.nextLine().split(","));
                SList.add(scores);

            }
            stats.close();
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        // array of correct answers to use for comparison
        correct.add(0); 
        correct.add(0); //two zeroes at the beginning so same index (because statistics.csv has visitorID and total score columns
        String[] corrAns = {"[C", " B", " B", " A", " B", " C", " A", " D", " C", " A]"};
        for (int i = 0; i < corrAns.length; i++) {
            correct.add(corrAns[i]);
        }

        mostInc();
        mostCorr();
    }

    public int pertimes(int indexQ) {
        //calculates the percentage of time a question is answered correctly
        //needs the index to the question; Question 1 = index 2, Question 2 = index 3, and so on...
        int times = 0;
        for (int i = 0; i < SList.size(); i++) {
            if (correct.get(indexQ).equals(SList.get(i).get(indexQ))) {
                times++;
            }
        }

        pertimes = (times * 100) / SList.size();
        //System.out.println(pertimes + "%");
        jLabel4.setText("<html>" + "Question " + (indexQ-1) + " is " + pertimes + "%" + "<html>");
        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12));
        return pertimes;
    }

    public String mostInc() {  //most incorrectly answered
        mostIncCorr.add(300); //irrelevant number, only to match index and question number
        for (int i = 2; i < correct.size()-2; i++) {
            mostIncCorr.add(pertimes(i));
        }
 
        int minIndex = mostIncCorr.indexOf(Collections.min(mostIncCorr));
        getMostInc = "Question most often incorrect is question " + minIndex;
        jLabel3.setText("<html>" + getMostInc + "<html>");
        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12));
        return getMostInc;
    }

    public String mostCorr() {
        mostIncCorr.set(0, 0);
        int maxIndex = mostIncCorr.indexOf(Collections.max(mostIncCorr));
        // System.out.println("Question most often correct is question " + maxIndex);
        getMostCorr = "Question most often correct is question " + maxIndex;
        jLabel2.setText("<html>"+ getMostCorr + "<html>");
        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12));

        return getMostCorr;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Questions", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setText("Percentage of times a question is answered correctly:");

        jLabel2.setText("<html>"+ getMostCorr + "<html>");

        jLabel3.setText("<html>"+ getMostInc + "<html>");

        jLabel4.setText("<html>" + " " + "<html>");

        jButton5.setText("back");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setText("Statistics");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton5)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        System.out.println(jComboBox1.getSelectedIndex());
           if(jComboBox1.getSelectedIndex() == 0) {jLabel4.setText("<html>" + " " + "<html>");}
           if(jComboBox1.getSelectedIndex() == 1) {pertimes(2);}
           if(jComboBox1.getSelectedIndex() == 2) {pertimes(3);}
           if(jComboBox1.getSelectedIndex() == 3) {pertimes(4);}
           if(jComboBox1.getSelectedIndex() == 4) {pertimes(5);}
           if(jComboBox1.getSelectedIndex() == 5) {pertimes(6);}
           if(jComboBox1.getSelectedIndex() == 6) {pertimes(7);}
           if(jComboBox1.getSelectedIndex() == 7) {pertimes(8);}
           if(jComboBox1.getSelectedIndex() == 8) {pertimes(9);}
           if(jComboBox1.getSelectedIndex() == 9) {pertimes(10);}
           if(jComboBox1.getSelectedIndex() == 10) {pertimes(11);}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        home back = new home();
        back.setLocationRelativeTo(null);
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new statistics().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
