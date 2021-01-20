package com.BskDev;

public class Main {
    //bubble sort implementation
    public static void main(String[] args) {
        //benötige eine Tauschmethode um die Elemente untereinander zu tauschen
        //benötige Sortieralgorithmus um festzulegen wie sortiert werden soll (hier: Bubble sort)

        int[] intArray = {34,34,-26,1,55,1,-34}; //Bsp.ARRAY

        for (int letzterUnsortierter = intArray.length -1; letzterUnsortierter > 0; letzterUnsortierter--){
            for (int i = 0; i < letzterUnsortierter; i++){
                if (intArray[i] > intArray[i+1]){
                        tauschen(intArray, i,i+1);
                }
            }
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
    public static void tauschen(int[] array, int i, int j){
        if ( i == j ){
            return; //wenn die gleich sind, sollen Elemente nicht getauscht werden.
        }

        int temp = array[i]; //integer an der Stelle i kommt in den temporären "Speicher".
        array[i] = array [j]; // i kommt an Stelle von j
        array[j] = temp; //j wird zu dem was i an dieser Stelle war, weil wir ja i in den temp Speicher gelegt haben...
    }
}
