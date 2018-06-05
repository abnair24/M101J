package abn.mongo101j;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;

public class HWFreeMarkerStyle {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HWFreeMarkerStyle.class,"/");

        try {
            Template template = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
