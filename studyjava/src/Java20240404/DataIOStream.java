package Java20240404;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        File datafile = new File(FileObject.CURRENT + "/fileData.data");
        OutputStream os = new FileOutputStream(datafile);
        InputStream is = new FileInputStream(datafile);

        // 기존의 IO Stream 들은 바이트 단위로만 읽고 쓸 수 있는 반면,
        // DataInputStream/DataOutputStream 은 여러 원시자료형의 형태에 맞춰 읽고 쓸 수 있음
        DataOutputStream dos = new DataOutputStream(os);
        DataInputStream dis = new DataInputStream(is);

        dos.writeInt(35);
        dos.writeDouble(5.8);
        dos.writeChar('A');
        dos.writeUTF("안녕하세요");
        dos.flush();
        dos.close();

        // 읽기
        int a = dis.readInt();
        double b = dis.readDouble();
        char c = dis.readChar();
        String d = dis.readUTF();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        os.close();
        dos.close();
        is.close();
        dis.close();
    }
}
