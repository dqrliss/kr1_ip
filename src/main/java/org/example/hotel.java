package org.example;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class hotel implements Comparable<hotel>{
    hotel() {}
    private String city;
    private String name;
    private int amount;
    hotel(String cityy) {
        city = cityy;
        name = "";
        amount = 0;
    }
    hotel(String namee, String useless) {
        city = "";
        name = namee;
        amount = 0;
    }
    hotel(int amountt) {
        city = "";
        name = "";
        amount = amountt;
    }
    public hotel(String city, String name, int amount) {
        this.city = city;
        this.name = name;
        this.amount = amount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int compareTo(hotel other) {
        return CharSequence.compare(this.city, other.city);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        hotel Hotel = (hotel) o;
//        if (!Objects.equals(city, Hotel.city)) return false;
//        return String.valueOf(amount) != null ? String.valueOf(amount).equals(String.valueOf(Hotel.amount)) : String.valueOf(Hotel.amount) == null;
//    }
    public void input(Scanner in) throws IOException {
        String str = in.nextLine();
        int ind = str.indexOf(" ");
        int ind_ = str.lastIndexOf(" ");
        city = str.substring(0, ind);
        name = str.substring(ind + 1, ind_);
        amount =  Integer.parseInt(str.substring(ind_ + 1));
    }
    public void output(PrintWriter out) {
        out.print(this);
    }
}
