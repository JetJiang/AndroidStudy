package com.yeapin.androidstudy.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 输入流工具类
 * 从输入流获取数据并以字节数组返回
 * Created by jiangjunjie on 16/2/26.
 */
public class StreamTool {
    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len=inputStream.read(buffer))!=-1){
            outputStream.write(buffer,0,len);
        }
        outputStream.close();
        inputStream.close();
        return outputStream.toByteArray();
    }
}
