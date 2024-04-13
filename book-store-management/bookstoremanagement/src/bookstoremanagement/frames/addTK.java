/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoremanagement.frames;

import static bookstoremanagement.MainPage.TKTable;
import static bookstoremanagement.MainPage.deleteTable;
import bookstoremanagement.model.Backend.TaiKhoan.QuanLyTaiKhoanBUS;
import bookstoremanagement.model.Frontend.FormHienThi.HienThiTaiKhoan;
import java.awt.Color;
import javax.swing.JPanel;
import bookstoremanagement.model.Frontend.FormThemSua.ThemSuaTaiKhoanForm;
import javax.swing.JFrame;

public class addTK extends javax.swing.JFrame {
//      public static void setTextQuyen()
//    {
//        String text = (String) SubQuyenTable.getValueAt(SubQuyenTable.getSelectedRow(), 1);
//        
//        txMaQuyen.setText(text);
//    }
   
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
//     public static void setTextNhanVien()
//    {
//        String text = (String) SubNVTable.getValueAt(SubNVTable.getSelectedRow(), 1);
//        
//        txMaNV.setText(text);
//    }
    /**
     * Creates new form addTK
     */
    public addTK() {
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

        pnlAddTK = new javax.swing.JPanel();
        pnlTK = new javax.swing.JPanel();
        txtTenTK = new javax.swing.JTextField();
        lblTenTK = new javax.swing.JLabel();
        pnlMaNV = new javax.swing.JPanel();
        txtMaNV = new javax.swing.JTextField();
        lblMaNV = new javax.swing.JLabel();
        ChonMaNV = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlMatKhau = new javax.swing.JPanel();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        pnlMaQuyen = new javax.swing.JPanel();
        txtMaQuyen = new javax.swing.JTextField();
        lblMaQuyen = new javax.swing.JLabel();
        ChonMaQuyen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlThem = new javax.swing.JPanel();
        lblThem = new javax.swing.JLabel();
        pnlHuy = new javax.swing.JPanel();
        lblHuy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAddTK.setBackground(new java.awt.Color(255, 255, 255));

        lblTenTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenTK.setText("Tên tài khoản");

        javax.swing.GroupLayout pnlTKLayout = new javax.swing.GroupLayout(pnlTK);
        pnlTK.setLayout(pnlTKLayout);
        pnlTKLayout.setHorizontalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenTK)
                    .addGroup(pnlTKLayout.createSequentialGroup()
                        .addComponent(lblTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTKLayout.setVerticalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenTK, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMaNV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });
        pnlMaNV.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 32));

        lblMaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaNV.setText("Mã nhân viên");
        pnlMaNV.add(lblMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        ChonMaNV.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaNV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaNVMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaNVMouseReleased(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstoremanagement/icons/icons8-pen-15.png"))); // NOI18N

        javax.swing.GroupLayout ChonMaNVLayout = new javax.swing.GroupLayout(ChonMaNV);
        ChonMaNV.setLayout(ChonMaNVLayout);
        ChonMaNVLayout.setHorizontalGroup(
            ChonMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
        ChonMaNVLayout.setVerticalGroup(
            ChonMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        pnlMaNV.add(ChonMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 30));

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        javax.swing.GroupLayout pnlMatKhauLayout = new javax.swing.GroupLayout(pnlMatKhau);
        pnlMatKhau.setLayout(pnlMatKhauLayout);
        pnlMatKhauLayout.setHorizontalGroup(
            pnlMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMatKhauLayout.createSequentialGroup()
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMatKhau))
                .addContainerGap())
        );
        pnlMatKhauLayout.setVerticalGroup(
            pnlMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        pnlMaQuyen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaQuyenActionPerformed(evt);
            }
        });
        pnlMaQuyen.add(txtMaQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 32));

        lblMaQuyen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaQuyen.setText("Mã quyền");
        pnlMaQuyen.add(lblMaQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 79, 16));

        ChonMaQuyen.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaQuyen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaQuyen.setForeground(new java.awt.Color(204, 204, 204));
        ChonMaQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaQuyenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaQuyenMouseReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstoremanagement/icons/icons8-pen-15.png"))); // NOI18N

        javax.swing.GroupLayout ChonMaQuyenLayout = new javax.swing.GroupLayout(ChonMaQuyen);
        ChonMaQuyen.setLayout(ChonMaQuyenLayout);
        ChonMaQuyenLayout.setHorizontalGroup(
            ChonMaQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
        ChonMaQuyenLayout.setVerticalGroup(
            ChonMaQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        pnlMaQuyen.add(ChonMaQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 30, 30));

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
            .addGroup(pnlThemLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlThemLayout.setVerticalGroup(
            pnlThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
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
            .addGroup(pnlHuyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlHuyLayout.setVerticalGroup(
            pnlHuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlAddTKLayout = new javax.swing.GroupLayout(pnlAddTK);
        pnlAddTK.setLayout(pnlAddTKLayout);
        pnlAddTKLayout.setHorizontalGroup(
            pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddTKLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        pnlAddTKLayout.setVerticalGroup(
            pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddTKLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlAddTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAddTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAddTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void ChonMaNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaNVMousePressed
        changecolor(ChonMaNV,new Color(60,63,65));
    }//GEN-LAST:event_ChonMaNVMousePressed

    private void ChonMaNVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaNVMouseReleased
        changecolor(ChonMaNV,new Color(204,204,204));
        new ChonNVForm().setVisible(true);
    }//GEN-LAST:event_ChonMaNVMouseReleased

    private void txtMaQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaQuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaQuyenActionPerformed

    private void ChonMaQuyenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaQuyenMousePressed
        changecolor(ChonMaQuyen,new Color(60,63,65));
    }//GEN-LAST:event_ChonMaQuyenMousePressed

    private void ChonMaQuyenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaQuyenMouseReleased
        changecolor(ChonMaQuyen,new Color(204,204,204));
        new ChonMaQuyenForm().setVisible(true);
    }//GEN-LAST:event_ChonMaQuyenMouseReleased

    private void pnlThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMousePressed
        changecolor(pnlThem,new Color(0,163,163));
    }//GEN-LAST:event_pnlThemMousePressed

    private void pnlThemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMouseReleased
        changecolor(pnlThem,new Color(0,204,204));

        ThemSuaTaiKhoanForm.btnThemMouseClicked();
        deleteTable(TKTable);
        QuanLyTaiKhoanBUS qltkBUS = new QuanLyTaiKhoanBUS();
        HienThiTaiKhoan.AddTable(qltkBUS.getDstk(), TKTable);
        this.dispose();

        //        setTableCellAlignment(JLabel.CENTER,pTable);
    }//GEN-LAST:event_pnlThemMouseReleased

    private void pnlHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseClicked

    }//GEN-LAST:event_pnlHuyMouseClicked

    private void pnlHuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMousePressed
        changecolor(pnlHuy,new Color(221,0,0));
    }//GEN-LAST:event_pnlHuyMousePressed

    private void pnlHuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseReleased
        changecolor(pnlHuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_pnlHuyMouseReleased

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
            java.util.logging.Logger.getLogger(addTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChonMaNV;
    private javax.swing.JPanel ChonMaQuyen;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblHuy;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaQuyen;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenTK;
    private javax.swing.JLabel lblThem;
    private javax.swing.JPanel pnlAddTK;
    private javax.swing.JPanel pnlHuy;
    private javax.swing.JPanel pnlMaNV;
    private javax.swing.JPanel pnlMaQuyen;
    private javax.swing.JPanel pnlMatKhau;
    private javax.swing.JPanel pnlTK;
    private javax.swing.JPanel pnlThem;
    public static javax.swing.JTextField txtMaNV;
    public static javax.swing.JTextField txtMaQuyen;
    public static javax.swing.JTextField txtMatKhau;
    public static javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}
