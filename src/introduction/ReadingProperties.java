package introduction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    public static void main(String[] args) throws IOException {

        String path = "/Users/eduenv/IdeaProjects/JavaTutorial/src/test.properties";

        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(path);

        prop.load(fs);
        System.out.println(prop.getProperty("class"));
        System.out.println(prop.getProperty("course"));

    }
}
