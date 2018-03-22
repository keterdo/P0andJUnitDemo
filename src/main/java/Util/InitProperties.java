package Util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by duzhe on 2018/3/22.
 *
 * @Description:
 */
public class InitProperties {

    public static final String PFILEPATH = "properties";
    public static final String TIMEKEY = "TestTimeStamp";
    public static final String MILITIMEKEY = "TestMiliTimeStamp";
    private static InputStream fis = null;
    private static Properties props = new Properties();
    public static Map<String, String> mapproperties = new HashMap<String, String>();


    public static void init() {
        try {
            fis = new BufferedInputStream(new FileInputStream(PFILEPATH));
            props.load(fis);
            if (!props.isEmpty()) {
                Set<Object> keys = props.keySet();
                for (Object key : keys) {
                    InitProperties.mapproperties.put(key.toString(),
                            props.getProperty(key.toString()));
                    if (!System.getProperties().containsKey(key.toString())
                            && !props.getProperty(key.toString()).isEmpty()) {
                        System.setProperty(key.toString(),
                                props.getProperty(key.toString()));
                    }
                }
                addTimeStampProperty();
                keys.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addTimeStampProperty() {
        Date d = new Date();
        // 如果未指定timestamp，则用系统当前时间戳
        String dt = props.getProperty("TMMPAgent.timestamp");
        if (dt == null || "".equals(dt))
            dt = new SimpleDateFormat("yyyyMMddHHmmss").format(d);

        InitProperties.mapproperties.put(TIMEKEY, dt);
        System.setProperty(TIMEKEY, dt);
        String mdt = String.valueOf(d.getTime());
        InitProperties.mapproperties.put(MILITIMEKEY, mdt);
        System.setProperty(MILITIMEKEY, mdt);
    }
}
