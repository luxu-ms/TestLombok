package com.example.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.MultiHashMap;

public class TestMultiHashMap extends MultiHashMap {
    public TestMultiHashMap() {
        super();
    }

    public TestMultiHashMap(Map<Object, Collection> map){
        for (Map.Entry entry: map.entrySet()){
            Collection col1 = (Collection) entry.getValue();
            for(Iterator it2 = col1.iterator(); it2.hasNext();){
                super.put(entry.getKey(), it2.next());
            }
        }
    }
}
