package Today_Work0208;

import java.util.Scanner;

class CheckJumin {

    // 주민 번호 입력받는다
    // 입력받은 주민번호를 배열에 넣는다
    // 입력받은 주민번호에서 "-"앞과 뒤에 자릿수를 판단 true >> 계속 false >> 다시 입려받는다.
    // 2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수 return true, false
    // 3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력

    static String userNum;
    static Scanner scanner = new Scanner(System.in);
    int position;
    static int jumin;
    static int genderNum;
    static String juminarr[];

    static boolean CheckJ() {
        System.out.print("주민 번호 입력(000000-0000000): ");
        userNum = scanner.nextLine();
        
        
        

        if (userNum.indexOf("-") == -1) {
            System.out.println("-을 넣으세요");
            return false;
        } else if (userNum.length() != 14) {
            System.out.println("잘못입력하셨습니다.");
            return false;
        } else if (userNum.indexOf("-") != 6) {
            System.out.println("앞자리6자리 - 뒷자리 7자리를 입력하세요");
            return false;
        }
        return true;
    }

    static boolean AllowableRange() {
        int backNum = Integer.parseInt(userNum.substring(7, 8));
        if (backNum >= 1 && backNum <= 4) {
            genderNum = backNum;
            return true;
        } else {
            System.out.println("주민번호 2번째 자리에 1~4만 넣으시오");
            return false;
        }
    }

    static void gender() {
        if (genderNum == 1 || genderNum == 3) {
            System.out.println("남성입니다.");
        } else if (genderNum == 2 || genderNum == 4) {
            System.out.println("여성입니다.");
        }
    }
}

public class Jumin {
    public static void main(String[] args) {

        if (CheckJumin.CheckJ()) {
            if (CheckJumin.AllowableRange()) {
                CheckJumin.gender();

            }
        }

        
    }

}
