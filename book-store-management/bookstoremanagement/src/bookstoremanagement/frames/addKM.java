/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoremanagement.frames;
import javax.swing.JPanel;
import java.awt.Color;
import bookstoremanagement.MainPage;
import bookstoremanagement.model.Frontend.FormThemSua.ThemSuaKhuyenMaiForm;
import javax.swing.JFrame;

/**
 *
 * @author songnguyen
 */
public class addKM extends javax.swing.JFrame {
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    /**
     * Creates new form addKM
     */
    public addKM() {
        initComponents();
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserBD = new com.raven.datechooser.DateChooser();
        dateChooserKT = new com.raven.datechooser.DateChooser();
        pnlAddKM = new javax.swing.JPanel();
        pnlMaKM = new javax.swing.JPanel();
        txtMaKM = new javax.swing.JTextField();
        lblMaKM = new javax.swing.JLabel();
        pnlTenKM = new javax.swing.JPanel();
        lblTenKM = new javax.swing.JLabel();
        txtTenKM = new javax.swing.JTextField();
        pnlDieuKienKM = new javax.swing.JPanel();
        txtDieuKienKM = new javax.swing.JTextField();
        lblDieuKienKM = new javax.swing.JLabel();
        pnlPhanTramKM = new javax.swing.JPanel();
        txtPhanTramKM = new javax.swing.JTextField();
        lblPhanTramKM = new javax.swing.JLabel();
        pnlNgayBD = new javax.swing.JPanel();
        lblNgayBD = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        pnlNgayKT = new javax.swing.JPanel();
        txtNgayKT = new javax.swing.JTextField();
        lblNgayKT = new javax.swing.JLabel();
        pnlThem = new javax.swing.JPanel();
        lblThem = new javax.swing.JLabel();
        pnlHuy = new javax.swing.JPanel();
        lblHuy = new javax.swing.JLabel();

        dateChooserBD.setDateFormat("yyyy-MM-dd");
        dateChooserBD.setTextRefernce(txtNgayBD);

        dateChooserKT.setDateFormat("yyyy-MM-dd");
        dateChooserKT.setTextRefernce(txtNgayKT);

        pnlAddKM.setBackground(new java.awt.Color(255, 255, 255));

        txtMaKM.setEditable(false);

        lblMaKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaKM.setText("Mã khuyến mãi");

        javax.swing.GroupLayout pnlMaKMLayout = new javax.swing.GroupLayout(pnlMaKM);
        pnlMaKM.setLayout(pnlMaKMLayout);
        pnlMaKMLayout.setHorizontalGroup(
            pnlMaKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMaKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGroup(pnlMaKMLayout.createSequentialGroup()
                        .addComponent(lblMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMaKMLayout.setVerticalGroup(
            pnlMaKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaKMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTenKM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenKM.setText("Tên khuyến mãi");
        pnlTenKM.add(lblTenKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));
        pnlTenKM.add(txtTenKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 30));

        lblDieuKienKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDieuKienKM.setText("Điều kiện khuyến mãi");

        javax.swing.GroupLayout pnlDieuKienKMLayout = new javax.swing.GroupLayout(pnlDieuKienKM);
        pnlDieuKienKM.setLayout(pnlDieuKienKMLayout);
        pnlDieuKienKMLayout.setHorizontalGroup(
            pnlDieuKienKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDieuKienKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDieuKienKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDieuKienKM, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGroup(pnlDieuKienKMLayout.createSequentialGroup()
                        .addComponent(lblDieuKienKM)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDieuKienKMLayout.setVerticalGroup(
            pnlDieuKienKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDieuKienKMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDieuKienKM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDieuKienKM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblPhanTramKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhanTramKM.setText("Phần trăm khuyến mãi");

        javax.swing.GroupLayout pnlPhanTramKMLayout = new javax.swing.GroupLayout(pnlPhanTramKM);
        pnlPhanTramKM.setLayout(pnlPhanTramKMLayout);
        pnlPhanTramKMLayout.setHorizontalGroup(
            pnlPhanTramKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhanTramKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPhanTramKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhanTramKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPhanTramKMLayout.createSequentialGroup()
                        .addComponent(txtPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPhanTramKMLayout.setVerticalGroup(
            pnlPhanTramKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhanTramKMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblNgayBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayBD.setText("Ngày bắt đầu");

        txtNgayBD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNgayBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayBDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNgayBDLayout = new javax.swing.GroupLayout(pnlNgayBD);
        pnlNgayBD.setLayout(pnlNgayBDLayout);
        pnlNgayBDLayout.setHorizontalGroup(
            pnlNgayBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNgayBDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNgayBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGroup(pnlNgayBDLayout.createSequentialGroup()
                        .addComponent(lblNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNgayBDLayout.setVerticalGroup(
            pnlNgayBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNgayBDLayout.createSequentialGroup()
                .addComponent(lblNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNgayKT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNgayKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayKTActionPerformed(evt);
            }
        });

        lblNgayKT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayKT.setText("Ngày kết thúc");

        javax.swing.GroupLayout pnlNgayKTLayout = new javax.swing.GroupLayout(pnlNgayKT);
        pnlNgayKT.setLayout(pnlNgayKTLayout);
        pnlNgayKTLayout.setHorizontalGroup(
            pnlNgayKTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNgayKTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNgayKTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNgayKTLayout.createSequentialGroup()
                        .addComponent(lblNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNgayKTLayout.setVerticalGroup(
            pnlNgayKTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNgayKTLayout.createSequentialGroup()
                .addComponent(lblNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlThem.setBackground(new java.awt.Color(0, 204, 204));
        pnlThem.setPreferredSize(new java.awt.Dimension(80, 24));
        pnlThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlThemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlThemMouseReleased(evt);
            }
        });

        lblThem.setBackground(new java.awt.Color(255, 255, 255));
        lblThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThem.setForeground(new java.awt.Color(255, 255, 255));
        lblThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThem.setText("Thêm");

        javax.swing.GroupLayout pnlThemLayout = new javax.swing.GroupLayout(pnlThem);
        pnlThem.setLayout(pnlThemLayout);
        pnlThemLayout.setHorizontalGroup(
            pnlThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        pnlThemLayout.setVerticalGroup(
            pnlThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThem, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        pnlHuy.setBackground(new java.awt.Color(255, 0, 0));
        pnlHuy.setPreferredSize(new java.awt.Dimension(80, 24));
        pnlHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHuyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHuyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlHuyMouseReleased(evt);
            }
        });

        lblHuy.setBackground(new java.awt.Color(255, 255, 255));
        lblHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHuy.setForeground(new java.awt.Color(255, 255, 255));
        lblHuy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHuy.setText("Hủy");

        javax.swing.GroupLayout pnlHuyLayout = new javax.swing.GroupLayout(pnlHuy);
        pnlHuy.setLayout(pnlHuyLayout);
        pnlHuyLayout.setHorizontalGroup(
            pnlHuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        pnlHuyLayout.setVerticalGroup(
            pnlHuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlAddKMLayout = new javax.swing.GroupLayout(pnlAddKM);
        pnlAddKM.setLayout(pnlAddKMLayout);
        pnlAddKMLayout.setHorizontalGroup(
            pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddKMLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDieuKienKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlPhanTramKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTenKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        pnlAddKMLayout.setVerticalGroup(
            pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddKMLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTenKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDieuKienKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(pnlAddKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAddKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAddKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayBDActionPerformed

    private void txtNgayKTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayKTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayKTActionPerformed

    private void pnlHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseClicked

    }//GEN-LAST:event_pnlHuyMouseClicked

    private void pnlHuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMousePressed
        changecolor(pnlHuy,new Color(221,0,0));
    }//GEN-LAST:event_pnlHuyMousePressed

    private void pnlHuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseReleased
        changecolor(pnlHuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_pnlHuyMouseReleased

    private void pnlThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMousePressed
        changecolor(pnlThem,new Color(0,163,163));
    }//GEN-LAST:event_pnlThemMousePressed

    private void pnlThemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMouseReleased
        changecolor(pnlThem,new Color(0,204,204));

        ThemSuaKhuyenMaiForm.btnThemMouseClicked();

        //        ThemSuaSanPhamForm.btnSuaMouseClicked();
    }//GEN-LAST:event_pnlThemMouseReleased

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
            java.util.logging.Logger.getLogger(addKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addKM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooserBD;
    private com.raven.datechooser.DateChooser dateChooserKT;
    private javax.swing.JLabel lblDieuKienKM;
    private javax.swing.JLabel lblHuy;
    private javax.swing.JLabel lblMaKM;
    private javax.swing.JLabel lblNgayBD;
    private javax.swing.JLabel lblNgayKT;
    private javax.swing.JLabel lblPhanTramKM;
    private javax.swing.JLabel lblTenKM;
    private javax.swing.JLabel lblThem;
    private javax.swing.JPanel pnlAddKM;
    private javax.swing.JPanel pnlDieuKienKM;
    private javax.swing.JPanel pnlHuy;
    private javax.swing.JPanel pnlMaKM;
    private javax.swing.JPanel pnlNgayBD;
    private javax.swing.JPanel pnlNgayKT;
    private javax.swing.JPanel pnlPhanTramKM;
    private javax.swing.JPanel pnlTenKM;
    private javax.swing.JPanel pnlThem;
    public static javax.swing.JTextField txtDieuKienKM;
    public static javax.swing.JTextField txtMaKM;
    public static javax.swing.JTextField txtNgayBD;
    public static javax.swing.JTextField txtNgayKT;
    public static javax.swing.JTextField txtPhanTramKM;
    public static javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
