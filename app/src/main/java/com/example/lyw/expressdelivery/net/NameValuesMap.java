package com.example.lyw.expressdelivery.net;

import java.util.Map;

/**
 * Created by LYW on 2017/3/7.
 */
public interface NameValuesMap<K,V> extends Map<K,V> {
          public String get(String key);
          void set(String key, String values);
          void setAll(Map<String, String> map);

}
