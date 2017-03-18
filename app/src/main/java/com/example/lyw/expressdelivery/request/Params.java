package com.example.lyw.expressdelivery.request;

import android.support.annotation.NonNull;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LYW on 2017/3/18.
 */

public class Params implements Map<String,String> {
    private Map<String, String> mMap = new HashMap<>();


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
        return mMap.put(s, s2);
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
