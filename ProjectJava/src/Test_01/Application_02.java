package Test_01;

import java.io.File;
import java.io.RandomAccessFile;

public class Application_02 {
    public static void main(String[] args) throws Exception {
        File file = new File("Lesore.txt");
        writerRandomAccess(file,"reqwrqrqrqrqrqrq",8);
        System.out.println(readerRandomAccess(file,1000,0));


    }
    public  static void writerRandomAccess(File file,String data,int position) throws Exception{
        RandomAccessFile ds = new RandomAccessFile(file,"rw");
        ds.seek(position);
        ds.write(data.getBytes());
        ds.close();
    }

    public static String readerRandomAccess(File file,int size,int position) throws Exception{
        RandomAccessFile ds = new RandomAccessFile(file,"rw");
        ds.seek(position);
        byte [] red = new byte[size];
         ds.read(red);
         ds.close();
        StringBuffer str = new StringBuffer();
        for (byte e: red) {
            str.append((char) e);
        }

        return str.toString();
    }
}
