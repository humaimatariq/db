/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbFinalProject;

/**
 *
 * @author Umaima Tariq
 */
public class Electrician4 extends javax.swing.JFrame
{

    /**
     * Creates new form Electrician4
     */
    public Electrician4()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        electrician4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        price = new javax.swing.JLabel();
        eprice = new javax.swing.JLabel();
        urgent = new javax.swing.JLabel();
        no = new javax.swing.JCheckBox();
        yes = new javax.swing.JCheckBox();
        request = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255), 3));

        electrician4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        electrician4.setForeground(new java.awt.Color(0, 204, 204));
        electrician4.setText("Electrician");

        label1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 153));
        label1.setText("Installs and repairs electrical wiring, systems, and");

        label4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 153, 153));
        label4.setText("complies with electrical codes.");

        price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        price.setForeground(new java.awt.Color(0, 153, 153));
        price.setText("Price");

        eprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        eprice.setForeground(new java.awt.Color(0, 153, 153));
        eprice.setText("Rs:5000");

        urgent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        urgent.setForeground(new java.awt.Color(0, 153, 153));
        urgent.setText("Urgent");

        no.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        no.setForeground(new java.awt.Color(0, 153, 153));
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noActionPerformed(evt);
            }
        });

        yes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        yes.setForeground(new java.awt.Color(0, 153, 153));
        yes.setText("YES");
        yes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yesActionPerformed(evt);
            }
        });

        request.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        request.setForeground(new java.awt.Color(0, 153, 153));
        request.setText("Send Request");
        request.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                requestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(electrician4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(price)
                                        .addGap(154, 154, 154)
                                        .addComponent(eprice))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(urgent)
                                        .addGap(108, 108, 108)
                                        .addComponent(no)
                                        .addGap(45, 45, 45)
                                        .addComponent(yes)))))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(request)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(electrician4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eprice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urgent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no)
                    .addComponent(yes))
                .addGap(43, 43, 43)
                .addComponent(request)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yesActionPerformed
    {//GEN-HEADEREND:event_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_noActionPerformed
    {//GEN-HEADEREND:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void requestActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_requestActionPerformed
    {//GEN-HEADEREND:event_requestActionPerformed
new Payment().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_requestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Electrician4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Electrician4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Electrician4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Electrician4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Electrician4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel electrician4;
    private javax.swing.JLabel eprice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label4;
    private javax.swing.JCheckBox no;
    private javax.swing.JLabel price;
    private javax.swing.JButton request;
    private javax.swing.JLabel urgent;
    private javax.swing.JCheckBox yes;
    // End of variables declaration//GEN-END:variables
}
