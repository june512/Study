package chapter5;

import java.util.Calendar;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day < 0 || day > 31) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
			
		case 4: case 6: case 9: case 11:
			if(day < 0 || day > 30) {
				isValid = false;
			}
			else {
				this.day = day;
			}
			break;
			
		case 2: 
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if (day < 0 || day > 29) {
					isValid = false;
				}
				else {
					this.day= day;
				}
			}
			else {
				this.day = day;
			}
			break;
		default:
			isValid = false;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
		if (month < 1 || month > 12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}
	
	
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
			
		}
		else {
			return "유효하지 않는 날짜입니다.";
		}
	}
}

-------------------------------------------------------------------------------------------------------------

package chapter5;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(30, 2, 2020);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(30, 4, 2020);
		System.out.println(date2.isValid());
	}

}




-------------------------------------------------------------------------------------------------------------

출력결과 : 
유효하지 않는 날짜입니다.
유효한 날짜입니다.

