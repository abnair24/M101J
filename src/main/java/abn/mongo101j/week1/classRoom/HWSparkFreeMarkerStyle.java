package abn.mongo101j.week1.classRoom;



import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class HWSparkFreeMarkerStyle {

    public static void main(String[] args) {

        final Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HWSparkFreeMarkerStyle.class, "/");

        get("/", (req, res) -> {

            StringWriter writer = new StringWriter();
            try {
                Template template = configuration.getTemplate("hello.ftl");
                Map<String, Object> helloMap = new HashMap<>();
                helloMap.put("name", "Mongo");
                template.process(helloMap, writer);
                System.out.println(writer);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return writer;
        });
    }
}

