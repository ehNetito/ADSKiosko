/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import VO.CVOCliente;
import VO.CVORenta;
import Negocio.CNRenta;
//import Negocio.CNCliente;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author juan
 */
public class CIRenta extends javax.swing.JFrame {
    
    final int AGREGAR   = 1;
    final int MODIFICAR = 2;
    final int ELIMINAR  = 3;
    ArrayList mListaRenta; //
    CVOCliente mVOCliente;
    CVORenta mVORenta;// 
    int       mOp;           // Operación que se realiza: 1 Agregar, 2 Modificar, 3 Eliminar
    int       mRegSel;       // Renglon seleccionado de la lista
    

    /**
     * Creates new form CIRenta
     */
    //public CIRenta(ArrayList pListaRenta, int pRegSel, int pOp) {
    public CIRenta() {
        CVORenta VORenta;
        initComponents();
        this.setLocationRelativeTo(null);
        java.sql.Date max= new java.sql.Date(Fech().getTime()+63113800000L);
        java.sql.Date min= new java.sql.Date(Fech().getTime()-1262276000000L);
        //jDateFechaRent.setSelectableDateRange(min,max);
        jTxtCvRenta.setText(claveRenta());

    }
     public final Date Fecha(){
      java.util.Date Date=new java.util.Date();
      java.sql.Date resta=new java.sql.Date(Date.getTime());
      return resta; // Devuelve el objeto Date con los nuevos días añadidos
 }

public String claveRenta(){
    String anio,mes,dia,hora,minutos,seg;
    Calendar fecha = Calendar.getInstance();
        
    anio = fecha.get(Calendar.YEAR)+"";
    mes = (fecha.get(Calendar.MONTH)+1)+"";
    dia = fecha.get(Calendar.DAY_OF_MONTH)+"";
    hora = fecha.get(Calendar.HOUR)+"";
    minutos = fecha.get(Calendar.MINUTE)+"";
    seg = fecha.get(Calendar.SECOND)+"";
        
    seg = seg.substring(0, 1);
    anio = anio.substring(2,4);
    if(mes.length() == 1)
        mes = 0+mes;
    if(dia.length() == 1)
        dia = 0+dia;
    if(hora.length() == 1)
        hora = 0+hora;
    if(minutos.length() == 1)
        minutos = 0+minutos;
    return dia+hora+minutos+seg;
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
        jTxtIdCliente = new javax.swing.JTextField();
        jTxtNomCliente = new javax.swing.JTextField();
        jLTarjeta = new javax.swing.JLabel();
        jTxtIdBicicleta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBtnRealizar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtCvRenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RENTA");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("IDCliente");

        jLabel2.setText("Nombre:");

        jTxtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdClienteActionPerformed(evt);
            }
        });
        jTxtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtIdClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdClienteKeyTyped(evt);
            }
        });

        jTxtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomClienteKeyTyped(evt);
            }
        });

        jLTarjeta.setText("CvBicicleta:");

        jBtnRealizar.setText("Realizar");
        jBtnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRealizarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Regresar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("CvRenta:");

        jTxtCvRenta.setEditable(false);
        jTxtCvRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCvRentaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(3, 3, 3)
                        .add(jLTarjeta)
                        .add(39, 39, 39)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jBtnRealizar)
                                .add(64, 64, 64)
                                .add(jBtnCancelar))
                            .add(jTxtIdBicicleta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel2)
                            .add(jLabel1)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4))
                        .add(45, 45, 45)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTxtNomCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 286, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jTxtCvRenta)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jTxtIdCliente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(73, 73, 73)
                .add(jLabel6)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jTxtCvRenta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 11, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTxtIdCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTxtNomCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(50, 50, 50)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLTarjeta)
                    .add(jTxtIdBicicleta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBtnRealizar)
                    .add(jBtnCancelar))
                .add(21, 21, 21))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void jTxtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdClienteActionPerformed
*/
    private void jBtnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRealizarActionPerformed
        // TODO add your handling code here:
        
        CNRenta oNRenta;
        CVORenta oVORenta;
        oNRenta= new CNRenta();

        try {
            oVORenta = new CVORenta(Long.parseLong(jTxtCvRenta.getText()),"now()","",Long.parseLong(jTxtIdCliente.getText()),Long.parseLong(jTxtIdBicicleta.getText()),"Rent",1L);
            if(jTxtIdCliente.getText().equals("")||jTxtNomCliente.getText().equals("")||jTxtIdBicicleta.getText().equals(""))
                throw new NumberFormatException();
            System.out.println(oVORenta.getIdRenta()+" "+oVORenta.getFechaInicio()+" "+oVORenta.getFechaDev()+" "+oVORenta.getIdCliente()+" "+oVORenta.getIdBicicleta()+" "+oVORenta.getStatRenta());
            oNRenta.setAgregaRenta(oVORenta);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"Error de fecha, el formado debe ser dd/mm/aaaa","Error en Datos", JOptionPane.ERROR_MESSAGE); 
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Se deben de llenar todos los campos","Error en Datos", JOptionPane.ERROR_MESSAGE);           
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error en Datos", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jBtnRealizarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Interfaz.CIMenuP mp;
        mp = new CIMenuP();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdClienteKeyTyped
        // TODO add your handling code here:
        try{
            if(!Character.isDigit(evt.getKeyChar())&&!Character.isISOControl(evt.getKeyChar())){
                evt.consume();
                throw new Exception("La matricula es numerica");}
            if(jTxtIdCliente.getText().length()>=10){
                evt.consume();
                throw new Exception("La matricula es de 10 digitos");
        }
        }
        catch(Exception E){
                JOptionPane.showMessageDialog(this,E.getMessage(),null,JOptionPane.ERROR_MESSAGE, null);
                }
        
    }//GEN-LAST:event_jTxtIdClienteKeyTyped

    private void jTxtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdClienteKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTxtIdClienteKeyPressed

    private void jTxtNomClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomClienteKeyTyped
        // TODO add your handling code here:
        try{
            if(Character.isDigit(evt.getKeyChar())){
                evt.consume();
             throw new Exception("Solo se permite el ingreso de letras en este campo");
             }
            if(jTxtNomCliente.getText().length()>=45){
                evt.consume();
                throw new Exception("Nombre demasiado largo");
        }
        }
        catch(Exception E){
                JOptionPane.showMessageDialog(this,E.getMessage(),null,JOptionPane.ERROR_MESSAGE, null);
                }    
    }//GEN-LAST:event_jTxtNomClienteKeyTyped

    private void jTxtCvRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCvRentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCvRentaActionPerformed

    public final Date Fech(){
      java.util.Date Date=new java.util.Date();
      java.sql.Date resta=new java.sql.Date(Date.getTime()-631138000000L);
      return resta; // Devuelve el objeto Date con los nuevos días añadidos
 }
    private void jTxtIdClienteActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    /**
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIRenta().setVisible(true);
            }
        });
    }*/
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnRealizar;
    private javax.swing.JLabel jLTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCvRenta;
    private javax.swing.JTextField jTxtIdBicicleta;
    private javax.swing.JTextField jTxtIdCliente;
    private javax.swing.JTextField jTxtNomCliente;
    // End of variables declaration//GEN-END:variables

}
