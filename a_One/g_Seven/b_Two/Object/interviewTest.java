package a_One.g_Seven.b_Two.Object;
// String s = “abc”;
// StringBuilder sb = new StringBuilder(“abc”);
// s.equals(sb); 
// sb.equals(s); 

public class interviewTest {
    public static void main(String[] args) {
        // String s1 = "abc";
        // StringBuilder sb = new StringBuilder("abc");
        // //1.此时调用的是String类中的equals方法.
        // //保证参数也是字符串,否则不会比较属性值而直接返回false
        // System.out.println(s1.equals(sb)); // false

        // //StringBuilder类中是没有重写equals方法,用的就是Object类中的.
        // System.out.println(sb.equals(s1)); // false
    }
}