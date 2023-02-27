package config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ConfigManager {
    static private List<String> lines = null;

    static public List<String> readConfigFile() throws IOException{
        if(lines == null){
            lines = Files.readAllLines(Path.of("project.config"));
        }
        return lines;
    }

    
}
