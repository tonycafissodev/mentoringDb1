import java.util.List;

import config.ConfigManager;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<String> lines = ConfigManager.readConfigFile();
        List<String> lines2 = ConfigManager.readConfigFile();

        System.out.println(String.join("\n", lines));
        System.out.printf("Lines == Lines2: %b", lines == lines2);
    }
}
