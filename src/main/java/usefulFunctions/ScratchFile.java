package usefulFunctions;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ScratchFile {


    public void ScanNIC() throws SocketException {
        Enumeration<NetworkInterface> x = NetworkInterface.getNetworkInterfaces();
        for (int i = 0; x.hasMoreElements(); i++) {
            NetworkInterface tempNIC = x.nextElement();
            System.out.println(i + ":     " + tempNIC);

            Enumeration<InetAddress> nicAddresses = tempNIC.getInetAddresses();

            for (int j = 0; nicAddresses.hasMoreElements(); j++) {
                InetAddress tempAddress = nicAddresses.nextElement();
                System.out.println("         " +j  + ":     " + tempAddress);
            }
        }

    }

}
