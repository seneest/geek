import java.util.Scanner;
public class  Main
{
    public static void main(String[] args)
    {

    var();

    float []ResInputCalculate=InputForCalculate();
    float eqres=calculate(ResInputCalculate[0], ResInputCalculate[1] ,ResInputCalculate[2] ,ResInputCalculate[3]);
        System.out.println("Результат вычисления "+eqres);

    int []ResInputBoolean=InputForBoolean();
    boolean bres=numbers(ResInputBoolean[0],ResInputBoolean[1]);
        System.out.println("Результат проверки: "+bres );

        sign(InputNum());
        System.out.println("Число отрицательно? "+boolsign(InputNum()));

        System.out.println("Привет, " +InputName()+"!");

        leapyear(InputYear());
    }

    public static float[] InputForCalculate() {
        Scanner in = new Scanner(System.in);
            System.out.println("Введите данные для расчёта выражения: a * (b+(c/d))");
            System.out.println("Введите десятичную дробь a");
        float a = in.nextFloat();
            System.out.println("Введите десятичную дробь b");
        float b = in.nextFloat();
            System.out.println("Введите десятичную дробь c");
        float c = in.nextFloat();
            System.out.println("Введите десятичную дробь d");
        float d = in.nextFloat();
            return new float[]{a, b, c, d};
    }

    public static int[] InputForBoolean() {
     Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа для проверки, что их сумма лежит в пределах от 10 до 20 ");
        System.out.println("Введите первое число");
     int firstnum = in.nextInt();
        System.out.println("Введите второе число");
     int secondnum = in.nextInt();

        return new int[]{firstnum, secondnum};
    }

    public static int InputNum() {
    Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки знака");
        return in.nextInt();
    }

    public static String InputName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        return in.nextLine();
    }

    public static int InputYear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        return in.nextInt();
    }
    public static float calculate(float a, float b, float c, float d)
{

    return a * (b+(c/d));
}
//данное задание выполнено с допущениями: края входят в данный промежуток!
    public static boolean numbers(int firstNum, int secondNum)
    {
        return (firstNum+secondNum>=10&&firstNum+secondNum<=20);
    }

    public static void sign (int numb)
    {
    if (numb>=0){
        System.out.println("Число "+numb+" положительное");
    }
    else {
        System.out.println("Число "+numb+" отрицательное");
        }
    }
    public static boolean boolsign (int numb)
    {
        return  (numb<0);
    }

    public static void leapyear (int year)
    {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
        System.out.println(year + " год не високосный");
        else System.out.println(year + "год високосный");
            }

    static void var() {
        boolean b = true;
        byte bt = 0;
        char c = 'p';
        short s = 364;
        int i = 195;
        long l = 963214L;
        float f = 9850.21f;
        double d = 324.568;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }
}