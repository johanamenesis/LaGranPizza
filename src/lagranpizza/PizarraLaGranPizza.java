package lagranpizza;

import java.util.Hashtable;
import javax.swing.JTextArea;

/**
 *
 * @author Johana Menesis Segura Carranza
 * @version 1.0
 * @since 1.0
 *
 */
public class PizarraLaGranPizza extends javax.swing.JFrame {

    static int NumOrden = 1;

    TipoPizza Pizzas = new TipoPizza();
    Hashtable<String, String> PizzaElegida = new Hashtable<String, String>();
    int cantPizzas = 0;
    int otraPizza = 1;
    String respuestaUsuario = "";

    public PizarraLaGranPizza() {
        initComponents();
    }

    public PizarraLaGranPizza(JTextArea pizarra) {
        this.Pizarra = pizarra;
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Pizarra = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Vendedor = new javax.swing.JTextArea();
        Cliente = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jl_vendedor = new javax.swing.JLabel();
        jl_respuesta = new javax.swing.JLabel();
        Aceptar1 = new javax.swing.JButton();
        jl_vendedor1 = new javax.swing.JLabel();
        jl_respuesta1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Vendedor1 = new javax.swing.JTextArea();
        Cliente1 = new javax.swing.JTextField();
        Aceptar2 = new javax.swing.JButton();
        jl_vendedor2 = new javax.swing.JLabel();
        jl_respuesta2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Vendedor2 = new javax.swing.JTextArea();
        Cliente2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Pizarra.setEditable(false);
        Pizarra.setColumns(20);
        Pizarra.setRows(5);
        jScrollPane1.setViewportView(Pizarra);

        Vendedor.setEditable(false);
        Vendedor.setColumns(20);
        Vendedor.setRows(5);
        jScrollPane2.setViewportView(Vendedor);

        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hobo Std", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("LA GRAN PIZZA");

        jl_vendedor.setText("Vendedor:");

        jl_respuesta.setText("Su respuesta:");

        Aceptar1.setText("Aceptar");
        Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar1ActionPerformed(evt);
            }
        });

        jl_vendedor1.setText("Vendedor:");

        jl_respuesta1.setText("Su respuesta:");

        Vendedor1.setEditable(false);
        Vendedor1.setColumns(20);
        Vendedor1.setRows(5);
        jScrollPane3.setViewportView(Vendedor1);

        Cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente1ActionPerformed(evt);
            }
        });

        Aceptar2.setText("Aceptar");
        Aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar2ActionPerformed(evt);
            }
        });

        jl_vendedor2.setText("Vendedor:");

        jl_respuesta2.setText("Su respuesta:");

        Vendedor2.setEditable(false);
        Vendedor2.setColumns(20);
        Vendedor2.setRows(5);
        jScrollPane4.setViewportView(Vendedor2);

        Cliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Ordenes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_vendedor)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_respuesta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_vendedor1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_respuesta1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_vendedor2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aceptar2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_respuesta2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_vendedor)
                    .addComponent(jl_respuesta)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_vendedor1)
                            .addComponent(jl_respuesta1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Aceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_vendedor2)
                            .addComponent(jl_respuesta2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Aceptar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        respuestaUsuario = getRespuestaCliente().replaceAll("[^\\d]", "");

        if (Pizzas.ElegirPizza(respuestaUsuario) != null) {

            PizzaElegida = Pizzas.ElegirPizza(respuestaUsuario);
            Aceptar.setVisible(false);
            Vendedor.setVisible(false);
            Cliente.setVisible(false);
            jl_vendedor.setVisible(false);
            jl_respuesta.setVisible(false);

            Aceptar1.setVisible(true);
            Vendedor1.setVisible(true);
            Cliente1.setVisible(true);
            jl_vendedor1.setVisible(true);
            jl_respuesta1.setVisible(true);
            Cliente.setText("");

        } else {
            System.out.println("Opcion invalida");
            Cliente.setText("");

        }

    }//GEN-LAST:event_AceptarActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed

        respuestaUsuario = "";
        cantPizzas = 0;
        respuestaUsuario = getRespuestaCliente1().replaceAll("[^\\d]", "");
        if (!respuestaUsuario.equals("")) {
            cantPizzas = Integer.parseInt(respuestaUsuario);

            NuevaOrden nuevaOrden = new NuevaOrden(NumOrden, PizzaElegida, cantPizzas);
            nuevaOrden.start();

            Aceptar1.setVisible(false);
            Vendedor1.setVisible(false);
            Cliente1.setVisible(false);
            jl_vendedor1.setVisible(false);
            jl_respuesta1.setVisible(false);

            Aceptar2.setVisible(true);
            Vendedor2.setVisible(true);
            Cliente2.setVisible(true);
            jl_vendedor2.setVisible(true);
            jl_respuesta2.setVisible(true);
            Cliente1.setText("");
        } else {
            System.out.println("Opcion invalida");
            Cliente1.setText("");
        }
    }//GEN-LAST:event_Aceptar1ActionPerformed

    private void Cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cliente1ActionPerformed

    private void Aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar2ActionPerformed
        respuestaUsuario = "";
        cantPizzas = 0;
        respuestaUsuario = getRespuestaCliente2().replaceAll("[^\\d]", "");
        if ((!respuestaUsuario.equals("")) && ((respuestaUsuario.equals("1")) || (respuestaUsuario.equals("2")))) {
            if (respuestaUsuario.equals("2")) {
                NumOrden++;

            }
            Aceptar2.setVisible(false);
            Vendedor2.setVisible(false);
            Cliente2.setVisible(false);
            jl_vendedor2.setVisible(false);
            jl_respuesta2.setVisible(false);

            Aceptar.setVisible(true);
            Vendedor.setVisible(true);
            Cliente.setVisible(true);
            jl_vendedor.setVisible(true);
            jl_respuesta.setVisible(true);
            Cliente2.setText("");
        } else {
            System.out.println("Opcion invalida");
            Cliente2.setText("");
        }
    }//GEN-LAST:event_Aceptar2ActionPerformed

    private void Cliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cliente2ActionPerformed

    public static void main(String[] args) {

        PizarraLaGranPizza pizarraLGP = new PizarraLaGranPizza();
        pizarraLGP.setVisible(true);
        pizarraLGP.Aceptar1.setVisible(false);
        pizarraLGP.Vendedor1.setVisible(false);
        pizarraLGP.Cliente1.setVisible(false);
        pizarraLGP.jl_vendedor1.setVisible(false);
        pizarraLGP.jl_respuesta1.setVisible(false);
        pizarraLGP.Aceptar2.setVisible(false);
        pizarraLGP.Vendedor2.setVisible(false);
        pizarraLGP.Cliente2.setVisible(false);
        pizarraLGP.jl_vendedor2.setVisible(false);
        pizarraLGP.jl_respuesta2.setVisible(false);
        
        TipoPizza Pizzas = new TipoPizza();
        
        pizarraLGP.Vendedor.setText("Ingrese el tipo de pizza a ordenar?\n");
        pizarraLGP.Vendedor.append(Pizzas.menuPizzas());
        pizarraLGP.Vendedor1.setText("Cuantas pizzas de ese tipo \ndesea ordenar?\n");
        pizarraLGP.Vendedor2.setText("Desea ordenar otra pizza? \n1. SI\n2. NO\n");
        pizarraLGP.Pizarra.setText("");
      
    }

    public String getRespuestaCliente() {
        return Cliente.getText();
    }

    public String getRespuestaCliente1() {
        return Cliente1.getText();
    }

    public String getRespuestaCliente2() {
        return Cliente2.getText();
    }

    public void addPizarra(String estadoOrden) {
        System.out.println("entra piza");
        Pizarra.append(estadoOrden + "ftgftftf\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Aceptar1;
    private javax.swing.JButton Aceptar2;
    private javax.swing.JTextField Cliente;
    private javax.swing.JTextField Cliente1;
    private javax.swing.JTextField Cliente2;
    public javax.swing.JTextArea Pizarra;
    private javax.swing.JTextArea Vendedor;
    private javax.swing.JTextArea Vendedor1;
    private javax.swing.JTextArea Vendedor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jl_respuesta;
    private javax.swing.JLabel jl_respuesta1;
    private javax.swing.JLabel jl_respuesta2;
    private javax.swing.JLabel jl_vendedor;
    private javax.swing.JLabel jl_vendedor1;
    private javax.swing.JLabel jl_vendedor2;
    // End of variables declaration//GEN-END:variables
}
