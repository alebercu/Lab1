import java.util.Arrays;


public class Aufgabe4 {

    public int cheapest(int[] prices){
        return Arrays.stream(prices).min().getAsInt();
    }

    public int mostExpensive(int[] pricesT, int[] pricesU){
        int maxT = Arrays.stream(pricesT).max().getAsInt();
        int maxU = Arrays.stream(pricesU).max().getAsInt();
        return Math.max(maxT, maxU);
    }

    public int mostExpensiveInBudget(int[] prices, int budget){
        int maxPrice = -1;
            for (int price : prices) {
                if (price <= budget && price > maxPrice) {
                    maxPrice = price;
                }
            }
            return maxPrice;
        }

    public int maxToBuy(int[] pricesT, int[] pricesU, int budget){
        int maxBought = -1;

        for(int priceT : pricesT){
            for(int priceU : pricesU){
                int sum = priceT + priceU;

                if(sum <= budget && sum > maxBought){
                    maxBought = sum;
                }
            }

        }
    return maxBought;

    }

}


