import java.util.Comparator;

public class BubbleSort<T> implements Sort<T>{
	
	
	public void sortASC(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				
				if (array[j + 1] < array[j] ) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
		}
	}
	
	public void sortDESC(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				
				if (array[j + 1] > array[j] ) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
		}
	}

	@Override
	public void sort(T[] array, Comparator<T> comparator) {
		// TODO Auto-generated method stub
		
	}


}
