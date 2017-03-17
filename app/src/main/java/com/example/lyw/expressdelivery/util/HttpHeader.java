package com.example.lyw.expressdelivery.util;

import android.support.annotation.NonNull;

import com.example.lyw.expressdelivery.net.NameValuesMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LYW on 2017/3/7.
 */

public class HttpHeader implements NameValuesMap<String,String> {

    private Map<String,String> mMap = new HashMap<>();
    public final static String ACCEPT = "Accept";
    public final static String PRAGMA = "Pragma";
    public final static String PROXY_CONNECTION = "Proxy-Connection";
    public final static String USER_AGENT = "User-Agent";
    public final static String ACCEPT_ENCODING = "accept-encoding";
    public final static String CACHE_CONTROL = "Cache-Control";
    public final static String CONTENT_ENCODING = "Content-Encoding";
    public final static String CONNECTION = "Connection";
    public final static String CONTENT_LENGTH = "Content-length";

    public static final String CONTENT_TYPE = "Content-Type";

    public String getAccept(){
         return get(ACCEPT);
    }
    public void setAccept(String key, String values){
           set(ACCEPT,values);
    }

    public String getPragma(){
        return get(PRAGMA);
    }
    public void setPragma(String key, String values){
        set(PRAGMA,values);
    }
    public String getProxyConnection(){
        return get(PROXY_CONNECTION);
    }
    public void setProxyConnection(String key, String values){
        set(PROXY_CONNECTION,values);
    }
    public String getUserAgent(){
        return get(USER_AGENT);
    }
    public void setUserAgent(String key, String values){
        set(USER_AGENT,values);
    }
    public String getAcceptEncoding(){
        return get(ACCEPT_ENCODING);
    }
    public void setAcceptEncoding(String key, String values){
        set(ACCEPT_ENCODING,values);
    }
    public String getCacheControl(){
        return get(CACHE_CONTROL);
    }
    public void setCacheControl(String key, String values){
        set(CACHE_CONTROL,values);
    }
    public String getContentEncoding(){
        return get(CONTENT_ENCODING);
    }
    public void setContentEncoding(String key, String values){
        set(CONTENT_ENCODING,values);
    }
    public String getConnection(){
        return get(CONNECTION);
    }
    public void setConnection(String key, String values){
        set(CONNECTION,values);
    }
    public String getContentType(){
        return get(CONTENT_TYPE);
    }
    public void setContentType(String key, String values){
        set(CONTENT_TYPE,values);
    }
    public String getContentLength(){
        return get(CONTENT_LENGTH);
    }
    public void setContentLength(String key, String values){
        set(CONTENT_LENGTH,values);
    }

    @Override
    public String get(String key) {
        return mMap.get(key);
    }

    @Override
    public void set(String key, String values) {
           mMap.put(key,values);
    }

    @Override
    public void setAll(Map<String, String> map) {
             mMap.putAll(map);
    }

    @Override
    public int size() {
        return mMap.size();
    }

    @Override
    public boolean isEmpty() {
        return mMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return mMap.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return mMap.containsValue(o);
    }

    @Override
    public String get(Object o) {
        return mMap.get(o);
    }

    @Override
    public String put(String s, String s2) {
        return mMap.put(s,s2);
    }

    @Override
    public String remove(Object o) {
        return mMap.remove(o);
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> map) {
            mMap.putAll(map);
    }

    @Override
    public void clear() {
            mMap.clear();
    }

    @NonNull
    @Override
    public Set<String> keySet() {
        return mMap.keySet();
    }

    @NonNull
    @Override
    public Collection<String> values() {
        return mMap.values();
    }

    @NonNull
    @Override
    public Set<Map.Entry<String, String>> entrySet() {
        return mMap.entrySet();
    }
}
