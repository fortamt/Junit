package ua.goit;

public class App {

    public static void main(String[] args) {

        GoodsService goodsServise = new GoodsService();
        System.out.println(goodsServise.calculateTotalCost("ABCDABA"));


    }

}
