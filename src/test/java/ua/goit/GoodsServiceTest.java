package ua.goit;

//please always delete unnecessary imports DONE
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//typo Service DONE
class GoodsServiceTest {

    //General: better to use prefix test for each test method instead of check like testFirstPromotion() DONE

    //why do we have package-private access type? It is not important but usually we use public DONE
    @Test
    public void testFirstPromotions(){
        GoodsService goodsServise = new GoodsService();
        assertEquals(13.25, goodsServise.calculateTotalCost("ABCDABA"), "Total price wrong");
    }

    @Test
    public void testOnlyAPromotions(){
        GoodsService goodsServise = new GoodsService();
        assertEquals(10.25, goodsServise.calculateTotalCost("AAAAAAAAAA"), "Total price wrong");
    }

    @Test
    // do we have any promotions for B goods? So think about naming DONE
    public void testOnlyB(){
        GoodsService goodsServise = new GoodsService();
        assertEquals(42.5, goodsServise.calculateTotalCost("BBBBBBBBBB"), "Total price wrong");
    }

    @Test
    public void testOnlyCPromotions(){
        GoodsService goodsServise = new GoodsService();
        assertEquals(9, goodsServise.calculateTotalCost("CCCCCCCCCC"), "Total price wrong");
    }

    @Test
    // the same as with B DONE
    public void testOnlyD(){
        GoodsService goodsServise = new GoodsService();
        assertEquals(7.5, goodsServise.calculateTotalCost("DDDDDDDDDD"), "Total price wrong");
    }



}