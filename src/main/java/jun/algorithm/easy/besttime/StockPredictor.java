package jun.algorithm.easy.besttime;

public class StockPredictor {

	public int findMaxProfit(int[] prices) {
		int max = 0;
		int min = prices[0];
		for (int todayPrice: prices) {
			max = Math.max(todayPrice - min, max);
			min = Math.min(todayPrice, min);
		}

		return max;
	}

}
