package at.guigu.springcloud.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author johnny
 * @Classname MainApp8401
 * @Description
 * @Date 2022/3/3 11:34 上午
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);

//        File file=new File("/Users/johnny/Downloads/111.docx");
//        byte[] buffer=null;
//        try {
//            FileInputStream fileInputStream=new FileInputStream(file);
//            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
//            byte[] bytes=new byte[1024];
//            int n;
//            while ((n= fileInputStream.read(bytes))!=-1){
//                byteArrayOutputStream.write(bytes,0,n);
//            }
//            fileInputStream.close();
//            byteArrayOutputStream.close();
//            buffer=byteArrayOutputStream.toByteArray();
//            System.out.println(buffer);
//        }catch (Exception e){
//
//        }
//        System.out.println(getsha(buffer));
//
//
//    }
//
//
//
//
//    public static String  getsha(byte[] filename ){
//        MessageDigest messageDigest;
//        String encdeStr="";
//        try {
//            messageDigest = MessageDigest.getInstance("SHA-256");
//            ByteArrayInputStream inputStream = new ByteArrayInputStream(filename);
//            byte[] buffer = new byte[1024];
//            int len =0;
//            while ((len=inputStream.read(buffer))>0){
//                messageDigest.update(buffer,0,len);
//            }
//            inputStream.close();
//            byte[] hash =messageDigest.digest();
//            encdeStr= Hex.encodeHexString(hash);
//        }catch (Exception e){
//
//        }
//        return encdeStr;
//    }

    }
}
