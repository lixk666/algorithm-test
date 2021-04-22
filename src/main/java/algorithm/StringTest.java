package algorithm;

import org.apache.commons.lang3.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @ClassNameStringTest
 * @Author lixkvip@126.com
 * @Date2021/2/4 16:35
 * @Version V1.0
 **/
public class StringTest {
    public static void main(String[] args) {

//        String var1 = null;
//        String var2 = "";
//        String var3 = "   ";
//
//        System.out.println(StringUtils.isBlank(var1));
//        System.out.println(StringUtils.isBlank(var2));
//        System.out.println(StringUtils.isBlank(var3));



        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T':mm:ss.SSS");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMddmmss");


        String time = "20210101000000";

        try {

//            format1.setTimeZone(TimeZone.getTimeZone("UTC"));

            Date parse = format2.parse(time);
            String format = format1.format(parse);


            System.out.println(format);


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
