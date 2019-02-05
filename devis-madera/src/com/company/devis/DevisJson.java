package com.company.devis;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import com.company.module.ModuleMaison;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DevisJson extends DevisTemplate {

    private JSONObject objGlobal = new JSONObject();

    public DevisJson(ArrayList<ModuleMaison> modules) {
        super(modules);
    }

    @Override
    public void addHeader() {
        objGlobal.put("title", "DEVIS");
        objGlobal.put("total", this.getTotal());
    }

    @Override
    public void addContent() {
        JSONArray jarray = new JSONArray();
        for (ModuleMaison m : this.modules) {
            JSONObject objMod = new JSONObject();
            objMod.put("name", m.getName());
            objMod.put("price", m.getPrice());

            jarray.add(objMod);
        }
        objGlobal.put("modules", jarray);
    }

    @Override
    public void addFooter() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        objGlobal.put("date", dtf.format(now));
    }

    @Override
    public String write() {
        addHeader();
        addContent();
        addFooter();
        try (FileWriter file = new FileWriter("/home/sebastien/workspace/CESI/design_patterns/devis-madera/devis.json")) {
            file.write(objGlobal.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + objGlobal);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objGlobal.toJSONString();
    }

}
