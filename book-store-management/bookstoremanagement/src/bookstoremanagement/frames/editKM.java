/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoremanagement.frames;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static bookstoremanagement.frames.ChonKMForm.SubKMTable;
import bookstoremanagement.model.Backend.KhuyenMai.KhuyenMai;
import bookstoremanagement.model.Backend.KhuyenMai.QuanLyKhuyenMaiBUS;
import bookstoremanagement.model.Frontend.FormThemSua.ThemSuaKhuyenMaiForm;
import bookstoremanagement.MainPage;
import static bookstoremanagement.MainPage.KMTable;
import javax.swing.JFrame;
/**
 *
 * @author songnguyen
 */
public class editKM extends javax.swing.JFrame {
    public static void setText()
    {   
        
        
        String makm = (String) SubKMTable.getValueAt(SubKMTable.getSelectedRow(), 1);
        KhuyenMai kmBH = null;
        QuanLyKhuyenMaiBUS qlkmBUS = new QuanLyKhuyenMaiBUS();
        
        
        for (KhuyenMai km : qlkmBUS.getDskm()) {
                if (km.getMaKM().equals(makm)) {
                    kmBH = km;
                }
            }
        if(kmBH.getTrangThai() == "Đã kết thúc"){
            JOptionPane.showMessageDialog(null, "Khuyến mãi đã kết thúc");
        }
        else if(kmBH.getDieuKienKM() > Float.parseFloat(MainPage.txTienTong.getText()) ){
            JOptionPane.showMessageDialog(null, "Chưa đủ tổng tiền hóa đơn để áp dụng khuyến mãi");
        } else{ 
        String tenkm = (String) SubKMTable.getValueAt(SubKMTable.getSelectedRow(), 2);
        MainPage.txKhuyenMai.setText(makm+"-"+tenkm);
        MainPage.KhuyenMai = kmBH;
        }
    }
    
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
//    public void GetInput(){
//        String maKM = "";
//               maKM  =  (String)KMTable.getValueAt(KMTable.getSelectedRow(), 1);
//        if(maKM == "")
//        {
//        JOptionPane.showMessageDialog(null, "Chưa chọn khuyến mãi nào để sửa");
//        }
//        else
//        {
//        SuaKM(maKM);
//        }
//    }
    
   
 
    public static void SuaKM ()
    {   
         String maKM =  (String)KMTable.getValueAt(KMTable.getSelectedRow(), 1);
        KhuyenMai kmSua = null;
        QuanLyKhuyenMaiBUS qlkmBUS = new QuanLyKhuyenMaiBUS();
        for (KhuyenMai km : qlkmBUS.getDskm()) {
                if (km.getMaKM().equals(maKM)) {
                    kmSua = km;
                }
            }
//            if (spSua == null) {
//                JOptionPane.showMessageDialog(null, "Lỗi, không tìm thấy sản phẩm");
//                this.dispose();
//            }

            
            txtMaKM.setText(kmSua.getMaKM());
            txtTenKM.setText(kmSua.getTenKM());
            txtDieuKienKM.setText(String.valueOf(kmSua.getDieuKienKM()));
            txtPhanTramKM.setText(String.valueOf(kmSua.getPhanTramKM()));
            txtNgayBD.setText(String.valueOf(kmSua.getNgayBD()));
            txtNgayKT.setText(String.valueOf(kmSua.getNgayKT()));
    }
    
    public static void XoaKM(String maKM){
        QuanLyKhuyenMaiBUS qlkmBUS = new QuanLyKhuyenMaiBUS();
           
             
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa " + maKM + " ?", 
                        "Chú ý", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    qlkmBUS.delete(maKM);
                   
                }
            }
    
    
    public static void ThemKM()
    {   
        QuanLyKhuyenMaiBUS qlkmBUS = new QuanLyKhuyenMaiBUS();
        addKM.txtMaKM.setText(qlkmBUS.getNextID());
      
    }
    /**
     * Creates new form eeditKM
     */
    public editKM() {
        initComponents();
        SuaKM();
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
        pnlEditKM = new javax.swing.JPanel();
        pnlMaKM = new javax.swing.JPanel();
        txtMaKM = new javax.swing.JTextField();
        lblMaKM = new javax.swing.JLabel();
        pnlTenKM = new javax.swing.JPanel();
        txtTenKM = new javax.swing.JTextField();
        lblTenKM = new javax.swing.JLabel();
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
        pnlSua = new javax.swing.JPanel();
        lblSua = new javax.swing.JLabel();
        pnlHuy = new javax.swing.JPanel();
        lblHuy = new javax.swing.JLabel();

        dateChooserBD.setDateFormat("yyyy-MM-dd");
        dateChooserBD.setTextRefernce(txtNgayBD);

        dateChooserKT.setDateFormat("yyyy-MM-dd");
        dateChooserKT.setTextRefernce(txtNgayKT);

        pnlEditKM.setBackground(new java.awt.Color(255, 255, 255));

        txtMaKM.setEditable(false);
        txtMaKM.setToolTipText("Không được phép thay đổi Mã KM");

        lblMaKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaKM.setText("Mã khuyến mãi");

        javax.swing.GroupLayout pnlMaKMLayout = new javax.swing.GroupLayout(pnlMaKM);
        pnlMaKM.setLayout(pnlMaKMLayout);
        pnlMaKMLayout.setHorizontalGroup(
            pnlMaKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMaKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(pnlMaKMLayout.createSequentialGroup()
                        .addComponent(lblMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        txtTenKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKMActionPerformed(evt);
            }
        });
        pnlTenKM.add(txtTenKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 33));

        lblTenKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenKM.setText("Tên khuyến mãi");
        pnlTenKM.add(lblTenKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        lblDieuKienKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDieuKienKM.setText("Điều kiện khuyến mãi");

        javax.swing.GroupLayout pnlDieuKienKMLayout = new javax.swing.GroupLayout(pnlDieuKienKM);
        pnlDieuKienKM.setLayout(pnlDieuKienKMLayout);
        pnlDieuKienKMLayout.setHorizontalGroup(
            pnlDieuKienKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDieuKienKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDieuKienKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDieuKienKM, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(pnlDieuKienKMLayout.createSequentialGroup()
                        .addComponent(lblDieuKienKM)
                        .addGap(0, 47, Short.MAX_VALUE)))
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

        txtPhanTramKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhanTramKMActionPerformed(evt);
            }
        });

        lblPhanTramKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhanTramKM.setText("Phần trăm khuyến mãi");

        javax.swing.GroupLayout pnlPhanTramKMLayout = new javax.swing.GroupLayout(pnlPhanTramKM);
        pnlPhanTramKM.setLayout(pnlPhanTramKMLayout);
        pnlPhanTramKMLayout.setHorizontalGroup(
            pnlPhanTramKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhanTramKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPhanTramKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhanTramKM, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(pnlPhanTramKMLayout.createSequentialGroup()
                        .addComponent(txtPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPhanTramKMLayout.setVerticalGroup(
            pnlPhanTramKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhanTramKMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPhanTramKM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblNgayBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayBD.setText("Ngày bắt đầu");

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
                    .addGroup(pnlNgayBDLayout.createSequentialGroup()
                        .addComponent(lblNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNgayBDLayout.setVerticalGroup(
            pnlNgayBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNgayBDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pnlNgayKT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNgayKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayKTActionPerformed(evt);
            }
        });
        pnlNgayKT.add(txtNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 30));

        lblNgayKT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayKT.setText("Ngày kết thúc");
        pnlNgayKT.add(lblNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        pnlSua.setBackground(new java.awt.Color(0, 204, 204));
        pnlSua.setPreferredSize(new java.awt.Dimension(80, 24));
        pnlSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSuaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlSuaMouseReleased(evt);
            }
        });

        lblSua.setBackground(new java.awt.Color(255, 255, 255));
        lblSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSua.setForeground(new java.awt.Color(255, 255, 255));
        lblSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSua.setText("Sửa");

        javax.swing.GroupLayout pnlSuaLayout = new javax.swing.GroupLayout(pnlSua);
        pnlSua.setLayout(pnlSuaLayout);
        pnlSuaLayout.setHorizontalGroup(
            pnlSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlSuaLayout.setVerticalGroup(
            pnlSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnlEditKMLayout = new javax.swing.GroupLayout(pnlEditKM);
        pnlEditKM.setLayout(pnlEditKMLayout);
        pnlEditKMLayout.setHorizontalGroup(
            pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditKMLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDieuKienKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlSua, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlPhanTramKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTenKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        pnlEditKMLayout.setVerticalGroup(
            pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditKMLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTenKM, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDieuKienKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(pnlEditKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSua, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(pnlEditKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlEditKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKMActionPerformed

    private void txtNgayBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayBDActionPerformed

    private void txtNgayKTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayKTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayKTActionPerformed

    private void pnlSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuaMousePressed
        changecolor(pnlSua,new Color(0,163,163));
    }//GEN-LAST:event_pnlSuaMousePressed

    private void pnlSuaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuaMouseReleased
        changecolor(pnlSua,new Color(0,204,204));

        ThemSuaKhuyenMaiForm.btnSuaMouseClicked();

        //        setTableCellAlignment(JLabel.CENTER,pTable);
    }//GEN-LAST:event_pnlSuaMouseReleased

    private void pnlHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseClicked

    }//GEN-LAST:event_pnlHuyMouseClicked

    private void pnlHuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMousePressed
        changecolor(pnlHuy,new Color(221,0,0));
    }//GEN-LAST:event_pnlHuyMousePressed

    private void pnlHuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseReleased
        changecolor(pnlHuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_pnlHuyMouseReleased

    private void txtPhanTramKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhanTramKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhanTramKMActionPerformed

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
            java.util.logging.Logger.getLogger(editKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editKM().setVisible(true);
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
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblTenKM;
    private javax.swing.JPanel pnlDieuKienKM;
    private javax.swing.JPanel pnlEditKM;
    private javax.swing.JPanel pnlHuy;
    private javax.swing.JPanel pnlMaKM;
    private javax.swing.JPanel pnlNgayBD;
    private javax.swing.JPanel pnlNgayKT;
    private javax.swing.JPanel pnlPhanTramKM;
    private javax.swing.JPanel pnlSua;
    private javax.swing.JPanel pnlTenKM;
    public static javax.swing.JTextField txtDieuKienKM;
    public static javax.swing.JTextField txtMaKM;
    public static javax.swing.JTextField txtNgayBD;
    public static javax.swing.JTextField txtNgayKT;
    public static javax.swing.JTextField txtPhanTramKM;
    public static javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
