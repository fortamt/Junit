package ua.goit;

//please always delete unnecessary imports
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//typo Service
class GoodsServiseTest {

    //General: better to use prefix test for each test method instead of check like testFirstPromotion()

    //why do we have package-private access type? It is not important but usually we use public
    @Test
    void checkFirstPromotions(){
        GoodsServise goodsServise = new GoodsServise();
        assertEquals(13.25, goodsServise.calculateTotalCost("ABCDABA"), "Total price wrong");
    }

    @Test
    void checkOnlyAPromotions(){
        GoodsServise goodsServise = new GoodsServise();
        assertEquals(10.25, goodsServise.calculateTotalCost("AAAAAAAAAA"), "Total price wrong");
    }

    @Test
    // do we have any promotions for B goods? So think about naming
    void checkOnlyBPromotions(){
        GoodsServise goodsServise = new GoodsServise();
        assertEquals(42.5, goodsServise.calculateTotalCost("BBBBBBBBBB"), "Total price wrong");
    }

    @Test
    void checkOnlyCPromotions(){
        GoodsServise goodsServise = new GoodsServise();
        assertEquals(9, goodsServise.calculateTotalCost("CCCCCCCCCC"), "Total price wrong");
    }

    @Test
    // the same as with B
    void checkOnlyDPromotions(){
        GoodsServise goodsServise = new GoodsServise();
        assertEquals(7.5, goodsServise.calculateTotalCost("DDDDDDDDDD"), "Total price wrong");
    }



}