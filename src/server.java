import java.io.*;
import java.net.*;

// Hocam arkadasim olmadigi icin tek basima yaptim.
// Enes Caliskan 1621012036

public class server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5454); // port numarasi 5454 cunku Sakaryaliyim.
        Socket sr = ss.accept();
        FileInputStream fr = new FileInputStream("C:\\Enes\\enes.txt"); // gonderilecek dosya
        byte[] bytes = new byte[3000];

        fr.read(bytes, 0, bytes.length);

        OutputStream outputStream = sr.getOutputStream();
        outputStream.write(bytes, 0, bytes.length);

    }
}
