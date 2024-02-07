package com.example.c322spring2024homework2.repository;
import com.example.c322spring2024homework2.model.Guitar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryRepository {

    private static final String DATABASE_NAME = "guitars_database.txt";
    public void addGuitar(Guitar g)  {
        try (FileWriter writer = new FileWriter(DATABASE_NAME, true)) {
            writer.write(String.format("%s,%.2f,%s,%s,%s,%s,%s%n", g.getSerialNumber(), g.getPrice(), g.getBuilder(),
                    g.getModel(), g.getType(), g.getBackWood(), g.getTopWood()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Guitar getGuitar(String serialNumber) {
        Guitar g = new Guitar(null, 0, null, null, null, null, null);
        try (BufferedReader reader = new BufferedReader(new FileReader(DATABASE_NAME))) {
            String newLine = "";
            while(reader.readLine() != null) {
                newLine = reader.readLine();
                String[] words = newLine.split(",");
                if(words.length == 7 && words[0].equals(serialNumber)) {
                    g =  new Guitar(words[0], Double.parseDouble(words[1]), g.stringToBuilder(words[2]),
                            words[3], g.stringToType(words[4]), g.stringToWood(words[5]), g.stringToWood(words[6]));
                    return g;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Guitar> search(Guitar g) {
        List<Guitar> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATABASE_NAME))) {
            String newLine = "";
            while(reader.readLine() != null) {
                newLine = reader.readLine();
                String[] words = newLine.split(",");
                if(words.length == 7
                        && (g.getSerialNumber() == null|| words[0].equals(g.getSerialNumber()))
                        && (g.getPrice() == 0 || Double.parseDouble(words[2]) == g.getPrice())
                        && (g.getBuilder() == null || words[2].equals(g.getBuilder().toString()))
                        && (g.getModel() == null || words[3].equals(g.getModel()))
                        && (g.getType() == null || words[4].equals(g.getType().toString()))
                        && (g.getBackWood() == null|| words[5].equals(g.getBackWood().toString()))
                        && (g.getTopWood() == null || words[6].equals(g.getTopWood().toString()))) {
                    Guitar newGuitar =  new Guitar(words[0], Double.parseDouble(words[1]), g.stringToBuilder(words[2]),
                            words[3], g.stringToType(words[4]), g.stringToWood(words[5]), g.stringToWood(words[6]));
                    result.add(newGuitar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
