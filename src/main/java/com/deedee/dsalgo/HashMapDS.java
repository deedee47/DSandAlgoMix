package com.deedee.dsalgo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDS {

    //Hash Table ImplementationsImplementations

    public Map<Integer,String> aboutHashMaps()
    {
        Map<Integer, String> sample = new HashMap<Integer, String>();
        sample.put(1, "Hello"); //add items in the map
        sample.put(2, "Hi");
        sample.put(3, "Shoot");

        //In order to check for duplicate keys, the putifabsent method only inserts data if there's no existing key
        sample.putIfAbsent(4,"Dee");
        sample.putIfAbsent(2, "Zero");

        //Retrieve data
        System.out.println("Get item with Key 2 : " + sample.get(2));
        System.out.println("Get item with Key 2 : " + sample.get(8)); //non existent, returns null

        //to override the null value of non existing data, you can specify a default
        System.out.println("Get item with Key 2 : " + sample.getOrDefault(9, ""));

        //print items in the hashmap. Iteration could happen using the list of Keys or Values
        //print all values
        Iterator iterator = sample.values().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next() + " ");
        }

        //print using keys
        for(int key : sample.keySet())
        {
            System.out.println("Found Key " + key + " , Value " + sample.get(key));
        }
        //implementation 2
        sample.forEach((k,v) -> System.out.println( "here is key " + k + " with value " + v));

        //Contains Key or Value
        System.out.println("Contains key 1: " + sample.containsKey(1));
        System.out.println("Contains Value Heeey: " + sample.containsKey("Heey"));

        System.out.println(" " + sample.remove(4));

        return sample;

    }
}
