/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_hotel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class register extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql,kode;
    int harga;
    public register() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        reg_nama.setBackground(new Color(0,0,0,0));
        reg_nope.setBackground(new Color(0,0,0,0));
        reg_id.setBackground(new Color(0,0,0,0));
        reg_email.setBackground(new Color(0,0,0,0));
        reg_pass.setBackground(new Color(0,0,0,0));
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
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
        jPanel1 = new javax.swing.JPanel();
        reg_nope = new javax.swing.JTextField();
        reg_id = new javax.swing.JTextField();
        reg_email = new javax.swing.JTextField();
        reg_pass = new javax.swing.JTextField();
        reg_nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_karyawan = new javax.swing.JTable();
        combox_jk = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1481, 706));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reg_nope.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        reg_nope.setBorder(null);
        reg_nope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_nopeActionPerformed(evt);
            }
        });
        jPanel1.add(reg_nope, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 370, 60));

        reg_id.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        reg_id.setBorder(null);
        jPanel1.add(reg_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 210, 60));

        reg_email.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        reg_email.setBorder(null);
        reg_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_emailActionPerformed(evt);
            }
        });
        jPanel1.add(reg_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 310, 50));

        reg_pass.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        reg_pass.setBorder(null);
        reg_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_passActionPerformed(evt);
            }
        });
        jPanel1.add(reg_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 290, 60));

        reg_nama.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        reg_nama.setBorder(null);
        reg_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_namaActionPerformed(evt);
            }
        });
        jPanel1.add(reg_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 420, 60));

        tbl_karyawan.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tbl_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Karyawan", "Email", "Password", "Nama", "Jenis Kelamin", "No HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_karyawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_karyawan);
        if (tbl_karyawan.getColumnModel().getColumnCount() > 0) {
            tbl_karyawan.getColumnModel().getColumn(0).setResizable(false);
            tbl_karyawan.getColumnModel().getColumn(1).setResizable(false);
            tbl_karyawan.getColumnModel().getColumn(2).setResizable(false);
            tbl_karyawan.getColumnModel().getColumn(3).setResizable(false);
            tbl_karyawan.getColumnModel().getColumn(4).setResizable(false);
            tbl_karyawan.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 300, 750, 430));

        combox_jk.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        combox_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        combox_jk.setBorder(null);
        jPanel1.add(combox_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 340, 70));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 820, 280, 80));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 800, 220, 70));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 800, 210, 70));

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 800, 210, 70));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 160, 60));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 170, 60));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 920, 190, 80));

        txtcari.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtcari.setBorder(null);
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 920, 430, 60));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 970, 170, 60));

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 210, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Data Pegawai New.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Data Pegawai New.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reg_nopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_nopeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_nopeActionPerformed

    private void tbl_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_karyawanMouseClicked
        // TODO add your handling code here:
        try {
 
int row =tbl_karyawan.getSelectedRow();
String tabel_klik=(tbl_karyawan.getModel().getValueAt(row, 0).toString());
java.sql.Statement stm = con.createStatement();
java.sql.ResultSet sql = stm.executeQuery("select * from admin where id='"+tabel_klik+"'");
 if(sql.next()){
 String id = sql.getString("ID");
 reg_id.setText(id);
 String email = sql.getString("Email");
reg_email.setText(email);
 String pass = sql.getString("Password");
reg_pass.setText(pass);
 String nama = sql.getString("Nama");
reg_nama.setText(pass);
String jns_kelamin = sql.getString("Jenis Kelamin");
combox_jk.setSelectedItem(jns_kelamin);
String nope = sql.getString("No Hp");
reg_nope.setText(nope);
 }
} catch (Exception e) {}
    }//GEN-LAST:event_tbl_karyawanMouseClicked

    private void reg_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_passActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        try {
    stat = con.createStatement();
    stat.executeUpdate("INSERT INTO admin VALUES('" +reg_id.getText() + "','"
        + reg_email.getText()+ "','"
        + reg_pass.getText()+ "','"
        + reg_nama.getText()+ "','"
        + combox_jk.getSelectedItem()+ "','"
        + reg_nope.getText() + "')");
    JOptionPane.showMessageDialog(null, "Simpan Berhasil");
//    txtnokamar.setText("");
//    txthargakamar.setText("");


  } catch (Exception e) {
    e.printStackTrace();
  }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        tampildata();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        deletedata();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        updatedata();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void reg_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_emailActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new chekin().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        caridata();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void reg_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_namaActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new chekout().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    void caridata(){
DefaultTableModel tb2=new DefaultTableModel();
tb2.addColumn("ID Karyawan");
tb2.addColumn("Email");
tb2.addColumn("Password");
tb2.addColumn("Nama");
tb2.addColumn("Jenis Kelamin");
tb2.addColumn("No HP");
try{
String sql="SELECT * FROM admin WHERE id  like '%"+txtcari.getText()+"%'";
stat=con.createStatement();
rs=stat.executeQuery(sql);
while(rs.next()){
tb2.addRow(new Object[]{rs.getString(1),rs.getString(2),
rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6)});
}
tbl_karyawan.setModel(tb2);
}catch(Exception e){}
}
    
    void deletedata(){
try {
stat = con.createStatement();
stat.executeUpdate("Delete from admin where Email= '" +reg_email.getText() + "'");
 JOptionPane.showMessageDialog(null, "Delete Berhasil");
 reg_id.setText("");
 reg_email.setText("");
 reg_pass.setText("");
 reg_nama.setText("");
 combox_jk.setSelectedItem("");
 reg_nope.setText("");


 } catch (Exception e) {
 e.printStackTrace();
 } 
}
    void updatedata(){
try {
 stat = con.createStatement();
 stat.executeUpdate("update admin SET Email = '"+reg_email.getText()+"', Password = '"+reg_pass.getText()+"', Nama = '"+reg_nama.getText()+"' WHERE ID = '"+reg_id.getText()+"'");
 tampildata();
 JOptionPane.showMessageDialog(null, "Update Berhasil");
 } catch (Exception e) {
 e.printStackTrace();
 } 
}
    
     void tampildata(){
DefaultTableModel tbl=new DefaultTableModel();
tbl.addColumn("Id Karyawan");
tbl.addColumn("Email");
tbl.addColumn("Password");
tbl.addColumn("Nama");
tbl.addColumn("Jenis Kelamin");
tbl.addColumn("No HP");
try{
String sql="select*from admin";
stat=con.createStatement();
rs=stat.executeQuery(sql);
while(rs.next()){
tbl.addRow(new Object[]{rs.getString(1),rs.getString(2),
rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
}
tbl_karyawan.setModel(tbl);
}catch(Exception e){}
}
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combox_jk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField reg_email;
    private javax.swing.JTextField reg_id;
    private javax.swing.JTextField reg_nama;
    private javax.swing.JTextField reg_nope;
    private javax.swing.JTextField reg_pass;
    private javax.swing.JTable tbl_karyawan;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
