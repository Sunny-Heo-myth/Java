package array;

public class ObjectCopy1 {
	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("알렉시스 조르바스의 삶과 모험", " 니코스 카잔차키스");
		bookArray1[1] = new Book("지옥", "단테");
		bookArray1[2] = new Book("물리학 강의", "리처드 파인만");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}
}
