package com.mycompany.frutas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("bancada de pastel");
        frutas.add("melancia");
        frutas.add("melao");

        System.out.println("Lista de Frutas: " + frutas);

        //Remover a terceira fruta e exibir a lista atualizada
        frutas.remove(1);  // Remove a fruta na posição 2
        System.out.println("Lista de Frutas depois remover a terceira fruta: " + frutas);

        //Buscar uma fruta específica no Array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de uma fruta para buscar: ");
        String frutaParaBuscar = scanner.nextLine();
        boolean resultadoBusca = buscarFruta(frutas, frutaParaBuscar);
        System.out.println("A fruta '" + frutaParaBuscar + "' esta na lista? " + resultadoBusca + "\n \n");

        //Ordenar um Array de números inteiros em ordem crescente
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(8);
        numeros.add(3);
        numeros.add(2);
        
        System.out.println("Lista de Numeros Original: " + numeros);
        Collections.sort(numeros);  // Ordena a lista
        System.out.println("Lista de Numeros Ordenada: " + numeros);

        // Exercício 5: Contar números pares no ArrayList
        int quantidadePares = contarPares(numeros);
        System.out.println("Quantidade de numeros pares na lista: " + quantidadePares);
        
        scanner.close();
    }

    // Método para buscar uma fruta no ArrayList
    public static boolean buscarFruta(ArrayList<String> lista, String fruta) {
        return lista.contains(fruta);
    }

    // Método para contar números pares em um ArrayList
    public static int contarPares(ArrayList<Integer> lista) {
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
