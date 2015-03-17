package arrays;

public class BurningCandles implements BinaryHeap {
	
	private Candle[] burningCandles = null;
	private int currentSize = 0;
	
	public BurningCandles(int candleCount){
		burningCandles = new Candle[candleCount];
	}
	
	@Override
	public void add(Candle candle){
		if(candle == null){
			return;
		}
		
		burningCandles[currentSize] = candle;
		currentSize++;
		heapify();
	}
	
	@Override
	public Candle extract(){
		
		if(burningCandles == null){
			return null;
		}
		
		if(currentSize == 0){
			return null;
		}
		Candle min = new Candle(burningCandles[0].getHeight());
		
		burningCandles[0] = new Candle(burningCandles[currentSize-1].getHeight());
		burningCandles[currentSize-1] = null;
		currentSize--;
		heapify();
		return min;
	}

	@Override
	public void heapify() {
		// TODO Auto-generated method stub
		for(int i = currentSize/2; i>=0; i--){
			int left = 2*i + 1;
			int right = 2*i + 2;
			
			if(left < currentSize && right < currentSize){
				if(burningCandles[left].getHeight() < burningCandles[right].getHeight()){
					if(burningCandles[i].getHeight() > burningCandles[left].getHeight()){
						int temp = burningCandles[i].getHeight();
						burningCandles[i].setHeight(burningCandles[left].getHeight());
						burningCandles[left].setHeight(temp);
					}
				}
			}
			
			else if(left < currentSize){
				if(burningCandles[left].getHeight() < burningCandles[i].getHeight()){
					int temp = burningCandles[i].getHeight();
					burningCandles[i].setHeight(burningCandles[left].getHeight());
					burningCandles[left].setHeight(temp);
				}
			}
			
			else if(right < currentSize){
				if(burningCandles[right].getHeight() < burningCandles[i].getHeight()){
					int temp = burningCandles[i].getHeight();
					burningCandles[i].setHeight(burningCandles[right].getHeight());
					burningCandles[right].setHeight(temp);
				}
			}
		}
	}
}
