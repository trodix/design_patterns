package com.company.devis;

import com.company.module.ModuleMaison;

import java.util.ArrayList;

abstract class DevisFactory {

    enum Mode {TEXT, JSON};

    public DevisFactory() {
    }

    public DevisTemplate getWriter(Mode mode, ArrayList<ModuleMaison> m) {
        if (mode == Mode.JSON) {
            return new DevisJson(m);
        } else if (mode == Mode.TEXT) {
            return new DevisText(m);
        }
        return null;
    }
}
