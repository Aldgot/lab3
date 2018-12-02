package com.company;

public class Main {

    public static void ferm() {
        int prov;
        int n = 2;

        for(int c = 1; c < 100; ++c)
            for (int a = 1; a <= 10; ++a)
                for (int b = 1; b <= 10; ++b) {
                    prov = (int) (Math.pow(a, n) + Math.pow(b, n));
                    if (prov <= 100 && prov == Math.pow(c, n))
                        System.out.println(a + "^" + n + " + " + b + "^" + n + " = " + prov);
                }
    }

    public static void vichislenie () {
        double result = 0;
        for(double i = 1; i < 10000; ++i){
            if (i % 2 == 0)
                result -= 1/(i);
            else
                result += 1/(i);
        }
        System.out.print("\nРезультат выражения равен: " + result);
    }

    public static void main(String[] args) {
        ferm();
        vichislenie();
    }
}