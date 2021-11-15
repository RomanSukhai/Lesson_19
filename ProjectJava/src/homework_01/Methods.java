package homework_01;

import java.io.*;

public class Methods {
    public static String serialize(File file, String data) throws Exception{
        OutputStream os = new FileOutputStream(file);
        os.write(data.getBytes());
        InputStream oos = new FileInputStream(file);
        int inform = oos.read();
        char dates;
        StringBuffer str = new StringBuffer();
        while (inform != -1){
            dates = (char) inform;
            str.append(dates);
            inform = oos.read();
        }
        os.close();
        oos.close();
        return str.toString();
    }
    public static Serializable  deserealize(File file,Serializable object) throws IOException, ClassNotFoundException {
        OutputStream d = new FileOutputStream(file);
        ObjectOutputStream s = new ObjectOutputStream(d);
        s.writeObject(object);
        s.close();
        InputStream cd = new FileInputStream(file);
        ObjectInputStream qw = new ObjectInputStream(cd);
        Serializable ob = (Serializable) qw.readObject();
        return ob;
    }

}


