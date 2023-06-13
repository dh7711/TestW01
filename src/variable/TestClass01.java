package variable;

public class TestClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 변수 - 데이터를 저장하기 위한 공간
 변수 이름 명명 규칙
 - 첫 문자는 소문자
 - 합성어의 첫 문자는 대문자로 생성
 - 예약어는 사용할 수 없음(ex. package,void, class 등등) 
 자료형
 - 정수 : short, int, long (2, 4byte)
 - 실수 : float,double (4, 8)
 - 문자 : byte, char (1, 2)
 - 논리형 : boolean (1). true or false 만 저장 
  */
	int age = 30;
	double weight = 55.0;
	double height = 170.3;
	System.out.println("나의 나이는 "+age+"살 입니다");
	System.out.println("나의 몸무게는 "+weight+"kg 입니다");
	System.out.println("나의 키는 "+height+"cm 입니다");
	}

}
