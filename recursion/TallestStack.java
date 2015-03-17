package recursion;

import java.util.ArrayList;

public class TallestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Box> getTallestStack(Box[] boxes, Box bottom){
		
		ArrayList<Box> currentTallest = new ArrayList<Box>();
		int maxHeight = 0;
		
		for(int i=0; i<boxes.length; i++){
			Box nextBottom = boxes[i];
			if(nextBottom.canFitOnTop(bottom)){
				ArrayList<Box> nextTallest = getTallestStack(boxes, nextBottom);
				
				int height = getHeightOfStack(nextTallest);
				
				if(height > maxHeight){
					maxHeight = height;
					currentTallest = nextTallest;
				}
			}
		}
		
		if(bottom != null){
			currentTallest.add(0, bottom);
		}
		
		return currentTallest;
	}
	
	public static int getHeightOfStack(ArrayList<Box> boxes){
		return 1;
	}
}