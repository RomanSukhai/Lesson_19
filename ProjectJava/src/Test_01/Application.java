package Test_01;

import java.io.*;


public class Application                                                                    {

    public static void main(String[] args) throws Exception                                 {
        File file = new File("Text.txt")                                            ;
        writerUsingOS(file,"Hello World")                                               ;
        System.out.println(readUsingOS(file))                                                                 ;
    }

    public static void writerUsingOS(File file,String data) throws Exception                {
        OutputStream os = new FileOutputStream(file);
        os.write(data.getBytes())                                                           ;
        os.close()                                                                          ;
    }
    public static String readUsingOS(File file) throws Exception                            {
        InputStream os = new FileInputStream(file)                                          ;
        int inform = os.read()                                                              ;
        char data                                                                           ;
        StringBuffer str = new StringBuffer()                                               ;
        while (inform != -1)                                                                {
            data = (char) inform;
            str.append(data);
            inform = os.read();
                                                                                            }
        os.close();
        return str.toString();
    }
}


