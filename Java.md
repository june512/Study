## 클래스 

### 클래스 생성하기
```
new 키워드를 사용하여 생성자로 생성
Student studentLee = new Student();
```
### 클래스의 속성, 메서드 참조하기
```
생성에 사용한 변수(참조변수)로 클래스의 속성, 메소드 참조
studentLee.studentName = "Lee";
studentLee.showStudentInfo();
```

### public 키워드가 있는 클래스는 작업 파일과 이름이 동일해야한다.

Student.java
```
package class

// 글래스 이름이 작업 파일 이름과 동일해야 함.
public class Studnet{

}

// 클래스 이름이 작업 파일 이름과 동일하지 않아도 됨.
class ABC{

}
```
