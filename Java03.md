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
