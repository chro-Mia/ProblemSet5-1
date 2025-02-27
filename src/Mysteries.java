public class Mysteries
{

    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n - 1);
            System.out.print(", " + n);
        }
    }
    public static void mystery2(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            System.out.print(n + ", ");
            mystery2(n / 2);
        }
    }


    public static void mystery3(int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            mystery3(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n - 1);
            System.out.print("]");
        }
    }

    public static int mystery4(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return mystery4(x - y, y);
        }
    }

    public static int mystery5(int n)
    {
        if(n < 0)
        {
            return -mystery5(-n);
        }
        else if (n < 10)
        {
            return n;
        }
        else
        {
            return n % 10 + mystery5(n / 10);
        }
    }
}