package com.binarysearch.com;

import java.util.Random;
import java.util.Scanner;

public class Binarysearch {
		public static void main(String[] args) {
			
			//declaracion de variables
			
			int elementoBuscar = 0;
			int[] arreglo = new int[10];
			int auxiliar = 0;
			int limiteSuperior = 9;
			int limiteInferior = 0;
			int pivote = 0;
			int indexFound = -1;
			
			//object construction
			
			Scanner input = new Scanner(System.in);
			Random number = new Random(System.nanoTime());
			
			//vamos a llenar el arreglo de numeros aleatorios
			
			for(int i=0; i<10; i++) {
				arreglo[i] = number.nextInt(11);
			}
			
			//imprimir el arreglo de numeros aleatorios
			
			for(int i=0; i<10; i++) {
				System.out.print(arreglo[i]+" ");
			}
			
			//salto de linea
			System.out.println("");
			
			//pedir al usuario el numero a buscar
			
			do {
				System.out.println("Ingresa el numero a buscar en el arreglo: ");
				elementoBuscar = input.nextInt();
				
				if(elementoBuscar < 0) {
					
					System.out.println("Numero mayor a cero");
				}else {
					break;
				}
				
			}while(elementoBuscar < 0);
			
			
			//ordenamos el arreglo con metodo burbuja
			
			
			for(int i=0; i<10-1;i++) {
				for(int j=0; j<10-i-1; j++) {
					if(arreglo[j] > arreglo[j+1]) {
						
						//swap
						auxiliar = arreglo[j+1];
						arreglo[j+1] = arreglo[j];
						arreglo[j] = auxiliar;
						
					}
				}
			}
			
					
			//hacer el proceso de busqueda
			
			//binary search
			while(limiteInferior <= limiteSuperior) {
				pivote = limiteInferior+(limiteSuperior - limiteSuperior)/2;
					if(elementoBuscar == arreglo[pivote]) {
						indexFound = pivote;
						break;
					}else if(elementoBuscar > arreglo[pivote]) {
						limiteInferior = pivote + 1;
					}else if(elementoBuscar < arreglo[pivote]){
						limiteInferior = pivote -1;
					}	
			}
			
			if(indexFound != -1) {
				System.out.println("Elemento encontrado en el index: "+indexFound);
			}else {
				System.out.println("Elemento no encontrado");
			}
			
			
		}
}
