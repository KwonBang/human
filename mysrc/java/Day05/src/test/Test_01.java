package test;

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*가. 키보드로 숫자를 5개를 입력 받아 이를 배열에 저장하고 출력하는 프로그램을 작성하시오
		   단, 입력부와 출력부를 나눠서 작성한다.*/
		Scanner in = new Scanner(System.in);	//키보드로 입력받기
		int input;	//키보드로 입력받은 데이터 저장공간으로 사용할 변수
		int[] a = new int[5];	//5개의 숫자를 저장할 배열생성
		for(int i = 0;i<5;i++) {	//입력받고 저장할 횟수 0부터 4까지 5회반복
			input = in.nextInt();	//입력받은값을 변수에 저장
			in.nextLine();	//남아있는 엔터 제거
			a[i]=input;	//반복문 초기값을 0으로 선언 i는 0~4까지 반복 a배열인덱스로 활용 입력받은 값 저장
		}
		for(int i = 0;i<5;i++) {	//출력부 i는 0부터 4까지 증가 5회반복
			System.out.println(a[i]);	//i를 a배열의 인덱스로 활용 출력후 줄바꿈 반복 4
		}
		System.out.println("------------------------------");
		/*나. 배열에서 짝수는 바이러스이다 바이러스를 모두 0으로 바꾸시오.*/
		int[][] b = {{32,23,12,23,23},	//b[0][0]/b[0][1]/b[0][2]/b[0][3]/b[0][4]
					{31,32,1,23,24},	//b[1][0]/b[1][1]/b[1][2]/b[1][3]/b[1][4]
					{35,22,12,21,21},	//b[2][0]/b[2][1]/b[2][2]/b[2][3]/b[2][4]
					{32,22,11,22,22},	//b[3][0]/b[3][1]/b[3][2]/b[3][3]/b[3][4]
					{22,22,145,22,23}	//b[4][0]/b[4][1]/b[4][2]/b[4][3]/b[4][4]
		};
		for(int i = 0;i<5;i++) {	//2차원배열의 모든 값을 확인하기위해 이중for문사용 행과열이 5로 동일 
			for(int j = 0;j<5;j++) {	//5회반복을 초기값0으로 선언 반복조건은 0~4 i와j를 인덱스로 활용 
				if(b[i][j]%2==0) {	//b[0][0]부터시작 만약값을 2로나누고 나머지값이 0일경우
					b[i][j]=0;		//짝수이기 때문에 0을 저장
				}
			}
		}
		for(int i = 0;i<5;i++) {	//2차원배열의 모든 값을 출력하기위해 이중for문사용 행과열이 5로 동일
			for(int j = 0;j<5;j++) {	//i가 0일때 j는 01234반복 i는 0~4까지증가 i와j를 인덱스로 활용
				System.out.print(b[i][j]+"/"); //i가 0일때 j는 01234반복 출력후 줄바꾸지 않음
			}
			System.out.println();	//안쪽반복문이 끝나면 줄바꿈
		}
		System.out.println("------------------------------");
		/*다. 위 배열에서 20보다 큰수 모두 몇개인가?*/
		int[][] c = {{32,23,12,23,23},
					{31,32,1,23,24},
					{35,22,12,21,21},
					{32,22,11,22,22},
					{22,22,145,22,23}
		};
		int cnt = 0;	//20보다 큰수의 갯수를 확인할 용도의 변수 초기값 0 선언
		for(int i = 0;i<5;i++) {	//2차원배열의 모든 값을 확인하기위해 이중for문사용 행과열이 5로 동일
			for(int j = 0;j<5;j++) {	//행과열이 5로 동일하기때문에 조건은 동일
				if(c[i][j]>20) {	//c[0][0]부터시작 만약값이 20이상일경우 갯수확인을 할변수의 값 1증가
					cnt++;
				}
			}
		}
		System.out.println(cnt);	//반복문종료후 20이상의 값 갯수를 확인할 변수 출력후 줄바꿈
		System.out.println("------------------------------");
		/*라. 
		1부터 9999까지 숫자를 모두 더하시오.
		더하는 방법은  99인 경우 9+9를 더하고,   875일 경우는 8+7+5를 더한다
		이와 같은 방식으로 1부터 9999까지 모든 자릿수를 더한 결과를 출력하시오.
		int sum=0; 를 선언하고 for문 2개만써서 해결한다.
		추가 변수 선언 안됨. 1부터 99999까지도 정상 동작해야 한다. */
		int sum=0;
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}
}
