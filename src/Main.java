import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Generics permitem que clases, infertaces e metodos possam ser parametrizados por tipo. Seus beneficios sao:
        //Reuso
        //Type safety
        //Perfomance
        //Uso comum: colecoes

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();;
        System.out.println("First: " + ps.first());

        sc.close();
    }
}