package com.BskDev;
//Insertion Sort algorithm
//Es wird keine "tausch"-Methode benötigt, weil die Elemente direkt ihren richtigen Endzustand einnehmen
public class Main {

    public static void main(String[] args) {
        int[] array = {3, 21, 4, 5, 19, 22, -1}; //gebe das Array vor (random Zahlen)
// Anfang Insertion Sort
        for (int ersterUnsortierter = 1; ersterUnsortierter < array.length; ersterUnsortierter++) { //Fängt beim ersten Wert im Array an (hier ist das erste Element 3)
            int neuerWert = array[ersterUnsortierter];  // Integer "neuerWert" wird mit dem Element aus dem Array initialisiert.

            int i; //deklariere die Variable i

            for (i = ersterUnsortierter; i > 0 && array[i - 1] > neuerWert; i--) {
                // tausche i mit der nächsten Stelle im Array, wenn der Wert i kleiner ist als der Wert der vor demjenigen
                array[i] = array[i - 1]; //Vergleich der Werte
            }
            array[i] = neuerWert; //update der Elemente im Array
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); // Wiedergabe des sortierten Arrays
        }
    }
}
