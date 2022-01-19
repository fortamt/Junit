package ua.goit;

// typo Service DONE
class GoodsService {

    //Upper case means the variable should be a constant DONE
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
            return calculateOneGood(count, price, promotionCount, promotionPrice);
        }
    }

    private float calculate(int count, float price){
        return count * price;
    }

    private float calculateOneGood(int count, float price, int promotionCount, float promotionPrice){
        float result = 0.0f;
        while(count % promotionCount != 0){
            result+= price;
            count--;
        }
        // why do we need each one if instead of just if-else construction? DONE
        if(count > 0 && count % promotionCount == 0){
            // please try to write more readable code. At least add more spaces but better
            // create separate method with meaningful mane DONE
            result+=count/promotionCount*promotionPrice;
        }
        return result;
    }



}
