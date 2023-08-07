package movie;



public class Movie {
	
	
	// 필드
	String movieName;//영화명
	int price;//금액
	int age;//나이
	int money;//실구매금액
	double rate;//할인율
	String way;//구매방법	
	
	//생성자
	public Movie(String movieName, int price, int age, String way ) {

	//매개변수로 값을 받아서 멤버변수에 넣기

	this.movieName = movieName;
	this.price = price;
	this.age = age;
	this.way = way;
	}
	
	void ratecal() {
	rate = 0;
	// 나이의 따라 할인 조건이 다양하기 때문에 조건식 if~else을 통하여 달라지는 할인율을 구한다 (나이 예) 90이상 ~ 100미만)
	
	if (age < 20) { // age가 20보다 작으면 할인율은 25%
		rate = rate + 0.25;
	}
	else if (age >=20 && age <30) { // age가 20과 같거나 크고 age가 30보다 작으면 할인율 20%
		rate = rate + 0.20;
	}
	else if (age >=30) { // age가 30과 같거나 크면 할인율은 15%
		rate = rate + 0.15;
	}
	switch (way) { //구매방법에 따라 할인율은 또 변하게됌  하나를 선택하기 위해 switch 문을 사용하며 break를 걸어서 조건문이합쳐서 계산 되는 것을 방지한다. 
	
	case "현장":
	   rate = rate + 0.00; // 현장은 0% 할인
	   break;
	   
	case "인터넷":
		rate = rate + 0.05; // 인터넷은 5% 할인
	   break;
	   
	case "쿠폰" :
	   rate =rate + 0.10; // 쿠폰은 10% 할인
	   break;
	   
	  
	}
	 
	}
	
	void moneyCal() { // Movie Main 에 생성자 메서드 호출에 쓰일 식  
		money = (int)(price - ( price* rate)); // 실제구매금액 = (강제데이터변환)(원래금액- (원래금액*할인율)
	}
	
	void titlePrint () { // 생성자 메서드 호출에 쓰일 식 
		String p = String.format("%s %14s %12s %18s","영화명","금액","나이","실구매금액"); //타이틀 간격, 영화명이들어갈자리 .. 금액..
		System.out.println(p); // 메인에 호출하기 위한 식 
	}
	
	
	

    void dataPrint() { // 생성자 메서드 호출에 쓰일 식 
    	System.err.println(movieName + "\t\t"+ price+"\t\t"+age+"\t\t"+money); // 호출에 쓰일 식을 프린터한 뒤 들어갈 위치  
    	System.out.println(); // 콘솔화면 영화면 금액 나이 실구매금액 띄우기 위해 TAB
    }
}


//메소드 
	//1. 할인율 ->void rateCal()
	//2. 실구매금액 ->void moneyCal()
	//3. 제목인쇄하기 ->void titlePrint()
	//4. 내용 출력하기 ->void dataPrint()

	

