package com.example.lyw.expressdelivery.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by LYW on 2017/3/7.
 */

public interface HttpResponse extends Header,Closeable {

     HttpStatus getStatus();
     String getStatusMsg();
     InputStream getBody() throws IOException;
     void close()throws IOException;
}
