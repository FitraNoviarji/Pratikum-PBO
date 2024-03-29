/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author asus
 */
public class TampilkanData extends javax.swing.JFrame {

    /**
     * Creates new form TampilkanData
     */
    
    private DefaultTableModel tableModel;

     
    public TampilkanData() {
        initComponents();
        tableModel = (DefaultTableModel) tableData.getModel();
        loadData();
    }
    
    private void loadData() {
        // Koneksi ke database
        String url = "jdbc:mysql://localhost/dbpbo";
        String username = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM tbmobil";
            ResultSet rs = stmt.executeQuery(query);

            // Membersihkan tabel sebelum menambahkan data
            tableModel.setRowCount(0);

            // Menambahkan data ke tabel
            while (rs.next()) {
                String nama = rs.getString("nama");
                String harga = rs.getString("harga");
                String merk = rs.getString("merk");
                String waktu = rs.getString("waktupengisian");
                String kapasitas = rs.getString("kapasitasbaterai");
                String jenis = rs.getString("jenismotor");
                String warna = rs.getString("warna");
                String kecepatan = rs.getString("kecepatanmaks");
                String fitur = rs.getString("fitur");
                String tahun = rs.getString("tahunproduksi");



                // Menambahkan data ke baris baru dalam tabel
                tableModel.addRow(new Object[]{nama, harga, merk, waktu, kapasitas, jenis, warna, kecepatan, fitur, tahun});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data dari database: " + e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Merk", "Waktu Pengisian", "Kapasitas Baterai", "Jenis Motor", "Warna tersedia", "Kecepatan Maksimum", "Fitur", "Tahun Produksi"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("DATA MOBIL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(462, 462, 462))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(0, 102, 102));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(0, 102, 102));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(0, 102, 102));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(btnKembali)
                .addGap(92, 92, 92)
                .addComponent(btnHapus)
                .addGap(91, 91, 91)
                .addComponent(btnUbah)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        TampilanAdmin tampilanAdmin = new TampilanAdmin();
        tampilanAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tableData.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin dihapus.");
        } else {
            String nama = (String) tableModel.getValueAt(row, 0);
            int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data " + nama + "?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Koneksi ke database
                String url = "jdbc:mysql://localhost/dbpbo";
                String username = "root";
                String password = "";

                try {
                    Connection conn = DriverManager.getConnection(url, username, password);
                    Statement stmt = conn.createStatement();
                    String deleteQuery = "DELETE FROM tbmobil WHERE nama='" + nama + "'";
                    int deletedRows = stmt.executeUpdate(deleteQuery);
                    if (deletedRows > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                        tableModel.removeRow(row);
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal dihapus.");
                    }
                    stmt.close();
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
    int row = tableData.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin diUbah.");
    } else {
        String nama = (String) tableModel.getValueAt(row, 0);
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin mengubah data " + nama + "?", "Konfirmasi Ubah Data", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Mendapatkan data yang akan diubah
            String harga = (String) tableModel.getValueAt(row, 1);
            String merk = (String) tableModel.getValueAt(row, 2);
            String waktu = (String) tableModel.getValueAt(row, 3);
            String kapasitas = (String) tableModel.getValueAt(row, 4);
            String jenis = (String) tableModel.getValueAt(row, 5);
            String warna = (String) tableModel.getValueAt(row, 6);
            String kecepatan = (String) tableModel.getValueAt(row, 7);
            String fitur = (String) tableModel.getValueAt(row, 8);
            String tahun = (String) tableModel.getValueAt(row, 9);

            // Membuat instance form UbahDataMobil
            UbahDataMobil ubahDataMobil = new UbahDataMobil();
            
            // Mengatur nilai-nilai yang akan diubah di form UbahDataMobil
            ubahDataMobil.setValues(nama, harga, merk, waktu, kapasitas, jenis, warna, kecepatan, fitur, tahun);
            
            // Menampilkan form UbahDataMobil
            ubahDataMobil.setVisible(true);
            
            // Menutup form TampilkanData
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diubah.");
        }
    } 
    }//GEN-LAST:event_btnUbahActionPerformed

    
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
            java.util.logging.Logger.getLogger(TampilkanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilkanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilkanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilkanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilkanData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
