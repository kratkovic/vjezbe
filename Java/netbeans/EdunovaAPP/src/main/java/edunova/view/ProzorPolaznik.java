/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import edunova.controller.ObradaPolaznik;
import edunova.model.Polaznik;
import edunova.util.Alati;
import edunova.util.Aplikacija;
import edunova.util.EdunovaException;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class ProzorPolaznik 
        extends javax.swing.JFrame
        implements EdunovaViewSucelje{

    private ObradaPolaznik obrada;

    /**
     * Creates new form ProzorPolaznik
     */
    public ProzorPolaznik() {
        initComponents();
        obrada = new ObradaPolaznik();
        lstPodaci.setCellRenderer(new PolaznikRenderer());
        setTitle(Aplikacija.NAZIV_APP + ": "
                + Aplikacija.OPERATER.getImePrezime()
                + ": Polaznici");
        txtUvjet.requestFocus();
        //ucitaj();
    }

    public void napuniView() {
        var e = obrada.getEntitet();
        txtIme.setText(e.getIme());
        txtPrezime.setText(e.getPrezime());
        txtOIB.setText(e.getOib());
        txtEmail.setText(e.getEmail());
        txtBrojUgovora.setText(e.getBrojUgovora());
    }

    public void napuniModel() {
        var e = obrada.getEntitet();
        e.setIme(txtIme.getText());
        e.setPrezime(txtPrezime.getText());
        e.setOib(txtOIB.getText());
        e.setEmail(txtEmail.getText());
        e.setBrojUgovora(txtBrojUgovora.getText());
    }

    @Override
    public void ucitaj() {
        DefaultListModel<Polaznik> m
                = new DefaultListModel<>();
        m.addAll(obrada.read(
                txtUvjet.getText(),
                chbTraziOdPocetkaImena.isSelected()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
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
        lstPodaci = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        chbTraziOdPocetkaImena = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOIB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBrojUgovora = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnDovuciOIB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("🔍");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        chbTraziOdPocetkaImena.setText("Traži od početka imena");

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("OIB");

        jLabel4.setText("Email");

        jLabel5.setText("Broj ugovora");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnDovuciOIB.setText("O");
        btnDovuciOIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDovuciOIBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addComponent(chbTraziOdPocetkaImena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIme))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(txtBrojUgovora, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtOIB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDovuciOIB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbTraziOdPocetkaImena)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDovuciOIB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBrojUgovora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitaj();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Polaznik());
        napuniModel();
        try {
            obrada.create();
            txtUvjet.setText(obrada.getEntitet().getPrezime());
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(
                    getRootPane(),
                    ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
         if(lstPodaci.getSelectedValue()==null){
            JOptionPane.showMessageDialog(
                    getRootPane(), 
                    "Prvo odaberite polaznika");
            return;
        }
        
        napuniModel();
        try {
            obrada.update();
            txtUvjet.setText(obrada.getEntitet().getImePrezime());
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(
                    getRootPane(),
                    ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
         if(lstPodaci.getSelectedValue()==null){
            JOptionPane.showMessageDialog(
                    getRootPane(), 
                    "Prvo odaberite polaznik");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(
                getRootPane(),
                "Sigurno obrisati " + obrada.getEntitet().getImePrezime() + "?",
                "Brisanje",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }
        
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(
                    getRootPane(),
                    ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnDovuciOIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDovuciOIBActionPerformed
        txtOIB.setText(Alati.dovuciOib());
    }//GEN-LAST:event_btnDovuciOIBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDovuciOIB;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JCheckBox chbTraziOdPocetkaImena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Polaznik> lstPodaci;
    private javax.swing.JTextField txtBrojUgovora;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOIB;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
