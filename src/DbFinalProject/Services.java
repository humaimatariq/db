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
public class Services extends javax.swing.JFrame
{

    /**
     * Creates new form NewJFrame
     */
    public Services()
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
        plumbing1 = new javax.swing.JButton();
        painting = new javax.swing.JButton();
        cleaning1 = new javax.swing.JButton();
        electrician1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        plumbing1.setBackground(new java.awt.Color(255, 255, 51));
        plumbing1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        plumbing1.setForeground(new java.awt.Color(51, 51, 51));
        plumbing1.setText("Plumbing");
        plumbing1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                plumbing1ActionPerformed(evt);
            }
        });

        painting.setBackground(new java.awt.Color(255, 255, 51));
        painting.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        painting.setForeground(new java.awt.Color(51, 51, 51));
        painting.setText("Painting");
        painting.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                paintingActionPerformed(evt);
            }
        });

        cleaning1.setBackground(new java.awt.Color(255, 255, 51));
        cleaning1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        cleaning1.setForeground(new java.awt.Color(51, 51, 51));
        cleaning1.setText("Cleaning");
        cleaning1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cleaning1ActionPerformed(evt);
            }
        });

        electrician1.setBackground(new java.awt.Color(255, 255, 51));
        electrician1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        electrician1.setForeground(new java.awt.Color(51, 51, 51));
        electrician1.setText("Electrician ");
        electrician1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                electrician1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 34)); // NOI18N
        jLabel1.setText("What can we help you with");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cleaning1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plumbing1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(electrician1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(electrician1)
                    .addComponent(cleaning1))
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plumbing1)
                    .addComponent(painting))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleaning1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cleaning1ActionPerformed
    {//GEN-HEADEREND:event_cleaning1ActionPerformed
new Cleaning3().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cleaning1ActionPerformed

    private void electrician1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_electrician1ActionPerformed
    {//GEN-HEADEREND:event_electrician1ActionPerformed
new Electrician4().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_electrician1ActionPerformed

    private void plumbing1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_plumbing1ActionPerformed
    {//GEN-HEADEREND:event_plumbing1ActionPerformed
new Plumbing2().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_plumbing1ActionPerformed

    private void paintingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_paintingActionPerformed
    {//GEN-HEADEREND:event_paintingActionPerformed
new Painting1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_paintingActionPerformed

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
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleaning1;
    private javax.swing.JButton electrician1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton painting;
    private javax.swing.JButton plumbing1;
    // End of variables declaration//GEN-END:variables
}
