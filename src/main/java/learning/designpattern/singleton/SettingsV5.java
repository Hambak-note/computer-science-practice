package learning.designpattern.singleton;

public class SettingsV5 {

    private SettingsV5() {}

    private static class SettingsHolder {
        private static final SettingsV5 SETTINGS_V_5 = new SettingsV5();

    }

    public static SettingsV5 getInstance() {
       return SettingsHolder.SETTINGS_V_5;
    }
}
