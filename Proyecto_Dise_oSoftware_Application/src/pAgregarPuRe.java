/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Entities.Publicacion;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author marti
 */
public class pAgregarPuRe extends javax.swing.JFrame {

    /**
     * Creates new form pAgregarPuRe
     */
    public pAgregarPuRe() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxProyectos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNumSec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomRev = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLugCel = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        dcFechIn = new datechooser.beans.DateChooserCombo();
        dcFechFin = new datechooser.beans.DateChooserCombo();
        txtProf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 240, 240));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Agregar publicación de Revista");

        jLabel2.setText("Proyectos de investigación vigentes:");

        cbxProyectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proyecto 1", "Proyecto 2", "Proyecto 3", " " }));

        jLabel3.setText("Numero de secuencia:");

        jLabel4.setText("Titulo:");

        jLabel5.setText("Investigador principal:");

        jLabel6.setText("Nombre de la revista:");

        jLabel7.setText("Tipo:");

        jLabel8.setText("Fecha de Inicio:");

        jLabel9.setText("Fecha de Finalización:");

        jLabel10.setText("País:");

        jLabel11.setText("Lugar de celebración:");

        btnGuardar.setBackground(new java.awt.Color(255, 204, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 204, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Editorial:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumSec)
                            .addComponent(txtTitulo)
                            .addComponent(txtNomRev)
                            .addComponent(txtTipo)
                            .addComponent(txtPais)
                            .addComponent(txtLugCel)
                            .addComponent(txtEditorial)
                            .addComponent(dcFechIn, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(dcFechFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProf))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnGuardar)
                .addGap(124, 124, 124)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(dcFechIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(dcFechFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtLugCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCancelar))
                .addGap(42, 42, 42))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        MongoClient mongoClient = new MongoClient();
        //ACCESO A LA BD ESPECIFICA
        MongoDatabase database = mongoClient.getDatabase("proyectos");
        //ACCESO A LA COLECCCIÓN
        MongoCollection<Document> collection = database.getCollection("publicaciones");

        String NumeroSecuencia = txtNumSec.getText();
        String Titulo = txtTitulo.getText();
        String Profesores = txtProf.getText();
        String NomRev = txtNomRev.getText();
        String Tipo = txtTipo.getText();
        String FechIn = dcFechIn.getText();
        String FechFin = dcFechFin.getText();
        String Pais = txtPais.getText();
        String LugCel = txtLugCel.getText();
        String Editorial = txtEditorial.getText();

        if (Titulo.isEmpty() || Profesores.isEmpty() || NomRev.isEmpty()
                || Tipo.isEmpty() || FechIn.isEmpty() || FechFin.isEmpty()
                || Pais.isEmpty() || LugCel.isEmpty() || Editorial.isEmpty()) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Se ha detectado un campo vacío, favor de llenarlo");
        } else {
            ArrayList<Document> lista = new ArrayList<>();
            lista.add(new Document("Numero de secuencia:", NumeroSecuencia)
                    .append("Titulo", Titulo)
                    .append("Profesores", Profesores)
                    .append("Revista", new Document().append("Nombre de la revista", NomRev)
                            .append("Tipo", Tipo)
                            .append("Fecha de inicio", FechIn)
                            .append("Fecha de finalización", FechFin)
                            .append("País", Pais)
                            .append("Lugar de celebración", LugCel)
                            .append("Editorial", Editorial)));
            collection.insertMany(lista);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNumSec.setText("");
        txtTitulo.setText("");
        txtProf.setText("");
        txtNomRev.setText("");
        txtTipo.setText("");
        dcFechIn.setText("");
        dcFechFin.setText("");
        txtPais.setText("");
        txtLugCel.setText("");
        txtEditorial.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxProyectos;
    private datechooser.beans.DateChooserCombo dcFechFin;
    private datechooser.beans.DateChooserCombo dcFechIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtLugCel;
    private javax.swing.JTextField txtNomRev;
    private javax.swing.JTextField txtNumSec;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtProf;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
