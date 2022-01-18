package ua.goit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsServiseTest {

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
    void checkOnlyDPromotions(){
        GoodsServise goodsServise = new GoodsServise();
        assertEquals(7.5, goodsServise.calculateTotalCost("DDDDDDDDDD"), "Total price wrong");
    }




}