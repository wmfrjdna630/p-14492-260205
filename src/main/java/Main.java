import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lab2();
    }

    public static void lab2() {

        PrintStream ORIGINAL_OUT = System.out; // 원래는 모니터로 나감.

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream); // 내가 만든 스트림으로 통로 변경시킴.

        System.setOut(printStream); // 모니터에서 배열로 통로 변경

        System.out.println("hihi");
        System.out.println("byebye");
        System.out.println("okok");

        System.setOut(ORIGINAL_OUT); // 모니터로 출력 복원
        String result = byteArrayOutputStream.toString(); // 배열에 저장하고 있던 것을 반환

        if(result.equals("1번 명언이 등록되었습니다.")) {
            System.out.println(result);
        }

    }

    public static void lab1(){
        Scanner scan = new Scanner("""
                등록
                과거에 집착하지 마라.
                작자미상
                """);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
