/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul_10;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author bangadam
 */
public class Pendahuluan_5 extends javax.swing.JFrame {

    /**
     * Creates new form Pendahuluan_5
     */
    public Pendahuluan_5() {
        setLocation(500, 200);
        initComponents();
        this.componentForm("awal");
    }
    
    private void kosongForm() {
        nim.setText(null);
        nama.setText(null);
        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        kelas_a = new javax.swing.JRadioButton();
        kelas_b = new javax.swing.JRadioButton();
        kelas_c = new javax.swing.JRadioButton();
        matakuliah = new javax.swing.JComboBox<>();
        btCari = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Kelas");

        jLabel4.setText("Matakuliah");

        nim.setName("nim"); // NOI18N

        nama.setName("nama"); // NOI18N

        buttonGroup1.add(kelas_a);
        kelas_a.setText("A");
        kelas_a.setName("kelas_a"); // NOI18N

        buttonGroup1.add(kelas_b);
        kelas_b.setText("B");
        kelas_b.setName("kelas_b"); // NOI18N

        buttonGroup1.add(kelas_c);
        kelas_c.setText("C");
        kelas_c.setName("kelas_c"); // NOI18N

        matakuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalkulus", "Alpro", "Pengantar Komputasi" }));
        matakuliah.setName("matakuliah"); // NOI18N

        btCari.setText("Cari");
        btCari.setName("btCari"); // NOI18N
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.setName("btEdit"); // NOI18N
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan");
        btSimpan.setName("btSimpan"); // NOI18N
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setName("btHapus"); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btKeluar.setText("Keluar");
        btKeluar.setName("btKeluar"); // NOI18N
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btCari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addComponent(kelas_a)
                .addGap(12, 12, 12)
                .addComponent(kelas_b)
                .addGap(12, 12, 12)
                .addComponent(kelas_c))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(matakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btEdit)
                .addGap(6, 6, 6)
                .addComponent(btSimpan)
                .addGap(6, 6, 6)
                .addComponent(btnHapus)
                .addGap(183, 183, 183)
                .addComponent(btKeluar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btCari))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(kelas_a)
                    .addComponent(kelas_b)
                    .addComponent(kelas_c))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(matakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEdit)
                    .addComponent(btSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btKeluar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // set value from form properties
        String nimValue = nim.getText();
        String namaValue = nama.getText();
        kelas_a.setActionCommand("a");
        kelas_b.setActionCommand("b");
        kelas_c.setActionCommand("c");
        String kelasValue = buttonGroup1.getSelection().getActionCommand();
        String matakuliahValue = matakuliah.getSelectedItem().toString();
        
        try {
                String sql = "INSERT INTO adam_18650047 "
                        + "(nim, nama, kelas, matakuliah) values("
                        + "'"+nimValue+"',"
                        + "'"+namaValue+"',"
                        + "'"+kelasValue+"',"
                        + "'"+matakuliahValue+"'"
                        +")";
                Connection conn = (Connection) Koneksi.koneksiDB();
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
                kosongForm();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        String nimValue = nim.getText();
        String namaValue = nama.getText();
        kelas_a.setActionCommand("a");
        kelas_b.setActionCommand("b");
        kelas_c.setActionCommand("c");
        String kelasValue = buttonGroup1.getSelection().getActionCommand();
        String matakuliahValue = matakuliah.getSelectedItem().toString();
        
        try {
            String sql = "UPDATE adam_18650047 SET "
                        + "nama = '"+namaValue
                        + "', kelas = '"+kelasValue
                        + "', matakuliah = '"+matakuliahValue
                        + "' WHERE nim = "+nimValue;
            
            Connection conn = (Connection) Koneksi.koneksiDB();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
            
            this.componentForm("edit");
            kosongForm();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        String nimValue = nim.getText();
        try {
                Connection conn = (Connection) Koneksi.koneksiDB();
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery("SELECT * FROM adam_18650047"
                        + " WHERE nim = "+nimValue);
                if (result.next()) {
                    String namaResult = result.getString("nama");
                    String kelasResult = result.getString("kelas");
                    String mataKuliahResult = result.getString("matakuliah");
                    
                    nama.setText(namaResult);
                    if (kelasResult.equals("a"))
                        kelas_a.setSelected(true);
                    else if(kelasResult.equals("b"))
                        kelas_b.setSelected(true);
                    else 
                        kelas_c.setSelected(true);
                    
                    matakuliah.getModel().setSelectedItem(mataKuliahResult);
                    JOptionPane.showMessageDialog(null, "Data Mahasiswa "
                            + ""+namaResult+" ditemukan");
                    
                    this.componentForm("cari");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
                    kosongForm();
                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btCariActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String nimValue = nim.getText();
        try {
                String sql = "DELETE FROM adam_18650047 WHERE nim = "+nimValue;
                Connection conn = (Connection) Koneksi.koneksiDB();
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                this.componentForm("hapus");
                kosongForm();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btnHapusActionPerformed
    
    private void componentForm(String action) {
        switch(action) {
            case "awal":
                btEdit.setEnabled(false);
                btnHapus.setEnabled(false);
            break;
            case "cari":
                btCari.setEnabled(false);
                btSimpan.setEnabled(false);
                nim.setEnabled(false);
                btEdit.setEnabled(true);
                btnHapus.setEnabled(true);
            break;
            case "edit":
                nim.setEnabled(true);
                btSimpan.setEnabled(true);
                btEdit.setEnabled(false);
                btnHapus.setEnabled(false);
                btCari.setEnabled(true);
            break;
            case "hapus":
                nim.setEnabled(true);
                btSimpan.setEnabled(true);
                btCari.setEnabled(true);
                btEdit.setEnabled(false);
                btnHapus.setEnabled(false);
            break;
            default:
                return;
        }
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
            java.util.logging.Logger.getLogger(Pendahuluan_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendahuluan_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendahuluan_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendahuluan_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendahuluan_5().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCari;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btnHapus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton kelas_a;
    private javax.swing.JRadioButton kelas_b;
    private javax.swing.JRadioButton kelas_c;
    private javax.swing.JComboBox<String> matakuliah;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    // End of variables declaration//GEN-END:variables
}
