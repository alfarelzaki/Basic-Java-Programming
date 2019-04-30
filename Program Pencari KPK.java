import java.util.Scanner;

public class cariKPK{
    public static void main(String[]a){
        Scanner namascanner = new Scanner(System.in);

        int a = namascanner.nextInt();
        int b = namascanner.nextInt();

        int c, d;

        c=a;
        d=b;

        while (c!=d){
            if (c>d){
                d = d+b;
            } else {
                c = c+a;
            }
        }

        System.out.println(c);
    }
}