package com.sorelus.depedencyinjection.service.impl;

import com.sorelus.depedencyinjection.service.Animal;

public class Chien implements Animal {
    @Override
    public String queMangesTu() {
        return "Je mange de la viande";
    }
}
