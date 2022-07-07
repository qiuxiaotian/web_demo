package org.apache;

import javax.servlet.Servlet;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author chenht
 * @date 2022/7/7
 */
public class Tomcat {

    public static void main (String[] args) throws Exception {
        System.out.println("请输入路径");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();


        FileReader reader = new FileReader("web_demo01/src/main/resources/web.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String className = pro.getProperty(path);
        Class clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Servlet servlet = (Servlet) obj;
        servlet.service();
    }
}
