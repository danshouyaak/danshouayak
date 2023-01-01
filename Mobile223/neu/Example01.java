package Mobile223.neu;

import java.net.InetAddress;

public class Example01 {
    public static void main(String[] args) throws Exception{
        InetAddress inetAddress = InetAddress.getLocalHost();

        InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");

        System.out.println("本机的ip地址："+inetAddress.getHostAddress());
        System.out.println("itcast的IP地址："+remoteAddress.getHostAddress());
        System.out.println("3秒是否能到达："+inetAddress.isReachable(3));
        System.out.println("itcast的主机名为:"+remoteAddress.getHostName());
    }
}
