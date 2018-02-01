/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagranpizza;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JTextArea;
//import static dgranpizza.LaGranPizza.NumOrden;

/**
 *
 * @author Johana Menesis Segura Carranza
 * @version 1.0
 * @since 1.0
 * 
 */
public class NuevaOrden extends Thread implements ProcesosDePizza{
    
    int     int_idOrden;
    String  str_TipoDePizza;
    Hashtable<String,String>  hash_Pizza;
    int     int_CantidadPizzas;
    int     int_PizzaEnProceso;
    String TipoPizza;
    static JTextArea ta_pizarra = new JTextArea();
    static PizarraLaGranPizza pizarraLGP;

    /*
    * Constructor para crear nueva orden
    */
    NuevaOrden(int NumOrden, Hashtable<String, String> PizzaElegida, int cantPizzas) {
        try
        {
        int_idOrden = NumOrden;
        hash_Pizza = PizzaElegida;
        int_CantidadPizzas = cantPizzas;
        pizarraLGP = new PizarraLaGranPizza(ta_pizarra);
        }catch(Exception e){
            System.out.println("Error en contructor: "+e);
        }
    }
    
    public void run()
    {
        try
        {
            Enumeration<String> nombrePizza = hash_Pizza.keys();
            TipoPizza = nombrePizza.nextElement().replaceAll("[^A-Za-z]", " ");

            for(int_PizzaEnProceso=1;int_PizzaEnProceso<=int_CantidadPizzas;int_PizzaEnProceso++)
            {
                pedido();
                armado();
                empacado();
                entregado();
            }
        }catch(Exception e)
        {
            System.out.println("Error en run:"+e);
        }
    }

    /*
    * Proceso pedido
    */
    public void pedido() {
        try{
            System.out.println("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** PIZZA NUM:"+ int_PizzaEnProceso +" *** PROCESO:En Pedido" );
            //ta_pizarra.append("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** PIZZA NUM:"+ int_PizzaEnProceso +" *** PROCESO:En Pedido"  );
            esperarSegundos();
        }catch(Exception e)
        {
            System.out.println("Error en pedido:"+e);
        }
    }

    /*
    * Proceso armado
    */
    public void armado() {
        try{
            Enumeration<String> ingrediente = hash_Pizza.elements();
            while (ingrediente.hasMoreElements()) {
                System.out.println("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** PIZZA NUM:"+ int_PizzaEnProceso +" *** PROCESO:Armando "+ " *** AGREGANDO:"+ingrediente.nextElement());
                //pizarraLGP.addPizarra("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** PIZZA NUM:"+ int_PizzaEnProceso +" *** PROCESO:Armando "+ " *** AGREGANDO:"+ingrediente.nextElement());
                esperarSegundos();
            } 
        }catch(Exception e)
        {
            System.out.println("Error en armado:"+e);
        }
    }

    /*
    * Proceso empacado
    */
    public void empacado() {
        try{
        System.out.println("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** NUM:"+ int_PizzaEnProceso +" *** PROCESO:Empacado" );
        //pizarraLGP.addPizarra("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** NUM:"+ int_PizzaEnProceso +" *** PROCESO:Empacado" );
        esperarSegundos();
        }catch(Exception e)
        {
            System.out.println("Error en empacado:"+e);
        }
    }

    /*
    * Proceso entregado
    */
    public void entregado() {
        try{
        System.out.println("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** PIZZA NUM:"+ int_PizzaEnProceso +" *** PROCESO:Entregado" );
        //pizarraLGP.addPizarra("ORDEN NUM:"+ int_idOrden +" *** PIZZA:"+TipoPizza+  " *** PIZZA NUM:"+ int_PizzaEnProceso +" *** PROCESO:Entregado" );
        esperarSegundos();
        }catch(Exception e)
        {
            System.out.println("Error en entregado:"+e);
        }
    }
    /*
    * metodo para esperar unos segundos
    */
    private void esperarSegundos() {
		try {
                        int segundos =(int) (Math.random() * 5) + 1;
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
                        System.out.println("Error en espera"+ex);
			Thread.currentThread().interrupt();
		}
    }
}
