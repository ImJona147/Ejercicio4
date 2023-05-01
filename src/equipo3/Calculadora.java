//Nombre del paquete
package equipo3;

//Librerias importadas
//Librerias realizada para la elaboracion de una calculadora
import equipo3.binomio.TeoremaBinomio;
import equipo3.desviacion.DesviacionEstandar;
//Libreria de java para interfaz
import javax.swing.JOptionPane;

//Nombre de la clase
public class Calculadora extends javax.swing.JFrame {

    //Constructor
    public Calculadora() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_numeros = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_calcular_ds = new javax.swing.JButton();
        btn_eliminar_ds = new javax.swing.JButton();
        lb_desviacion_resultado = new javax.swing.JLabel();
        lb_media_resultado = new javax.swing.JLabel();
        btn_ayuda_ds = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_expresion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lb_binomio_resultado = new javax.swing.JLabel();
        btn_calcular_tb = new javax.swing.JButton();
        btn_eliminar_tb = new javax.swing.JButton();
        btn_ayuda_tb = new javax.swing.JButton();
        lb_fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora no convencionales");
        setBackground(new java.awt.Color(157, 229, 221));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(157, 229, 221));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(157, 229, 221));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MÉTODO DESVIACIÓN ESTÁNDAR");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista de números");

        txt_numeros.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_numeros.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RESULTADO");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Desviación estándar:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Media aritmética:");

        btn_calcular_ds.setBackground(new java.awt.Color(18, 131, 243));
        btn_calcular_ds.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_calcular_ds.setForeground(new java.awt.Color(0, 0, 0));
        btn_calcular_ds.setText("CALCULAR");
        btn_calcular_ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_dsActionPerformed(evt);
            }
        });

        btn_eliminar_ds.setBackground(new java.awt.Color(18, 131, 243));
        btn_eliminar_ds.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_eliminar_ds.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar_ds.setText("ELIMINAR");
        btn_eliminar_ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_dsActionPerformed(evt);
            }
        });

        lb_desviacion_resultado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lb_desviacion_resultado.setForeground(new java.awt.Color(0, 0, 0));

        lb_media_resultado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lb_media_resultado.setForeground(new java.awt.Color(0, 0, 0));

        btn_ayuda_ds.setBackground(new java.awt.Color(18, 131, 243));
        btn_ayuda_ds.setText("?");
        btn_ayuda_ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda_dsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(txt_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ayuda_ds)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btn_calcular_ds)
                        .addGap(97, 97, 97)
                        .addComponent(btn_eliminar_ds))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_desviacion_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_media_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ayuda_ds))
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_desviacion_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_media_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_calcular_ds)
                            .addComponent(btn_eliminar_ds)))
                    .addComponent(jLabel5))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DESVIACIÓN ESTÁNDAR", jPanel1);

        jPanel2.setBackground(new java.awt.Color(157, 229, 221));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MÉTODO TEOREMA DEL BINOMIO");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Expresión:");

        txt_expresion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_expresion.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("RESULTADO");

        lb_binomio_resultado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lb_binomio_resultado.setForeground(new java.awt.Color(0, 0, 0));

        btn_calcular_tb.setBackground(new java.awt.Color(18, 131, 243));
        btn_calcular_tb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_calcular_tb.setForeground(new java.awt.Color(0, 0, 0));
        btn_calcular_tb.setText("CALCULAR");
        btn_calcular_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_tbActionPerformed(evt);
            }
        });

        btn_eliminar_tb.setBackground(new java.awt.Color(18, 131, 243));
        btn_eliminar_tb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_eliminar_tb.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar_tb.setText("ELIMINAR");
        btn_eliminar_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_tbActionPerformed(evt);
            }
        });

        btn_ayuda_tb.setBackground(new java.awt.Color(18, 131, 243));
        btn_ayuda_tb.setText("?");
        btn_ayuda_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ayuda_tbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btn_calcular_tb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar_tb)
                .addGap(134, 134, 134))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_binomio_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_ayuda_tb)))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_expresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ayuda_tb))
                .addGap(78, 78, 78)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lb_binomio_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcular_tb)
                    .addComponent(btn_eliminar_tb))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("TEOREMA DEL BINOMIO", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 510, -1));

        lb_fondo.setBackground(new java.awt.Color(157, 229, 221));
        lb_fondo.setToolTipText("");

        javax.swing.GroupLayout lb_fondoLayout = new javax.swing.GroupLayout(lb_fondo);
        lb_fondo.setLayout(lb_fondoLayout);
        lb_fondoLayout.setHorizontalGroup(
            lb_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        lb_fondoLayout.setVerticalGroup(
            lb_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(lb_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Boton de ayuda para TeoremaBinomio, cuando se presiona el botón
    //se mostrará un mensaje de ayuda.
    private void btn_ayuda_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda_tbActionPerformed
        JOptionPane.showMessageDialog(rootPane,
                "Sintaxis correcta:" 
                        + "\n1. Escribe una expresión del binomio"
                        + "\n2. La expresión debe quedar asi: (ax+by)^n, (ax)^n o (by)^n"
                        + "\n3. Debes ingresar números positivos",
                "Sintaxis",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda_tbActionPerformed

    //Boton de ayuda para DesviacionEstandar, cuando se presiona el botón
    //se mostrará un mensaje de ayuda.
    private void btn_ayuda_dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ayuda_dsActionPerformed
        JOptionPane.showMessageDialog(rootPane,
                "Sintaxis correcta:" 
                        + "\n1. Escribe una lista de números"
                        + "\n2. Los números deben estar separados por ','"
                        + "\n3. Puedes ingresar números positivos y negativos"
                        + "\n4. No puedes ingresar letras, solo números",
                "Sintaxis",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ayuda_dsActionPerformed

    //Botón para empezar a calcular los datos ingresados en el JTextField
    private void btn_calcular_dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_dsActionPerformed
        //Creación e instanciación de un objeto de la clase creada
        //DesviacionEstandar, en donde contiene los métodos para calcular
        //los datos solicitados.
        DesviacionEstandar ds = new DesviacionEstandar();
        //Si el campo de texto está vacío, se mostrará mensaje de error
            if (txt_numeros.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                        "¡Por favor, rellena el campo de texto!", 
                        "Rellena", JOptionPane.ERROR_MESSAGE);
                return;//el codigo retornará y no continuara con su ejecución
            }
        //Se manda a llamar al método 'calcularDesviacionEstandar' y se le coloca
        //los parámetros que pide el método.
        ds.calcularDesviacionEstandar(
                txt_numeros,
                lb_desviacion_resultado, 
                lb_media_resultado);
    }//GEN-LAST:event_btn_calcular_dsActionPerformed

    //Botón para limpiar el contenido de JTextField y JLabel usados para mostrar
    //el resultado o en donde se coloco las indicaciones.
    private void btn_eliminar_dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_dsActionPerformed
        //Se verifica si JTextField contiene texto o no, si tiene texto
        //vaciara los JLabel y el JTextField, de lo contrario, no hará nada y enviará
        //un mensaje de error.
        if (txt_numeros.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, 
                    "¡No hay nada que limpiar!", 
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Se llenan los objetos (JLabel y JTextField) con campos vacios
        txt_numeros.setText("");
        lb_desviacion_resultado.setText("");
        lb_media_resultado.setText("");
    }//GEN-LAST:event_btn_eliminar_dsActionPerformed

    //Botón para empezar a calcular los datos ingresados en el JTextField
    private void btn_calcular_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_tbActionPerformed
        //Creación e instanciación de la clase TeoremaBinomio
        TeoremaBinomio binomio = new TeoremaBinomio();
        //Se verifica si JTextField contiene texto o no, si tiene texto
        //llenara los JLabel con los resultados, de lo contrario, no hará nada y enviará
        //un mensaje de error.
        if (txt_expresion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Por favor, rellena el campo de texto!",
                    "Rellena",
                    JOptionPane.ERROR_MESSAGE);
               return;
        }
        //Se llama al método teoremaBiniomio de la clase ya mencionada
        //y se le coloca los parámetros que nos pide.
        binomio.teoremaBinomio(txt_expresion.getText(), lb_binomio_resultado);
    }//GEN-LAST:event_btn_calcular_tbActionPerformed

    //Botón para limpiar el contenido de JTextField y JLabel usados para mostrar
    //el resultado o en donde se coloco las indicaciones.
    private void btn_eliminar_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_tbActionPerformed
        //Se verifica si JTextField contiene texto o no, si tiene texto
        //vaciara los JLabel y el JTextField, de lo contrario, no hará nada y enviará
        //un mensaje de error.
        if (txt_expresion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, 
                    "No hay nada que limpiar", 
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Se llenan los objetos (JLabel y JTextField) con campos vacios
        txt_expresion.setText("");
        lb_binomio_resultado.setText("");
    }//GEN-LAST:event_btn_eliminar_tbActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ayuda_ds;
    private javax.swing.JButton btn_ayuda_tb;
    private javax.swing.JButton btn_calcular_ds;
    private javax.swing.JButton btn_calcular_tb;
    private javax.swing.JButton btn_eliminar_ds;
    private javax.swing.JButton btn_eliminar_tb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_binomio_resultado;
    private javax.swing.JLabel lb_desviacion_resultado;
    private javax.swing.JPanel lb_fondo;
    private javax.swing.JLabel lb_media_resultado;
    private javax.swing.JTextField txt_expresion;
    private javax.swing.JTextField txt_numeros;
    // End of variables declaration//GEN-END:variables
}
