package com.company.module;

import com.company.devis.DevisJson;
import com.company.devis.DevisText;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<ModuleMaison> listModules = new ArrayList<ModuleMaison>();



        ModuleMaison module1 = new Etage("etage", 500.00f);
        ModuleMaison module2 = new SousSol("sous-sol", 10f,250.00f);
        listModules.add(module1);
        listModules.add(module2);
        DevisJson dj = new DevisJson(listModules);
        dj.write();


        DevisText dt = new DevisText(listModules);
        dt.write();
    }
}
