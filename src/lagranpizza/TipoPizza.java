
package lagranpizza;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Johana Menesis Segura Carranza
 * @version 1.0
 * @since 1.0
 * 
 */
public class TipoPizza {
    
    Hashtable<String,String> TiposDePizza=new Hashtable<String,String>();
    
    Hashtable<String,String> PizzaChicago=new Hashtable<String,String>();
    Hashtable<String,String> PizzaMexicana=new Hashtable<String,String>();
    Hashtable<String,String> PizzaHawaii=new Hashtable<String,String>();
    Hashtable<String,String> PizzaClasica=new Hashtable<String,String>();
    
    /*
    * Agregar los tipos de pizza
    * 
    *
    */
    public TipoPizza (){
        TiposDePizza.put("4","Pizza Classica");
        TiposDePizza.put("3","Pizza Hawaii");
        TiposDePizza.put("2","Pizza Mexicana");
        TiposDePizza.put("1","Pizza Chicago");
             
        IngredientesDePizzas();
    }
    /*
    * Agregar los ingredientes a las pizzas
    * 
    */
    public void IngredientesDePizzas(){
        PizzaChicago.put("1Pizza Chicago", "Pepperoni");
        PizzaChicago.put("2Pizza Chicago", "Queso mozzarella ");
        PizzaChicago.put("3Pizza Chicago", "Queso parmesano");
        
        PizzaMexicana.put("1Pizza Mexicana", "Chorizo");
        PizzaMexicana.put("2Pizza Mexicana", "Cebolla");
        PizzaMexicana.put("3Pizza Mexicana", "Carne Molida");
        PizzaMexicana.put("4Pizza Mexicana", "Jalapeño");
        
        PizzaHawaii.put("1Pizza Hawaii", "Jamon");
        PizzaHawaii.put("2Pizza Hawaii", "Piña");
        
        PizzaClasica.put("1Pizza Classica", "Pepperoni");
    }
    
    /*
    * Ver los tipos de pizza
    * @return String
    *
    */
    public String  menuPizzas(){
        Enumeration<String> TipoPizza = TiposDePizza.elements();
        Enumeration<String> IdPizza = TiposDePizza.keys();
        String menu="";
        while (TipoPizza.hasMoreElements()) {
            menu = menu + IdPizza.nextElement()+": " + TipoPizza.nextElement()+"\n";
        }
        return menu;
    }
    /*
    * Metedo para elegir pizza
    * @param opcion String
    * @return Hashtable
    *
    */
    public Hashtable<String,String> ElegirPizza(String opcion){
        
        try{
        
            if(TiposDePizza.containsKey(opcion)){
                switch(opcion)
                {
                    case "1":
                        return PizzaChicago;
                    case "2":
                        return PizzaMexicana;
                    case "3":
                        return PizzaHawaii;
                    case "4":
                        return PizzaClasica;
                    default:
                        return null;
                }
            }
            else{
                return null;
            }
        }catch(Exception e)
        {
            System.out.println("Error en Elegir Pizza:"+e);
            return null;
        }
    }
   
}
