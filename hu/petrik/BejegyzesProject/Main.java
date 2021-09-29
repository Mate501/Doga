package hu.petrik.BejegyzesProject;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        LocalDateTime egyik = LocalDateTime.parse("2021-09-25 15:03:15", formatter);
        LocalDateTime masik = LocalDateTime.parse("2021-09-25 15:03:15", formatter);
        LocalDateTime harmadik = LocalDateTime.parse("2021-09-25 15:20:15", formatter);
        if (egyik.equals(masik)) {
            System.out.println("Ugyan az az idopont");
        }


        ArrayList<Bejegyzes> egy = new ArrayList<Bejegyzes>();
        ArrayList<Bejegyzes> ketto = new ArrayList<Bejegyzes>();

        System.out.println("Darabszám?:");
        int db =

        Scanner myObj = new Scanner(System.in);
    }

}
