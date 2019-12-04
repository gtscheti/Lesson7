package lesson7;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginManager {
    private final String pluginRootDirectory;

    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) throws MalformedURLException, ClassNotFoundException {
        //todo
        Plugin l = new Plugin(pluginName, pluginClassName);
        System.out.println(pluginRootDirectory);
        File file = new File(pluginRootDirectory+pluginClassName);
        try {
                URL url = file.toURI().toURL();
                System.out.println(url);
                URL[] urls = new URL[]{url};
                System.out.println(urls.length);
                ClassLoader cl = new URLClassLoader(urls);
                Class cls = cl.loadClass(pluginName);
            }
        catch (ClassNotFoundException e) {
                System.out.println("CNFE");
                e.printStackTrace();
            }
        catch (MalformedURLException e) {
                e.printStackTrace();
            }

        return l;
    }

class Plugin implements lesson7.Plugin{
    String name;
    String clas;
    Plugin(String name, String clas) {
        this.name = name;
        this.clas = clas;
    }

    public void doUseful() {
        System.out.println("TEST");
    }
}
}
