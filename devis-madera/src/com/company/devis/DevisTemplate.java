package com.company.devis;

import com.company.module.ModuleMaison;

import java.util.ArrayList;

abstract class DevisTemplate {

    protected ArrayList<ModuleMaison> modules;

    public DevisTemplate(ArrayList<ModuleMaison> modules) {
        this.modules = modules;
    }

    abstract void addHeader();

    abstract void addContent();

    abstract void addFooter();

    abstract String write();

    protected float getTotal() {
        float somme = 0f;
        for (ModuleMaison m : modules) {
            somme += m.getPrice();
        }
        return somme;
    }

    protected void generate() {

    }
}
