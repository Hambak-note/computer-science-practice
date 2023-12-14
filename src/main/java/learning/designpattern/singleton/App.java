package learning.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        SettingsV5 settingsV5 = SettingsV5.getInstance();
//
//        Constructor<SettingsV5> constructor = SettingsV5.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SettingsV5 settingsV5Copy = constructor.newInstance();
//
//        System.out.println(settingsV5Copy == settingsV5);

        SettingsV5 settingsV5 = SettingsV5.getInstance();
        SettingsV5 settingsV5Copy = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settingsV5);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settingsV5Copy = (SettingsV5) in.readObject();
        }
        System.out.println(settingsV5 == settingsV5Copy);
    }
}
