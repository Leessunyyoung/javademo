package java022_debug;
/*
 *bug : 어떤 의도하지 않는 문제가 발생한 오류
 *debug : bug를 찾아 수정하는 작업
 *debugging : bug를 원하는 대로 실행이 되도록 작업하는 과정
 *debugger : debugging을 할때 사용하는 도구
 *
 *디버깅 종류
 *1. 출력문을 이용한 디버깅
 *2. 디버깅 툴을 이용한 디버깅
 */
public class DebugTest01 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0; i<5;i++) {
			System.out.printf("i=%d\n",i);//Blackpoint properties Hitcount ->반복문실행하는 횟수
											//conditional ->i인덱스값이 x번일때 ex)for(int=0; i<3 ;i++)
			sum= sum + count(i);
		}
		System.out.printf("sum=%d\n",sum);

	}//end main()
	public static int count(int index) {
		int[] num = new int[] {1, 5, 2, 3, 4};
		return num[index];
	}

}
