package util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "conf/mybatis-config.xml";
        InputStream stream = null;
        try {
        	stream = Resources.getResourceAsStream(resource);
//            byte[] buff = new byte[1024];
//            stream.read(buff);
            System.out.print("   stream.available:" + stream.available());
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}