package jun.alrorithm.besttime;

public class StockPredictor {

	public int findMaxProfit(int[] prices) {
		int max = 0;
		int min = prices[0];
		for (int todayPrice: prices) {
			7,6,8,3,2
			max = Math.max(todayPrice - min, max);
			min = Math.min(todayPrice, min);
		}

		return max;
	}

}
