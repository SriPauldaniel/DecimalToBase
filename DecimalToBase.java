import java.util.Scanner;
public class DecimalToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String result = "";
        while(n != 0) {
            result += n%m;
            n /= m;
        }
        String a = "";
        for(int i = result.length()-1;i>=0;i--) {
            a += String.valueOf(result.charAt(i));
        }
        
        System.out.println(a);
        sc.close();
    }
}