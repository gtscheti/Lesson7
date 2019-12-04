package lesson7;

import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
	// write your code here
        PluginManager pm = new PluginManager("E:\\Users\\Gena\\Documents\\Work\\JavaSchool\\Projects\\Lesson6\\out\\production\\untitled104\\lesson6\\");
        pm.load("Cat", "Cat.class");
    }
}
