/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Usuarios;

/**
 *
 * @author daro
 */
public class Programa extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    Usuarios usuario;
    
    public Programa() {
        initComponents();
    }
    //Sobre carga de constructores para pasar los datos el usuario logueado
    public Programa(Usuarios usuarios){
        initComponents();
        setLocationRelativeTo(null);
        this.usuario=usuarios;
        
        //Establecemos los privilegios segun el rol
        
        
        etiquetanombre.setText(usuarios.getNombreUsuario());
        etiquetarol.setText(usuarios.getNombreRol());
        if(usuarios.getIdTipo_usuario()==1){
            
        }
        else if(usuarios.getIdTipo_usuario()==2){
            menuProveedores.setVisible(false);
            submenuAgregarProducto.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetanombre = new javax.swing.JLabel();
        etiquetarol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        submenuAgregarProducto = new javax.swing.JMenuItem();
        submenuModificarProducto = new javax.swing.JMenuItem();
        submenuCatalogoProductos = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        submenuagregarproveedores = new javax.swing.JMenuItem();
        submenucatalogoproveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido al programa Daromitas");

        etiquetanombre.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        etiquetarol.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetarol, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetanombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(etiquetanombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(etiquetarol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        menuProductos.setText("Productos");

        submenuAgregarProducto.setText("Agregar producto");
        menuProductos.add(submenuAgregarProducto);

        submenuModificarProducto.setText("Modificar producto");
        menuProductos.add(submenuModificarProducto);

        submenuCatalogoProductos.setText("Catalogo de productos");
        menuProductos.add(submenuCatalogoProductos);

        jMenuBar1.add(menuProductos);

        menuProveedores.setText("Proveedores");

        submenuagregarproveedores.setText("Agregar proveedor");
        menuProveedores.add(submenuagregarproveedores);

        submenucatalogoproveedores.setText("Catalogo de proveedores");
        menuProveedores.add(submenucatalogoproveedores);

        jMenuBar1.add(menuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetanombre;
    private javax.swing.JLabel etiquetarol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenuItem submenuAgregarProducto;
    private javax.swing.JMenuItem submenuCatalogoProductos;
    private javax.swing.JMenuItem submenuModificarProducto;
    private javax.swing.JMenuItem submenuagregarproveedores;
    private javax.swing.JMenuItem submenucatalogoproveedores;
    // End of variables declaration//GEN-END:variables
}
