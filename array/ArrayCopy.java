package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] intarray1 = {10, 20, 30, 40, 50};
		int[] intarray2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(intarray1, 2, intarray2, 1, 4);
		for(int i = 0; i < intarray2.length; i++) {
			System.out.println(intarray2[i]);

		}

	}

}
