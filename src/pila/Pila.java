
package pila;

import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Pila vacía: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());
        
        //agregar
        pila.push(1);        
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //recorrido
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }
        
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacía? " + pila.isEmpty());
        
        //eliminar el último registro que entró
        pila.pop();
        
        //search busqueda, si encuentra lanza un valor positivo y si no lo encuentra muestra -1
        System.out.println("Está el 3? " + pila.search(3));
        
        //muestra el ultimo agregado
        System.out.println("Último agregado: " + pila.peek());
        
    }
    
}
