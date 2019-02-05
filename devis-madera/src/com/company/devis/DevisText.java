package com.company.devis;

import com.company.module.ModuleMaison;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DevisText extends DevisTemplate {

    private String content = "";

    public DevisText(ArrayList<ModuleMaison> modules) {
        super(modules);
    }

    @Override
    public void addHeader() {
        content += "Title: " + "DEVIS\n";
        content += "Total: " + this.getTotal() + "\n";
    }

    @Override
    public void addContent() {
        for (ModuleMaison m : modules) {
            content += "name: " + m.getName() + "\n";
            content += "name: " + m.getPrice() + "\n";
        }
    }

    @Override
    public void addFooter() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        content += "date: " + dtf.format(now) + "\n";
    }

    @Override
    public String write() {
        addHeader();
        addContent();
        addFooter();
        try (FileWriter file = new FileWriter("/home/sebastien/workspace/CESI/design_patterns/devis-madera/devis.txt")) {
            file.write(content);
            System.out.println("Successfully Copied text to File...");
            System.out.println("\nContent: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
