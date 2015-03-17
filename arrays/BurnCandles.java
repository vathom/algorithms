package arrays;

public class BurnCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candle[] candles = new Candle[4];
		candles[0] = new Candle(2);
		candles[1] = new Candle(2);
		candles[2] = new Candle(2);
		candles[3] = new Candle(2);
		
		int days = getBurningDays(candles);
		System.out.println(days);
	}
	
	public static int getBurningDays(Candle[] candles){
		if(candles == null){
			return -1;
		}
		
		int n = candles.length;
		if(n <= 0){
			return 0;
		}
		
		int days = 0;
		BurningCandles burningCandles = new BurningCandles(n);
		AvailableCandles availCandles = new AvailableCandles(n);
		
		for (Candle candle : candles) {
			availCandles.add(candle);
		}
		
		for(int i=1; i<=n; i++){
			Candle stoppedCandle = burningCandles.extract();
			if(stoppedCandle != null){
				availCandles.add(stoppedCandle);
			}
			
			int j = i;
			while(j>0){
				Candle candleToBurn = availCandles.extract();
				if (candleToBurn == null){
					return days;
				}
				
				int height = candleToBurn.getHeight();
				
				if(height == 0){
					return days;
				}
				
				height--;
				candleToBurn.setHeight(height);
				burningCandles.add(candleToBurn);
				j--;
			}
			if(j==0){
				days = i;
			}
		}
		
		return days;
	}
}
