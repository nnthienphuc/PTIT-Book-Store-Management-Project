/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoremanagement.frames;

import java.awt.Color;
import javax.swing.JPanel;
import bookstoremanagement.MainPage;
import static bookstoremanagement.MainPage.KHTable;
import static bookstoremanagement.MainPage.deleteTable;
import static bookstoremanagement.frames.ChonKHForm.SubKHTable;
import bookstoremanagement.model.Backend.KhachHang.QuanLyKhachHangBUS;
import bookstoremanagement.model.Frontend.FormHienThi.HienThiKhachHang;
import bookstoremanagement.model.Frontend.FormThemSua.ThemSuaKhachHangForm;
import javax.swing.JFrame;

/**
 *
 * @author songnguyen
 */
public class addKH extends javax.swing.JFrame {
    public static void setText()
    {
        String makh = (String) SubKHTable.getValueAt(SubKHTable.getSelectedRow(), 1);
        String tenkh =(String) SubKHTable.getValueAt(SubKHTable.getSelectedRow(), 2);
        MainPage.txKhachHang.setText(makh + "-"+ tenkh);
        
        
    }
    
   
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    /**
     * Creates new form addKH
     */
    public addKH() {
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

        pnlAddKH = new javax.swing.JPanel();
        pnlMaKH = new javax.swing.JPanel();
        txtMaKH = new javax.swing.JTextField();
        lblMaKH = new javax.swing.JLabel();
        pnlTenKH = new javax.swing.JPanel();
        txtTenKH = new javax.swing.JTextField();
        lblTenKH = new javax.swing.JLabel();
        pnlDiaChi = new javax.swing.JPanel();
        txtDiaChi = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        pnlSDT = new javax.swing.JPanel();
        txtSDT = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        pnlThem = new javax.swing.JPanel();
        lblThem = new javax.swing.JLabel();
        pnlHuy = new javax.swing.JPanel();
        lblHuy = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAddKH.setBackground(new java.awt.Color(255, 255, 255));

        txtMaKH.setEditable(false);

        lblMaKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaKH.setText("Mã khách hàng");

        javax.swing.GroupLayout pnlMaKHLayout = new javax.swing.GroupLayout(pnlMaKH);
        pnlMaKH.setLayout(pnlMaKHLayout);
        pnlMaKHLayout.setHorizontalGroup(
            pnlMaKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMaKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaKH)
                    .addGroup(pnlMaKHLayout.createSequentialGroup()
                        .addComponent(lblMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMaKHLayout.setVerticalGroup(
            pnlMaKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaKHLayout.createSequentialGroup()
                .addComponent(lblMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenKH.setText("Tên khách hàng");

        javax.swing.GroupLayout pnlTenKHLayout = new javax.swing.GroupLayout(pnlTenKH);
        pnlTenKH.setLayout(pnlTenKHLayout);
        pnlTenKHLayout.setHorizontalGroup(
            pnlTenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTenKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKH)
                    .addGroup(pnlTenKHLayout.createSequentialGroup()
                        .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTenKHLayout.setVerticalGroup(
            pnlTenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTenKHLayout.createSequentialGroup()
                .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDiaChi.setText("Địa chỉ");

        javax.swing.GroupLayout pnlDiaChiLayout = new javax.swing.GroupLayout(pnlDiaChi);
        pnlDiaChi.setLayout(pnlDiaChiLayout);
        pnlDiaChiLayout.setHorizontalGroup(
            pnlDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiaChiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi)
                    .addGroup(pnlDiaChiLayout.createSequentialGroup()
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDiaChiLayout.setVerticalGroup(
            pnlDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiaChiLayout.createSequentialGroup()
                .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSDT.setText("Số điện thoại");

        javax.swing.GroupLayout pnlSDTLayout = new javax.swing.GroupLayout(pnlSDT);
        pnlSDT.setLayout(pnlSDTLayout);
        pnlSDTLayout.setHorizontalGroup(
            pnlSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSDTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT)
                    .addGroup(pnlSDTLayout.createSequentialGroup()
                        .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSDTLayout.setVerticalGroup(
            pnlSDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSDTLayout.createSequentialGroup()
                .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnlAddKHLayout = new javax.swing.GroupLayout(pnlAddKH);
        pnlAddKH.setLayout(pnlAddKHLayout);
        pnlAddKHLayout.setHorizontalGroup(
            pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddKHLayout.createSequentialGroup()
                .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAddKHLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddKHLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pnlDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddKHLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(pnlTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddKHLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(56, 56, 56))
        );
        pnlAddKHLayout.setVerticalGroup(
            pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddKHLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pnlAddKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        getContentPane().add(pnlAddKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlHuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseReleased
        changecolor(pnlHuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_pnlHuyMouseReleased

    private void pnlHuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMousePressed
        changecolor(pnlHuy,new Color(221,0,0));
    }//GEN-LAST:event_pnlHuyMousePressed

    private void pnlHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseClicked

    }//GEN-LAST:event_pnlHuyMouseClicked

    private void pnlThemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMouseReleased
        changecolor(pnlThem,new Color(0,204,204));

        ThemSuaKhachHangForm.btnThemMouseClicked();
        deleteTable(KHTable);
        QuanLyKhachHangBUS qlkhBUS = new QuanLyKhachHangBUS();
        HienThiKhachHang.addTable(qlkhBUS.getDskh(), KHTable);
        
        deleteTable(SubKHTable);
        HienThiKhachHang.addTable(qlkhBUS.getDskh(),SubKHTable);
        this.dispose();

        //        setTableCellAlignment(JLabel.CENTER,pTable);
    }//GEN-LAST:event_pnlThemMouseReleased

    private void pnlThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMousePressed
        changecolor(pnlThem,new Color(0,163,163));
    }//GEN-LAST:event_pnlThemMousePressed

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
            java.util.logging.Logger.getLogger(addKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblHuy;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThem;
    private javax.swing.JPanel pnlAddKH;
    private javax.swing.JPanel pnlDiaChi;
    private javax.swing.JPanel pnlHuy;
    private javax.swing.JPanel pnlMaKH;
    private javax.swing.JPanel pnlSDT;
    private javax.swing.JPanel pnlTenKH;
    private javax.swing.JPanel pnlThem;
    public static javax.swing.JTextField txtDiaChi;
    public static javax.swing.JTextField txtMaKH;
    public static javax.swing.JTextField txtSDT;
    public static javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
