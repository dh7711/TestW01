package variable;

public class TestClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 형변환( type casting )
		 - 자료형을 변경하는 것
		 자동 형변환
		 - 자동으로 자료형의 형태를 변화시키는 것
		 강제 형변환
		 - 강제로 자료형을 변화시키는 것 (byte 크기가 작아서 형변환이 되지않을때)
		 */
		char ch = 'A';
		System.out.println(ch);
		
		int num = ch;//자동 형변환
		System.out.println( num );
		
		char ch02 = (char)num; //강제 형변환
		System.out.println( ch02 );
		
		double d = 1.11;
		float f = (float)1.11;
		float f1 = 1.11f;
		System.out.println(d);
		System.out.println(f);
		System.out.println(f1);
		
	}

}
