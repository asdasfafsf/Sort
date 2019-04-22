
public class SortTest {
	
	public static void main(String args[]) {
		int a[] = {1,3,2,4,5};
		
		Sort sort = new BubbleSort();
		sort.sortASC(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
