/**
 * 
 */
package arrays;

/**
 * @author vartho
 *
 */
public interface BinaryHeap {
	void add(Candle candle);
	Candle extract();
	void heapify();
}
