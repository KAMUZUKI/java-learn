package a_One.g_Seven.b_Two.MyInteger;

public class MyIntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value)������ int ֵ���� Integer ����(��ʱ)
        // Integer i1 = new Integer(100);
        // System.out.println(i1);

        //public Integer(String s)������ String ֵ���� Integer ����(��ʱ)
        // Integer i2 = new Integer("100");
        // Integer i2 = new Integer("abc"); //NumberFormatException
        // System.out.println(i2);
        // System.out.println("--------");

        //public static Integer valueOf(int i)�����ر�ʾָ���� int ֵ�� Integer ʵ��
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        //public static Integer valueOf(String s)������һ������ָ��ֵ��Integer���� String
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);
    }
}