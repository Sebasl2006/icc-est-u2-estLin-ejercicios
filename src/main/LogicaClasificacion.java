package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> arr = new Stack<>();
        for(char ca : texto.toCharArray()) arr.push(ca);
        String s = "";
        while (!arr.isEmpty()) s += arr.pop(); 

        return s;
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> arr = new Stack<>();
        for (char c : expresion.toCharArray()){
            if ( c == '[' || c == '{'|| c == '(' ) arr.push(c);
            if ((c == ']' && arr.pop() != '[' || c == '}' && arr.pop() != '{' || c == ')' && arr.pop()!= '(')) return false;
        }
        
        return arr.isEmpty();
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> aux = new Stack<>();
        while( !pila.isEmpty()){
            int tem = pila.pop();
            while (!aux.isEmpty() && aux.peek() > tem) {
                pila.push(aux.pop());
                
            }
            aux.push(tem);
        }
        

        return aux;
    }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
    LinkedList<Integer> pares = new LinkedList<>();
    LinkedList<Integer> impares = new LinkedList<>();

    for (Integer num : original) {
        if (num % 2 == 0) {
            pares.add(num);
        } else {
            impares.add(num);
        }
    }

    pares.addAll(impares);
    return pares;
}

        
    }

