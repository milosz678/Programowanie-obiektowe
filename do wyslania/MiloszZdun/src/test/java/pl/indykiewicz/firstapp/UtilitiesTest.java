package pl.indykiewicz.firstapp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {

    Utilities ut = new Utilities();
    int[] preReverse;
    int[] postReverse;

    @BeforeAll
    void doThis(){
        preReverse = new int[5];
        postReverse = new int[5];
        for(int i = 0; i < 5; i++){
            preReverse[i] = i;
        }
        for(int i = 4; i >= 0; i--){
            postReverse[i] = i;
        }
    }

    @Test
    void first(){
        org.junit.jupiter.api.Assertions.assertEquals(true, ut.atLeastOneLower(121, 61));
    }

    @Test
    void second(){
        org.junit.jupiter.api.Assertions.assertEquals(true, ut.isSequenceIn(new ArrayList<Integer>(List.of(2,3,4,6,4,
                3,2,1,2,3))));
    }

    @Test
    void third(){
        org.junit.jupiter.api.Assertions.assertEquals("Ban", ut.halfIt("Banany"));
    }

    @Test
    void fourth(){
        org.junit.jupiter.api.Assertions.assertArrayEquals(postReverse, ut.reverseArray(preReverse));
    }
}
