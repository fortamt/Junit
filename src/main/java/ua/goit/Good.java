package ua.goit;

import java.util.Objects;

public class Good {

    private float price;
    private int promotionCount;
    private float promotionPrice;

    public Good(float price, int promotionCount, float promotionPrice) {
        this.price = price;
        this.promotionCount = promotionCount;
        this.promotionPrice = promotionPrice;
    }

    public Good(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public int getPromotionCount() {
        return promotionCount;
    }

    public float getPromotionPrice() {
        return promotionPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return Float.compare(good.price, price) == 0 && promotionCount == good.promotionCount && Float.compare(good.promotionPrice, promotionPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, promotionCount, promotionPrice);
    }

    @Override
    public String toString() {
        return "Good{" +
                "price=" + price +
                ", promotionCount=" + promotionCount +
                ", promotionPrice=" + promotionPrice +
                '}';
    }
}
