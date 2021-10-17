package jun.alrorithm.besttime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class BestTimeToBuyTest {

	@Test
	public void findMaxProfitTest1() {
		 int[] prices = {7,1,5,3,6,4};
		 
		 StockPredictor predictor = new StockPredictor();
		 int maxProfit = predictor.findMaxProfit(prices);
		 
		 assertThat(maxProfit, is(5));
	}
	
	@Test
	public void findMaxProfitTest2() {
		 int[] prices = {7,6,4,3,1};
		 
		 StockPredictor predictor = new StockPredictor();
		 int maxProfit = predictor.findMaxProfit(prices);
		 
		 assertThat(maxProfit, is(0));
	}
	
	@Test
	public void findMaxProfitTest3() {
		 int[] prices = {7,6,8,3,2};
		 
		 StockPredictor predictor = new StockPredictor();
		 int maxProfit = predictor.findMaxProfit(prices);
		 
		 assertThat(maxProfit, is(2));
	}
	
}
