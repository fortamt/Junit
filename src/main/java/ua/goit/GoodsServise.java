package ua.goit;

// typo Service
public class GoodsServise {

    //Upper case means the variable should be a constant ---OK
    private final Good A = new Good(1.25f, 3, 3.00f);
    private final Good B = new Good(4.25f);
    private final Good C = new Good(1.00f, 6, 5.00f);
    private final Good D = new Good(0.75f);

    public float calculateTotalCost(String goods){
        float result = 0.0f;
        int countA = goodsCountCalc(goods, 'A');
        int countB = goodsCountCalc(goods, 'B');
        int countC = goodsCountCalc(goods, 'C');
        int countD = goodsCountCalc(goods, 'D');
        result += calculate(countA, A.getPrice(), A.getPromotionCount(), A.getPromotionPrice());
        result += calculate(countB, B.getPrice());
        result += calculate(countC, C.getPrice(), C.getPromotionCount(), C.getPromotionPrice());
        result += calculate(countD, D.getPrice());
        return result;
    }

    private int goodsCountCalc(String goods, char s){
        long result =  goods.chars().filter(ch -> ch == s).count();
        return (int)result;
    }

    private float calculate(int count, float price, int promotionCount, float promotionPrice){
        if(count <= 0){
            return 0.0f;
        } else {
            float result = 0.0f;
            if(count % promotionCount != 0){
                while(count % promotionCount != 0){
                    result+= price;
                    count--;
                }
            }
            // why do we need each one if instead of just if-else construction?
            if(count % promotionCount == 0){
                // please try to write more readable code. At least add more spaces but better
                // create separate method with meaningful mane
                result+=count/promotionCount*promotionPrice;
            }
            return result;
        }
    }

    private float calculate(int count, float price){
        return count * price;
    }



}
