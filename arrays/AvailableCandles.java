/**
 * 
 */
package arrays;

/**
 * @author vartho
 *
 */
public class AvailableCandles implements BinaryHeap {
	private Candle[] availCandles = null;
	private int currentSize = 0;
	
	public AvailableCandles(int candleCount) {
		// TODO Auto-generated constructor stub
		availCandles = new Candle[candleCount];
	}
	
	/* (non-Javadoc)
	 * @see arrays.BinaryHeap#add(arrays.Candle)
	 */
	@Override
	public void add(Candle candle) {
		// TODO Auto-generated method stub
		if(candle == null){
			return;
		}
		
		availCandles[currentSize] = candle;
		currentSize++;
		heapify();
	}

	/* (non-Javadoc)
	 * @see arrays.BinaryHeap#extract()
	 */
	@Override
	public Candle extract() {
		// TODO Auto-generated method stub
		if(availCandles == null){
			return null;
		}
		
		if(currentSize == 0){
			return null;
		}
		Candle max = new Candle(availCandles[0].getHeight());
		availCandles[0] = new Candle(availCandles[currentSize-1].getHeight());
		availCandles[currentSize-1] = null;
		currentSize--;
		heapify();
		return max;
	}

	/* (non-Javadoc)
	 * @see arrays.BinaryHeap#heapify()
	 */
	@Override
	public void heapify() {
		// TODO Auto-generated method stub
		for(int i = currentSize/2; i>=0; i--){
			int left = 2*i + 1;
			int right = 2*i + 2;
			
			if(left < currentSize && right < currentSize){
				if(availCandles[left].getHeight() > availCandles[right].getHeight()){
					if(availCandles[i].getHeight() < availCandles[left].getHeight()){
						int temp = availCandles[i].getHeight();
						availCandles[i].setHeight(availCandles[left].getHeight());
						availCandles[left].setHeight(temp);
					}
				}
			}
			
			else if(left < currentSize){
				if(availCandles[left].getHeight() > availCandles[i].getHeight()){
					int temp = availCandles[i].getHeight();
					availCandles[i].setHeight(availCandles[left].getHeight());
					availCandles[left].setHeight(temp);
				}
			}
			
			else if(right < currentSize){
				if(availCandles[right].getHeight() > availCandles[i].getHeight()){
					int temp = availCandles[i].getHeight();
					availCandles[i].setHeight(availCandles[right].getHeight());
					availCandles[right].setHeight(temp);
				}
			}
		}
	}

}
