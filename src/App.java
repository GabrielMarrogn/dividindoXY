import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double divisao =0;

        for(int i = 0; i < a; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
               divisao = x/ y;
               System.out.printf("%.1f\n",divisao);
            }
        }

        sc.close();
    }
}
