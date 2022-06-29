public class CalcApp{

    public static int addition(int a, int b)
    {
        int c = a+b;
        return c;
    }

    public static int substraction(int a, int b)
    {
        int c;
        if(a>b)
        {
            c = a-b;
        }
        else
        {
            c=b-a;
        }
        return c;
    }

    public static double division(int a, int b)
    {
        double c;
        if(a>b)
        {
            c =(double)a/b;
        }
        else
        {
            c =(double)b/a;
        }
        return c;
    }

    public static int multiplication(int a, int b)
    {
        int c = a*b;
        return c;
    }

    public static double percentage(int a,int b,int c,int d)
    {
        double per = (a+b+c+d)/4.0;
        return per;
    }

    public static void main(String args[]){

        System.out.println("-----------------------------Sample program for Calculator-----------------------------");
        System.out.println("18 + 13 = "+addition(18,13));
        System.out.println("18 - 13 = "+substraction(18,13));
        System.out.println("18 / 13 = "+division(18,13));
        System.out.println("18 * 13 = "+multiplication(18,13));
        System.out.println("65,69,68,63, Percentage = "+percentage(65,69,68,63));
    }

}