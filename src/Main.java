import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String myname = name.nextLine();
        System.out.println("Xin chào "+myname);

    }
}