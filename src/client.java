import java.io.*;
import java.net.*;



public class client {

    public static void main(String[] args) throws Exception {

        byte[] bytes = new byte[3000];

        Socket sr = new Socket("localhost", 5454);
        InputStream is = sr.getInputStream();
        FileOutputStream fr = new FileOutputStream("C:\\Enes\\alinantext.txt"); // client tarafindan olusturulacak dosya
        is.read(bytes, 0, bytes.length);

        fr.write(bytes, 0, bytes.length);

    }
}
