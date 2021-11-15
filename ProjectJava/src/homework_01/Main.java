package homework_01;

import java.io.File;
public class Main extends Methods{
    public static void main(String[] args) throws Exception {
        Employee object = new Employee("Vasul",34,2000);
        File file = new File("Object.txt");
        System.out.println(deserealize(file,object).toString());
        System.out.println(serialize(file,"wweqeqe"));
    }
}
