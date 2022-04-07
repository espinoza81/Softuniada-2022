import java.util.Scanner;

public class SumOfGCPAndLCM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        int gcp = 1;
        for(int i=1; i<=Math.min(n, m); i++){
            if(n%i==0 && m%i==0 && gcp<i) {
                gcp=i;
            }
        }
        int lcm;
        if(n==m){
            lcm=n;
        }
        else {
            int nTemp = n;
            int mTemp = m;
            while (true) {
                if(nTemp > mTemp) {
                  mTemp += m;
                }
                else if(nTemp < mTemp) {
                  nTemp +=n;
                }
                else {
                    lcm = nTemp;
                    break;
                }
            }
        }
        System.out.println(gcp+lcm);
    }
}
