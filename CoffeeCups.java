import java.util.Locale;
import java.util.Scanner;

public class CoffeeCups {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String text = console.nextLine();
        int m = 3;
        String forFirstPart = "~";
        String forLineSecondPart = "=";
        String forEndLine = "-";
        String forThirdPart = "@";
        firstPart(n, m, forFirstPart);
        secondPartLine(n, forLineSecondPart);
        secondPart(n, text, forFirstPart);
        secondPartLine(n, forLineSecondPart);
        thirdPart(n, forThirdPart);
        secondPartLine(n, forEndLine);
    }

    private static void thirdPart(int n, String forThirdPart) {
        for(int i=0; i<n; i++){
            String line = " ".repeat(i) +
                    "\\" +
                    forThirdPart.repeat(2 * n + 4 - 2 * i) +
                    "/";
            System.out.println(line);
        }
    }

    private static void secondPartLine(int n, String forLineSecondPart) {
        String line = forLineSecondPart.repeat(n * 3 + 5);
        System.out.println(line);
    }

    private static void secondPart(int n, String text, String forFirstPart) {
        for (int i=0; i<n-2; i++){
            StringBuilder line = new StringBuilder();
            line.append("|");
            if(i==(n-2)/2) {
                line.append(forFirstPart.repeat((2*n+4-text.length())/2));
                line.append(text);
                line.append(forFirstPart.repeat((2*n+4-text.length())/2));
            }
            else {
                line.append(forFirstPart.repeat(2*n+4));
            }
            line.append("|");
            line.append(" ".repeat(n-1));
            line.append("|");
            System.out.println(line);
        }
    }

    private static void firstPart(int n, int m, String forFirstPart) {
        for(int i =  0; i<n; i++) {
            String line = " ".repeat(n) +
                    (forFirstPart + " ").repeat(Math.max(0, m));
            System.out.println(line);
        }
    }

    // For oldest versions
//    private static void thirdPart(int n, String forThirdPart) {
//        for(int i=0; i<n; i++){
//            StringBuilder line = new StringBuilder();
//            for(int j=0; j<i; j++) {
//                line.append(" ");
//            }
//            line.append("\\");
//            for(int j=0; j<2 * n + 4 - 2 * i; j++) {
//                line.append(forThirdPart);
//            }
//            line.append("/");
//            System.out.println(line);
//        }
//    }
//
//    private static void secondPartLine(int n, String forLineSecondPart) {
//        StringBuilder line = new StringBuilder();
//        for(int j=0; j<n * 3 + 5; j++) {
//            line.append(forLineSecondPart);
//        }
//        System.out.println(line);
//    }
//
//    private static void secondPart(int n, String text, String forFirstPart) {
//        for (int i=0; i<n-2; i++){
//            StringBuilder line = new StringBuilder();
//            line.append("|");
//            if(i==(n-2)/2) {
//                for(int j=0; j<(2*n+4-text.length())/2; j++) {
//                    line.append(forFirstPart);
//                }
//                line.append(text.toUpperCase(Locale.ROOT));
//                for(int j=0; j<(2*n+4-text.length())/2; j++) {
//                    line.append(forFirstPart);
//                }
//            }
//            else {
//                for(int j=0; j<2*n+4; j++) {
//                    line.append(forFirstPart);
//                }
//            }
//            line.append("|");
//            for(int j=0; j<n-1; j++) {
//                line.append(" ");
//            }
//            line.append("|");
//            System.out.println(line);
//        }
//    }
//
//    private static void firstPart(int n, int m, String forFirstPart) {
//        for(int i =  0; i<n; i++) {
//            StringBuilder line = new StringBuilder();
//            for(int j=0; j<n; j++) {
//                line.append(" ");
//            }
//            for(int j=0; j<m-1; j++) {
//                line.append(forFirstPart).append(" ");
//            }
//            line.append(forFirstPart);
//            System.out.println(line);
//        }
//    }
//}
}
