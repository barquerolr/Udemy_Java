package com.company;

public class Main {


    public static void main(String[] args)
    {
        System.out.println("Hello World");
	 //write your code here
        char a = 'A';
        String aa = "This is just a test";
        int test = 2;
        double testing = 0.0;
        int t = 40;
        double docking = 99;
        int two = 0;
        int bbw = 0;
        System.out.println(a);
        System.out.println(aa);

        for(int i = 0; i < 10; i = i + 1)
        {
            test = test * 2;
            System.out.println(test);
            testing = (double)test * 2.2;
            System.out.println(testing);
        }

        while(t > 10)
        {
            docking = docking - 11;
            System.out.println(docking);
            if(docking == 33)
            {
                System.out.println("Emus are Emos");
            }

            else
            {
                System.out.println("GTA V is better than PAYDAY 2");
            }

            t = t - 5;
        }

        int points = 21;
        test(points);
        two = rrr(points);
        System.out.println("TWO: " + two);
        bbw = two * two;
        System.out.println("BBW: " + bbw);
        char game = (points > 20) ? 'W': 'L';
        System.out.println(game);
        char neg = (docking < 35) ? 'W' : 'R';
        System.out.println(neg);
        String n = (t > 15) ? "Squidward" : "Gooey";
        System.out.println(n);
    }

    public static void test(int x) {
        while (x > 5) {
            x = x - 3;
            System.out.println("Knock Knock " + x);

            switch (x) {
                case 18:
                    System.out.println("She legal");
                    break;

                case 15:
                    System.out.println("Stay away");
                    break;

                default:
                    System.out.println("She not legal");
                    break;
            }
        }
    }

    public static int rrr(int y)
    {
        int abs = 0;
        int bbc = 0;
        abs = (y * y) + (y * (int)(Math.sqrt(144)));
        System.out.println(abs);
        bbc = abs - 250;
        System.out.println(bbc);

        return bbc;
    }
}
