## 다운 캐스팅
 - 묵시적으로 상위 클래스 형 변환된 인스턴스가 원래 자료형(하위클래스)으로 변환되어야 할 때 다운캐스팅이라고 한다.
 - 하위클래스로의 형 변환은 명시적이어야한다.
 ```
 Customer vc = new VIPCustomer(); //묵시적
 VIPCustomer vCustomer = (VIPCustomer)vc; //명시적
 ```
 
 ### 예제
 ```
 package ploymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		Human human = (Human)hAnimal;
//		human.readBooks();
		
//		Eagle human = (Eagle)hAnimal; //에러 남
		/*
		if(hAnimal instanceof Human) {
			Human human = (Human)hAnimal; 
			human.readBooks();
		} 
		*/
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
//		for(Animal anmail : animalList) {
//			anmail.move();
//		}
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0 ; i < list.size() ; i ++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			
			else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			
			else {
				System.out.println("error");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
```
