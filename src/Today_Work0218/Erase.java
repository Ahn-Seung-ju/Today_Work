package Today_Work0218;

import java.io.File;
import java.util.Scanner;

public class Erase {
    static String defaultPath = "C:" + File.separator;
    static String path = defaultPath;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = null;

        while (true) {
            System.out.print(path + ">");
            input = sc.nextLine().split(" ");

            if (input[0].equalsIgnoreCase("exit")) {
                System.out.println(0);
                return;
            }
            if (!input[0].equals("")) {
                if (input[0].equalsIgnoreCase("erase")) {
                    deletFile(input);
                } else {
                    System.out.println("명령 구문이 올바르지 않습니다");

                }
            }

        }
    }

    static void deletFile(String[] input) {
        
        
        if (input.length != 2) {
            System.out.println("사용법: java[실행할 파일명] [경로명+파일명]");
            System.out.println("예시: java Erase C:\\Temp1\\new.txt");
            
        }else {
            File f = new File(input[1]);
            if (!f.exists() || !f.isFile()) {
                System.out.println("유효하지 않는 경로");
            }else {
                f.delete();
            }
            
        }
        
        
        
        

    }


}
