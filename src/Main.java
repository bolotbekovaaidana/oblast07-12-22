import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        t(a);
    }
    public static void t(int a){
        switch (a){
            case 1:
                System.out.println(Olast.BATKEN.i);
                break;
            case 2:
                System.out.println(Olast.CHUI.i);
                break;
            case 3:
                System.out.println(Olast.OSH.i);
                break;
            case 4:
                System.out.println(Olast.TALAS.i);
                break;
            case 5:
                System.out.println(Olast.YSYKKOL.i);
                break;
            case 6:
                System.out.println(Olast.JALALABAD.i);
                break;
            case 7:
                System.out.println(Olast.NARYN.i);
                break;
        }
    }
}