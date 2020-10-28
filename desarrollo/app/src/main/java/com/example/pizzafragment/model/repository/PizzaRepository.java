package com.example.pizzafragment.model.repository;
import com.example.pizzafragment.model.Pizza;

import java.util.ArrayList;
public class PizzaRepository {
    private static ArrayList<Pizza> list;
    //Estructura que inicializa los campos estaticos o de clase
    //ya que no se puede inicializar en un objeto
    //Static es comun a todos los objetos de la clase
    static{
        list = new ArrayList<>();
        list.add(new Pizza("Vegetariana", "Cebolla, pimiento y queso parmesano", 12.50F));
        list.add(new Pizza("4 Estaciones", "Cebolla, jamon york y queso parmesano", 11.50F));
        list.add(new Pizza("Americana", "Carne, salsa barbacoa y queso parmesano", 13.00F));
    }
    private PizzaRepository(){}
    public static ArrayList<Pizza> getList() {
        return list;
    }

    /*Metodo que dad una posicion devuelce una pizza*/
    public static Pizza getPizza(int position)
    {
        return list.get(position);
    }
}
