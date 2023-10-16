package org.example;

import java.util.Comparator;
public class my_comp implements Comparator<hotel> {
    public int compare(hotel a, hotel b){
        return a.getName().compareTo(b.getName()); // minus for int
    }
}
