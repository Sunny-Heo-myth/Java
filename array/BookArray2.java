package array;

public class BookArray2 {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("알렉시스 조르바스의 삶과 모험", " 니코스 카잔차키스");
		library[3] = new Book("지옥", "단테");
		library[4] = new Book("물리학 강의", "리처드 파인만");

		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //physical address
		}
		
	}
}
