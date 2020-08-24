## 상속(Inheritance)
 - 새로운 클래스를 정의 할 때 이미 구현된 클래스의 상속을 받아서 속성이나 기능이 확장되는 클래스를 구현.

 ```
// B클래스가 A클래스에게 상속 받는다.
class B extends A {

}
 ```
 
 ### 상속을 사용하는 경우
 - 상위 클래스는 하위 클래스보다 일반적인 개념과 기능을 가짐
 - 하위 클래스는 상위 클래스보다 구체적인 개념과 기능을 가짐
 ```
 class Mammal{
 
 }
 
 class Human extends Mammal{
 
 }
 extends 뒤에는 단 하나의 class만 사용할 수 있음
 자바는 single inheritance만 지원한다.
 ```
 
 ### protected 예약어
 - 외부 클래스에 private으로 하위 클래스에서 public의 기능을 구현한 키워드
 - 상위 클래스에 protected로 선언된 변수나 메서드는 다른 외부 클래스에서는 사용할 수 없지만 하위 클래스에서는 사용 가능
 
 ### 접근 제한자(Access Modifier)의 가시성
||외부클래스|하위 클래스|동일 패키지|내부 클래스|
|------|---|---|---|---|
|public|O|O|O|O|
|protected|X|O|O|O|
|default|X|X|O|O|
|private|X|X|X|O|

## 오버라이딩(Overrideing)
- 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있다.

## 다형성(Ploymorphism)
- 하나의 코드가 여러 자료형으로 구현되어 실행되는 것이며, 캍은 코드에서 여러 실행 결과가 나온다.
- 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나이며, 객체지향 프로그래밍의 유연성, 재활용성, 유지보수성에 기본이 되는 특징.

```
package ploymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
```
