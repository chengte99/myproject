package com.chengte99;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Mcdonalds {
    Map<String, Item> menu = new HashMap<>();

    public Mcdonalds() {
        try {
            FileReader fr = new FileReader("mcdonald.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
//                System.out.println(line);
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3])
                );
                menu.put(tokens[0], item);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printMenu() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            itemEntry.getValue().print();
        }
    }

    public static void main(String[] args) {
        Mcdonalds mc = new Mcdonalds();
        mc.printMenu();
    }
}

class Item {
    String id;
    String name;
    int calorie;
    int price;

    public void print() {
        System.out.println(id + "\t" + name + "\t" + calorie + "\t" + price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(String id, String name, int calorie, int price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }
}
