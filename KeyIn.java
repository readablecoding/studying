import java.util.Scanner; // Scanner가 있는 외부 라이브러리 위치에서 가져오겠다.

class KeyIn 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    //Scanner 객체를 생성, System.in은 키보드 입력 받음, in은 main 메소드 변수이름
	    int a, b, c; // 변수 3개 생성

		System.out.print("정수 입력 : " ); // 사용자에게 메시지를 보여줌
		a = in.nextInt();       // nextInt는 int형 정수를 입력받게끔 해줌
		System.out.print("정수 입력 : " );
		b = in.nextInt();

		c = a + b;
		System.out.println(c); // 결과 출력
	}
}
