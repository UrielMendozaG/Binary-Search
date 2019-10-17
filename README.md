# Binary Search

En ciencias de la computación y matemáticas, la búsqueda binaria, también conocida como búsqueda 
de intervalo medio o  búsqueda logarítmica, es un algoritmo de búsqueda que encuentra la posición 
de un valor en un array ordenado.

Compara el valor con el elemento en el medio del array, si no son iguales, la mitad en la cual el 
valor no puede estar es eliminada y la búsqueda continúa en la mitad restante hasta que el valor 
se encuentre. 

### Algoritmo en Java

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
      
 ### Ejercicios 
 
 1. Hacer un programa en java que llene un arreglo con numeros pseudo aleatorios, despues lo ordene usando metodo 
 burbuja, y despues busque un numero introducido por el usuario usando busqueda binaria. 
 
 [codigo aqui](https://github.com/UrielMendozaG/Binary-Search/blob/master/Binary%20search/src/com/binarysearch/com/Binarysearch.java)
