
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sevinc
 */
public class KullaniciGirisEkran extends javax.swing.JFrame {

    /**
     * Creates new form KullaniciGirisEkran
     */
   

    public KullaniciGirisEkran() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullanıcıGrsEkranBtn = new javax.swing.JButton();
        kullaniciKullaniciAdiText = new javax.swing.JTextField();
        kullaniciSifreText = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Şifre :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("KULLANICI GİRİŞ");

        kullanıcıGrsEkranBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kullanıcıGrsEkranBtn.setText("Giriş");
        kullanıcıGrsEkranBtn.setPreferredSize(new java.awt.Dimension(59, 27));
        kullanıcıGrsEkranBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanıcıGrsEkranBtnActionPerformed(evt);
            }
        });

        kullaniciKullaniciAdiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciKullaniciAdiTextActionPerformed(evt);
            }
        });

        kullaniciSifreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciSifreTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullaniciSifreText)
                    .addComponent(kullaniciKullaniciAdiText))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(kullanıcıGrsEkranBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullaniciKullaniciAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kullanıcıGrsEkranBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciKullaniciAdiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciKullaniciAdiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciKullaniciAdiTextActionPerformed

    private void kullanıcıGrsEkranBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanıcıGrsEkranBtnActionPerformed
       ConnectionTrial ct = new ConnectionTrial();
     if(ct.userLogin(kullaniciKullaniciAdiText.getText(), kullaniciSifreText.getText())){
         KullaniciEkran ke = new KullaniciEkran();
         ke.setVisible(true);
         temizle();
     }
     else{
         JOptionPane.showMessageDialog(null, "Bilgilerinizi kontrol !", "! Dikkat", HEIGHT);
         temizle();
     }
     

    }//GEN-LAST:event_kullanıcıGrsEkranBtnActionPerformed

    private void kullaniciSifreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciSifreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciSifreTextActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciGirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciGirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciGirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciGirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciGirisEkran().setVisible(true);
            }
        });
    }
    public void temizle(){
        kullaniciKullaniciAdiText.setText("");
        kullaniciSifreText.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kullaniciKullaniciAdiText;
    private javax.swing.JTextField kullaniciSifreText;
    private javax.swing.JButton kullanıcıGrsEkranBtn;
    // End of variables declaration//GEN-END:variables
}
