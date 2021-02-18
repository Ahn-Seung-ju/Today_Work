package Today_Work0218;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto0218 {

    private int count;

    Lotto0218() {
        lottoRun();
    }

    public void lottoRun() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*1. 당첨 예상 번호 추출하기(저장까지)*");
            System.out.println("*2. 프로그램 종료^^! ^^*");
            System.out.println("3. 파일 읽기");
            System.out.println("*******************************");
            int usernum = scanner.nextInt();
            switch (usernum) {
            case 1:
                lottochuchul();
                break;
            case 2:
                System.out.println("종료");
                return;
            case 3:
                lottoilgi();
                break;
            default:
                System.out.println("1-3만 입력하세요");
                break;
            }

        }

    }

    public void lottochuchul() {
        Set<Integer> lottochuchulgi = new TreeSet<Integer>();
        for (int i = 0; lottochuchulgi.size() < 6; i++) {
            lottochuchulgi.add((int) (Math.random() * 45 + 1));
        }
        System.out.println(++count + "회차 로또 번호");
        System.out.println(lottochuchulgi.toString());

        write(lottochuchulgi);
    }

    public void write(Set<Integer> lottochuchulgi) {
        // try-with-resource
        // Autocloseable이란 인터페이스의 close()라는 함수가 구현되어 있어야 사용할 수 있다.
        // try 안에 선언 new 객체
        try (FileWriter fw = new FileWriter("Lotto.txt", true); 
                BufferedWriter bw = new BufferedWriter(fw);) {

            String str = manghanneunnal();

            bw.write(count + "회차 로또 번호" + "\r");
            bw.write(lottochuchulgi.toString() + "\r");
            bw.write(str + "\r\r");

        } catch (Exception e) {
            // TODO: handle exception
        }

        /*
         * FileWriter fw = null; BufferedWriter bw = null; try { fw = new
         * FileWriter("Lotto.txt"); bw = new BufferedWriter(fw); } catch (Exception e) {
         * // TODO: handle exception }finally { try { fw.close(); bw.close(); } catch
         * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
         * 
         * }
         */
    }

    public String manghanneunnal() {
        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy년MM월dd일HH:mm:ss");
        String sdfat = sdfdate.format(Calendar.getInstance().getTime());

        return sdfat;

    }

    public void lottoilgi() {
        try (FileReader fr = new FileReader("Lotto.txt"); 
                BufferedReader br = new BufferedReader(fr);) {

            String line = "";
            for (int i = 0; (line = br.readLine()) != null; i++) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
