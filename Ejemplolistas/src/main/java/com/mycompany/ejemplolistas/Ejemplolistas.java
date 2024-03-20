
package com.mycompany.ejemplolistas;

import java.util.ArrayList;

public class Ejemplolistas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ArrayList <String> arrayList = new ArrayList<>();
        
        System.out.println(arrayList.size()); //.size se usa para que muestre el valor que hay que en array en numero//
        System.out.println(arrayList.isEmpty()); // .isEmpty se usa para que muestre lo mismo de arriba pero en true o false//
        
        arrayList.add("Hola"); 
        arrayList.add("mundo"); 
        arrayList.add("cruel");
        
         ArrayList <String> total = new ArrayList<>();
         total.add("Nuevo");
         
         total.addAll (arrayList);
         System.out.println(total);
        
        arrayList.set(2, "bonito");//.set se usa para cambiar el valor de un array, se cambia "cruel" por "bonito//
        arrayList.remove(0);//para quitar una linea//
        
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
    }
}
