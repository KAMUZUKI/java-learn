package a_One.k_eleven.a_One.UDP.UDPCommunication;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReciveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(12345);
        while (true) {
            //创建一个数据包，用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);
            //解析数据包，并把数据在控制台显示
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println("数据是：" + str);
            if("886".equals(str)){
                ds.close();
            }
        }
        //关闭接收端
        
    }
        
}
