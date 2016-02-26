package com.yeapin.androidstudy.util;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Android客户端上传服务器工具类
 * Created by jiangjunjie on 16/2/26.
 */
public class HttpRequester {
    public static String post(String actionUrl,Map<String,String> params,File[] files){
        try {
            String BOUNDARY = "---------7d4a6d158c9";
            String MULTIPART_FROM_DATA = "multipart/form-data";
            URL url = new URL(actionUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setDoInput(true);//允许输入
            conn.setDoOutput(true);//允许输出
            conn.setUseCaches(false);//不允许使用cache
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Content-Type", MULTIPART_FROM_DATA + "; boundary=" + BOUNDARY);
            StringBuilder sb = new StringBuilder();
            for(Map.Entry<String,String> entry:params.entrySet()){
                sb.append("--");
                sb.append(BOUNDARY);
                sb.append("\r\n");
                sb.append("Content-Disposition:form-data;name=\""+entry.getKey()+"\"\r\n\r\n");
                sb.append(entry.getValue());
                sb.append("\r\n");
            }
            DataOutputStream outputStream = new DataOutputStream(conn.getOutputStream());
            outputStream.write(sb.toString().getBytes());
            for(File file:files){
                StringBuilder split = new StringBuilder();
                split.append("--");
                split.append(BOUNDARY);
                split.append("\r\n");
                split.append("Content-Disposition:form-data;name=\""+file.getName()+"\";filename=\""+file.getName()+"\r\n");
//                split.append("Content-Type:"+file.getContentType()+"\r\n\r\n");
                outputStream.write(split.toString().getBytes());
//                if(file.get){
//
//                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
