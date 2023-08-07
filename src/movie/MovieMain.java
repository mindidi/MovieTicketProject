package movie;


/*1. 프로젝트명 : 영화 예매 하기(MovieTicketProject)
패키지명 : movie
2. 클래스명 : MovieMain.java -- main( )가 있는 경우(Movie.java--라이브러리클래스)
3. 생성자 초기값 넣기로 자료를 넣어 주세요. => 라이브러리클래스 (Movie.java)
  입력자료 : 영화명, 금액, 나이, 구매방법(현장, 인터넷, 쿠폰)
실구매금액조건 => swicth ~ case
     1) 나이가 20미만이면 25% 할인, 나이가 20~30이면 20%할인, 30이상이면 15%할인
     2) 현장구매인 경우 0%할인, 인터넷 구매인 경우 추가 5%할인, 쿠폰구매인 경우 10%할인
          예) 1째줄은 11000 * 70% = 7700
             2째줄은 15000 * (100%-20%) = 12000
             3째줄은 12500 * (100%-(15%+10%)) = 9375
4. 입력자료 -> Scanner 클래스를 main에 지정한다. 
1째 레코드(줄)==> 1917 11000 10 인터넷
2째 레코드(줄)==> 주디 1500025 현장
3째 레코드(줄)==> 인비저블맨 12500 40 쿠폰
*/


public class MovieMain { // 메인안에서 꼭 호출해야 함 

	public static void main(String[] args) {

	Movie m1 = new Movie ("1917",11000,10,"인터넷"); // Movie에 메소드를 정해놓은 호출식의 들어갈 내용
	Movie m2 = new Movie ("주디",15000,25, "현장");
	Movie m3 = new Movie ("인비저블맨",12500,40,"쿠폰");
	
	m1.titlePrint(); // 타이틀은 1개만 들어가므로 1개만 적어도됨 
	m1.ratecal(); // 할인율 (실제금액에 할인율이 들어가야됨으로 할인된 금액이 가장 먼저 들어가야 하기때문에 먼저 넣어야함!!  
	m1.moneyCal(); // 할인이 들어간 실제구매금액 
	m1.dataPrint(); // 생성자가 들어갈 위치를 만들어놓은 식 
	
	m2.ratecal();
	m2.moneyCal();
	m2.dataPrint();

	m3.ratecal();
	m3.moneyCal();
	m3.dataPrint();


	
	}
	
}
