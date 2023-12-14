package learning.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        SettingsV5 settingsV5 = SettingsV5.getInstance();

        Constructor<SettingsV5> constructor = SettingsV5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsV5 settingsV5Copy = constructor.newInstance();

        System.out.println(settingsV5Copy == settingsV5);
    }
}
