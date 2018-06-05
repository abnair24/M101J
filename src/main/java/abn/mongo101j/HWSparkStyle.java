package abn.mongo101j;

import static spark.Spark.get;

public class HWSparkStyle {

    public static void main(String[] args) {
        get("/",(req,res)->"Hello world");
    }

}
