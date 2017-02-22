/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructuras;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.kohsuke.graphviz.*;



import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvarez
 */
public class VentanaJuego extends javax.swing.JFrame {
int actual =0;
ListaCircularJugador lc = new ListaCircularJugador();
Modulo mod = new Modulo();
Graph g = new Graph();
Jugador temporal;
boolean ultimoJugador = false;

    public VentanaJuego() {
       Runtime r;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
        mod.getLc().ultimo = mod.getLc().ultimo.siguiente;
        mod.getLc().ultimo.getLetra().mostrarLetrasJugador();
        //System.out.println("Tamaño en frame ventanaJuego: "+mod.getLc().tamaño);
        System.out.println("Jugador al cargar: "+mod.getLc().ultimo.getNombre());
        lblJugadorActual.setText(mod.getLc().ultimo.getNombre());
        lc = mod.getLc();
        LetraJugador letraAux = mod.lc.ultimo.getLetra().inicio;
        
        for(int i = 0; i<=6; i++){
            switch(i){
                case 0:
                  checkBox1.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 1:
                    checkBox2.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 2:
                    checkBox3.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 3:
                    checkBox4.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 4:
                    checkBox5.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 5:
                    checkBox6.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 6:
                    checkBox7.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
            }
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

        areaReportes = new javax.swing.JComboBox();
        lblReporte = new javax.swing.JLabel();
        btnAgregarPalabra = new javax.swing.JButton();
        txtAgregarPalabra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkBox1 = new javax.swing.JCheckBox();
        checkBox2 = new javax.swing.JCheckBox();
        checkBox3 = new javax.swing.JCheckBox();
        checkBox4 = new javax.swing.JCheckBox();
        checkBox5 = new javax.swing.JCheckBox();
        checkBox6 = new javax.swing.JCheckBox();
        checkBox7 = new javax.swing.JCheckBox();
        btnCambiarLetras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblJugadorActual = new javax.swing.JLabel();
        btnSaltarTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaReportes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Listado Diccionario", "Cola de Fichas", "Lista Jugadores", "Lista Fichas Activas(Jugador)" }));
        areaReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaReportesActionPerformed(evt);
            }
        });

        btnAgregarPalabra.setText("Agregar Palabra");
        btnAgregarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPalabraActionPerformed(evt);
            }
        });

        jLabel1.setText("Nueva Palabra:");

        jLabel2.setText("Cambiar Letras:");

        btnCambiarLetras.setText("Cambiar");
        btnCambiarLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarLetrasActionPerformed(evt);
            }
        });

        jLabel3.setText("Turno de:");

        btnSaltarTurno.setText("Saltar Turno");
        btnSaltarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaltarTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(507, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJugadorActual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(checkBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSaltarTurno))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAgregarPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAgregarPalabra)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBox1)
                                            .addComponent(checkBox2)
                                            .addComponent(checkBox3))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBox6)
                                            .addComponent(checkBox5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkBox7)
                                                .addGap(18, 18, 18))))
                                    .addComponent(btnCambiarLetras, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(areaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(areaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblJugadorActual)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgregarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarPalabra)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBox1)
                            .addComponent(checkBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBox6)
                            .addComponent(checkBox2))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBox3)
                            .addComponent(checkBox7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBox4)
                            .addComponent(btnSaltarTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiarLetras)
                        .addContainerGap(325, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaReportesActionPerformed
      
        if(areaReportes.getSelectedItem().equals("Listado Diccionario")){
            ImageIcon imagen = new ImageIcon("C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimplePalabra.jpg");
         Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblReporte.getWidth(), lblReporte.getHeight(), Image.SCALE_DEFAULT));
         lblReporte.setIcon(icono);
         lblReporte.setVisible(true);
        }
        if(areaReportes.getSelectedItem().equals("Cola de Fichas")){
            ImageIcon imagen = new ImageIcon("C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\colaLetras.jpg");
         Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblReporte.getWidth(), lblReporte.getHeight(), Image.SCALE_DEFAULT));
         lblReporte.setIcon(icono);
         lblReporte.setVisible(true);
        }
        if(areaReportes.getSelectedItem().equals("Lista Jugadores")){
         ImageIcon imagen = new ImageIcon("C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaJugadores.jpg");
         Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblReporte.getWidth(), lblReporte.getHeight(), Image.SCALE_DEFAULT));
         lblReporte.setIcon(icono);
         lblReporte.setVisible(true);
        }
        if(areaReportes.getSelectedItem().equals("Lista Fichas Activas(Jugador)")){
            mod.getLc().ultimo.getLetra().mostrarLetrasJugador();
            ImageIcon imagen = new ImageIcon("C:\\Users\\Alvarez\\Documents\\NetBeansProjects\\Practica1_Estructuras\\src\\practica1_estructuras\\listaSimpleLetra.jpg");
         Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblReporte.getWidth(), lblReporte.getHeight(), Image.SCALE_DEFAULT));
         lblReporte.setIcon(icono);
         lblReporte.setVisible(true);
        }
        
    }//GEN-LAST:event_areaReportesActionPerformed

    private void btnAgregarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPalabraActionPerformed
        try {
            if(txtAgregarPalabra.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Campo Vacío");
        }
        else{
            mod.getLp().agregarPalabraAlFinal(txtAgregarPalabra.getText());
            mod.getLp().mostrarPalabras();
            txtAgregarPalabra.setText("");
            System.out.println("Palabra agregada");
            
        }
        } catch (Exception e) {
            System.out.println("Error al agregar: "+e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgregarPalabraActionPerformed

    private void btnSaltarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaltarTurnoActionPerformed
        mod.getLc().ultimo = mod.getLc().ultimo.siguiente;
        System.out.println("Actual: "+mod.getLc().ultimo.getNombre());
        lblJugadorActual.setText(mod.getLc().ultimo.getNombre());
        mod.getLc().ultimo.getLetra().mostrarLetrasJugador();
        LetraJugador letraAux = mod.getLc().ultimo.getLetra().inicio;
        lc = mod.getLc();
        
        for(int i = 0; i<=6; i++){
            switch(i){
                case 0:
                  checkBox1.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 1:
                    checkBox2.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 2:
                    checkBox3.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 3:
                    checkBox4.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 4:
                    checkBox5.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 5:
                    checkBox6.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
                case 6:
                    checkBox7.setText(letraAux.getLetra());
                    letraAux = letraAux.siguiente;
                    break;
            }
        }
        lc = mod.getLc();
        
        
        
        
        
        //System.out.println("Actual: "+mod.getLc().ultimo.getSiguiente().getNombre());
        
        
        
        
    }//GEN-LAST:event_btnSaltarTurnoActionPerformed

    private void btnCambiarLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarLetrasActionPerformed
        
        if(checkBox1.isSelected()){
            checkBox1.setText(changeLetter(checkBox1.getText()));
          
            System.out.println("Letra intercambiada");
            
        }
        if(checkBox2.isSelected()){
            checkBox2.setText(changeLetter(checkBox2.getText()));
             System.out.println("Letra intercambiada");
        }
        if(checkBox3.isSelected()){
            checkBox3.setText(changeLetter(checkBox3.getText()));
             System.out.println("Letra intercambiada");
        }
        if(checkBox4.isSelected()){
            checkBox4.setText(changeLetter(checkBox4.getText()));
             System.out.println("Letra intercambiada");
        }
        if(checkBox5.isSelected()){
            checkBox5.setText(changeLetter(checkBox5.getText()));
             System.out.println("Letra intercambiada");
            }
        if(checkBox6.isSelected()){
            checkBox6.setText(changeLetter(checkBox6.getText()));
             System.out.println("Letra intercambiada");
            }
        if(checkBox7.isSelected()){
            checkBox7.setText(changeLetter(checkBox7.getText()));
             System.out.println("Letra intercambiada");
            }
        
        
    }//GEN-LAST:event_btnCambiarLetrasActionPerformed

    public String changeLetter(String letraUsuario){
        try {
            LetraJugador aux = mod.getLc().ultimo.Letra.inicio;
        while(aux!= null || !letraUsuario.equals(aux.getLetra())){
            if(letraUsuario.equals(aux.getLetra())){
                //System.out.println("Valor antes de ir a cola es: "+aux.getPunteo());
               mod.getColaL().insertarFicha(letraUsuario, aux.getPunteo());
               int punteo = mod.getColaL().inicio.getPunteo();
                aux.setPunteo(punteo);
               aux.setPunteo(punteo);
               aux.setLetra(mod.getColaL().sacarLetra());
               mod.getLc().ultimo.Letra.mostrarLetrasJugador();
               mod.getColaL().mostrarLetrasEnCola();
                //System.out.println("La letra Nueva es: ("+aux.getLetra()+ ") El Punteo es: ("+aux.getPunteo()+")");
               return aux.getLetra();
            }
            aux = aux.siguiente;
        }
      
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
       return "--";      
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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox areaReportes;
    private javax.swing.JButton btnAgregarPalabra;
    private javax.swing.JButton btnCambiarLetras;
    private javax.swing.JButton btnSaltarTurno;
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JCheckBox checkBox2;
    private javax.swing.JCheckBox checkBox3;
    private javax.swing.JCheckBox checkBox4;
    private javax.swing.JCheckBox checkBox5;
    private javax.swing.JCheckBox checkBox6;
    private javax.swing.JCheckBox checkBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblJugadorActual;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JTextField txtAgregarPalabra;
    // End of variables declaration//GEN-END:variables
}
