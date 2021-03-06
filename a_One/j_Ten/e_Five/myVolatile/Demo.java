package a_One.j_Ten.e_Five.myVolatile;
/* 
### volatile解决

**以上案例出现的问题 :**
?	当A线程修改了共享数据时，B线程没有及时获取到最新的值，如果还在使用原先的值，就会出现问题 
?	1，堆内存是唯一的，每一个线程都有自己的线程栈。
?	2 ，每一个线程在使用堆里面变量的时候，都会先拷贝一份到变量的副本中。
?	3 ，在线程中，每一次使用是从变量的副本中获取的。
**Volatile关键字 :** 强制线程每次在使用的时候，都会看一下共享区域最新的值 */
public class Demo {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.setName("小路同学");
        t1.start();
        t2.setName("小刚同学");
        t2.start();
    }
}

