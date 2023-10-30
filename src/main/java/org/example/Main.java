package org.example;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Scanner in = new Scanner(Paths.get("hotel.txt"));
        hotel hotel1 = new hotel();
        hotel hotel2 = new hotel();
        hotel hotel3 = new hotel();
        hotel hotel4 = new hotel();
        hotel hotel5 = new hotel();
        hotel hotel6 = new hotel();
        hotel hotel7 = new hotel();
        hotel1.input(in);
        hotel2.input(in);
        hotel3.input(in);
        hotel4.input(in);
        hotel5.input(in);
        hotel6.input(in);
        hotel7.input(in);
        in.close();
        ArrayList<hotel> hotels = new ArrayList<>();
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);
        hotels.add(hotel6);
        hotels.add(hotel7);
        Collections.sort(hotels);
        for (hotel h: hotels) {
            System.out.println(h.getCity() + " " + h.getName() + " " + h.getAmount());
        }
        int index = 0;
        ArrayList<hotel> temp = new ArrayList<>();
        while (true) {
            index = Collections.binarySearch(hotels, new hotel("mins"));
            if (index > -1) {
                System.out.println("\n" + hotels.get(index).getName() + " " + hotels.get(index).getAmount() + "\n");
                temp.add(hotels.get(index));
                hotels.remove(index);
            }
            else break;
        }
        for (hotel h: temp) hotels.add(h);
        hotels.sort(new my_comp());

        index = 0;
        ArrayList<hotel> temp_ = new ArrayList<>();
        while (true) {
            index = Collections.binarySearch(hotels, new hotel("beijing", ""), new my_comp());
            if (index > -1) {
                System.out.println("\n" + hotels.get(index).getCity() + "\n");
                temp_.add(hotels.get(index));
                hotels.remove(index);
            }
            else break;
        }
        for (hotel h: temp_) hotels.add(h);
        Collections.sort(hotels);

        mapper.writeValue(new File("output.json"), hotels);
    }
}