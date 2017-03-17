package com.example.lyw.expressdelivery.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

/**
 * Created by LYW on 2017/3/7.
 */

public interface HttpRequest extends Header{
    HttpMethod getHttpMethod();
    URI getUri();
    OutputStream getBody() throws IOException;
    //这个是要干啥？
    HttpResponse execute() throws IOException;
}
