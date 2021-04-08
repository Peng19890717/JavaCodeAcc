package dome;

import javax.net.ssl.HttpsURLConnection;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpDownloaderPDF {
    //pdf文件请求地址
    String remoteFileUrl = "";
    //本地存放pdf文件路径
    String localFilePath = "";

    public static  void httpDownloader(String remoteFileUrl, String localFilePath) {
        try {
            URL url = new URL(remoteFileUrl);
            // 5000 自定义连接超时毫秒数
            HttpURLConnection httpURLConnection = (HttpsURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5 * 1000);
            httpURLConnection.connect(); // 连接
            System.out.println("connect URL success!");

            int fileLenght = httpURLConnection.getContentLength();
            System.out.println("file size：" + (fileLenght / 1024.0) + " KB");

            System.out.println("start the download...");
            try (DataInputStream dis = new DataInputStream(
                    httpURLConnection.getInputStream());
                 FileOutputStream fos = new FileOutputStream(localFilePath)) {
                // 根据实际情况自定义 buf 大小
                byte[] buf = new byte[10240];
                for (int readSize; (readSize = dis.read(buf)) > 0;) {
                    fos.write(buf, 0, readSize);
                }
                System.out.println("download is complete!");
            } catch (IOException ex) {
                System.out.println("download is error");
            }

            httpURLConnection.disconnect();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("URL Does not exist or connection timeout!");
        }
    }



    public static void main(String[] args) {

        Map<String,String> ll = new HashMap<>();
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17106329&app-key=okash-pay" , "17106329");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17580816&app-key=okash-pay"  ,"17580816");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17606130&app-key=okash-pay"  ,"17606130");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17607006&app-key=okash-pay"  ,"17607006");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17607605&app-key=okash-pay"  ,"17607605");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17608433&app-key=okash-pay"  ,"17608433");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17608521&app-key=okash-pay"  ,"17608521");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17608636&app-key=okash-pay"  ,"17608636");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17609528&app-key=okash-pay"  ,"17609528");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17609780&app-key=okash-pay"  ,"17609780");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17612348&app-key=okash-pay"  ,"17612348");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17612426&app-key=okash-pay"  ,"17612426");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17612432&app-key=okash-pay"  ,"17612432");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17614042&app-key=okash-pay"  ,"17614042");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17614113&app-key=okash-pay"  ,"17614113");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17615071&app-key=okash-pay"  ,"17615071");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17616291&app-key=okash-pay"  ,"17616291");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17616854&app-key=okash-pay"  ,"17616854");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17617528&app-key=okash-pay"  ,"17617528");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17618468&app-key=okash-pay"  ,"17618468");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17618577&app-key=okash-pay"  ,"17618577");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17620145&app-key=okash-pay"  ,"17620145");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17620337&app-key=okash-pay"  ,"17620337");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17622678&app-key=okash-pay"  ,"17622678");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17622828&app-key=okash-pay"  ,"17622828");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17622840&app-key=okash-pay"  ,"17622840");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17623721&app-key=okash-pay"  ,"17623721");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17624146&app-key=okash-pay"  ,"17624146");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17624286&app-key=okash-pay"  ,"17624286");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17624593&app-key=okash-pay"  ,"17624593");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17625916&app-key=okash-pay"  ,"17625916");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17626705&app-key=okash-pay"  ,"17626705");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17628372&app-key=okash-pay"  ,"17628372");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17628571&app-key=okash-pay"  ,"17628571");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17629042&app-key=okash-pay"  ,"17629042");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17629083&app-key=okash-pay"  ,"17629083");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17629700&app-key=okash-pay"  ,"17629700");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17630016&app-key=okash-pay"  ,"17630016");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17630727&app-key=okash-pay"  ,"17630727");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17634015&app-key=okash-pay"  ,"17634015");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17634238&app-key=okash-pay"  ,"17634238");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17634439&app-key=okash-pay"  ,"17634439");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17634809&app-key=okash-pay"  ,"17634809");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17636028&app-key=okash-pay"  ,"17636028");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17637780&app-key=okash-pay"  ,"17637780");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17638147&app-key=okash-pay"  ,"17638147");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17638389&app-key=okash-pay"  ,"17638389");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17638394&app-key=okash-pay"  ,"17638394");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17638826&app-key=okash-pay"  ,"17638826");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17643948&app-key=okash-pay"  ,"17643948");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17644474&app-key=okash-pay"  ,"17644474");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17644779&app-key=okash-pay"  ,"17644779");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17646685&app-key=okash-pay"  ,"17646685");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17646753&app-key=okash-pay"  ,"17646753");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17648157&app-key=okash-pay"  ,"17648157");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17648384&app-key=okash-pay"  ,"17648384");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17649634&app-key=okash-pay"  ,"17649634");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17650766&app-key=okash-pay"  ,"17650766");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17651091&app-key=okash-pay"  ,"17651091");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17652999&app-key=okash-pay"  ,"17652999");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17654017&app-key=okash-pay"  ,"17654017");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17654182&app-key=okash-pay"  ,"17654182");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17654795&app-key=okash-pay"  ,"17654795");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17654884&app-key=okash-pay"  ,"17654884");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17655039&app-key=okash-pay"  ,"17655039");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17655611&app-key=okash-pay"  ,"17655611");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17656431&app-key=okash-pay"  ,"17656431");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17656475&app-key=okash-pay"  ,"17656475");
        ll.put("https://service.ke.o-kash.com/api/user/contract/v1/info?applyId=17658839&app-key=okash-pay"  ,"17658839");

        for (Map.Entry<String, String> entry : ll.entrySet()) {

            httpDownloader(entry.getKey(), "F:/doc/okash_contract/"+entry.getValue()+".pdf");

        }


    }




}

