package pl.indykiewicz.firstapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilities {
    public boolean atLeastOneLower(int first, int second){
        return (first < 100 || second < 100);
    }

    public boolean isSequenceIn(ArrayList<Integer> list){
        ArrayList<Integer> searched = new ArrayList<Integer>(List.of(1,2,3));
        return Collections.indexOfSubList(list, searched) != - 1;
    }

    public boolean isRectangular(int a, int b, int c){
        return a*a + b*b == c*c;
    }

    public void printStuff(int numberOfRows){
        String printable = "*";
        for(int i = 0; i < numberOfRows; i++){
            System.out.println(printable);
            printable = printable + '*';
        }
    }

    public int[] reverseArray(int[] list){
        int[] result = new int[list.length];
        int j = 0;
        for(int i = list.length -1; i >= 0; i--){
            result[j] = list[i];
            j++;
        }
        return result;
    }

    public String halfIt(String string){
        return string.substring(0, string.length() / 2);
    }
}
