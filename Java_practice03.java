package coffee;

public class Menu {
	
	public static final int STARARMERICANO = 4000;
	public static final int STARLATTE = 4300;
	
	public static final int BEANARMERICANO = 4100;
	public static final int BEANLATTE = 4500;
}

--------------------------------------------------------------------------------------------------

package coffee;

public class BeanCoffee {

	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.BEANARMERICANO) {
			return "콩다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.BEANLATTE) {
			return "콩다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}

--------------------------------------------------------------------------------------------------

package coffee;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.STARARMERICANO) {
			return "별다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.STARLATTE) {
			return "별다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}

--------------------------------------------------------------------------------------------------

package coffee;

public class Person {

	String name;
	int money;
	
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "으로 " + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if (message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "으로 " + message);
		}
	}
}

--------------------------------------------------------------------------------------------------

package coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Person Kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Kim.buyStarCoffee(starCoffee, Menu.STARARMERICANO);
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
	}

}

--------------------------------------------------------------------------------------------------

출력 결과 :
Kim님이 4000으로 별다방 아메리카노를 구입했습니다.
Lee님이 4500으로 콩다방 라떼를 구입했습니다.
