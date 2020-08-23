## 배열
### 배열 선언하기
```
int[] arr = new int[10];
int arr[] = new int[10];
```

### 참조 자료형 배열(객체 배열)
```
Book[] library = new Book[5];
```

Book.java
```
package array;

public class Book {

	private String title;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(title + ", " + author);
	}
}
```

BookArrayTest.java
```
package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("삼국지1","나관중");
		library[1] = new Book("삼국지2","나관중");
		library[2] = new Book("삼국지3","나관중");
		library[3] = new Book("삼국지4","나관중");
		library[4] = new Book("삼국지5","나관중");
		
		for(int i = 0 ; i < library.length ; i ++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
```

출력화면
```
array.Book@15db9742
삼국지1, 나관중
array.Book@6d06d69c
삼국지2, 나관중
array.Book@7852e922
삼국지3, 나관중
array.Book@4e25154f
삼국지4, 나관중
array.Book@70dea4e
삼국지5, 나관중
```

### Array Copy
```
package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
}
```

## 객체 배열 복사
- 얕은 복사
```
package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("삼국지1", "나관중");
		library[1] = new Book("삼국지2", "나관중");
		library[2] = new Book("삼국지3", "나관중");
		library[3] = new Book("삼국지4", "나관중");
		library[4] = new Book("삼국지5", "나관중");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		library[0].setAuthor("베르나르 베르베르");
		library[0].setTitle("개미");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		System.out.println("======================");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
```

출력화면 
```
개미, 베르나르 베르베르
삼국지2, 나관중
삼국지3, 나관중
삼국지4, 나관중
삼국지5, 나관중
======================
개미, 베르나르 베르베르
삼국지2, 나관중
삼국지3, 나관중
삼국지4, 나관중
삼국지5, 나관중
```

- 깊은 복사
```
package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("삼국지1", "나관중");
		library[1] = new Book("삼국지2", "나관중");
		library[2] = new Book("삼국지3", "나관중");
		library[3] = new Book("삼국지4", "나관중");
		library[4] = new Book("삼국지5", "나관중");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0 ; i < library.length ; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("개미");
		library[0].setAuthor("베르나르 베르베르");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("======================");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}

}
```

출력화면
```
개미, 베르나르 베르베르
삼국지2, 나관중
삼국지3, 나관중
삼국지4, 나관중
삼국지5, 나관중
======================
삼국지1, 나관중
삼국지2, 나관중
삼국지3, 나관중
삼국지4, 나관중
삼국지5, 나관중
```
