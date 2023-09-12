package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties prop = new Properties();
        try(InputStream resourseAsStream = TestMaven.class.getClassLoader()
                .getResourceAsStream("config.properties")){
            prop.load(Objects.requireNonNull(resourseAsStream));
        }
        catch (IOException e ){
            System.out.println("Unable to load properties file : " + "config.properties");
        }
        prop.get("props.local.hello");
        prop.get("props.mvn.hello");
        System.out.println(prop);

    }

}
