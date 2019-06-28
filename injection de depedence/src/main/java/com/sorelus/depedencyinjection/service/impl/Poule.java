package com.sorelus.depedencyinjection.service.impl;

import com.sorelus.depedencyinjection.service.Animal;

public class Poule implements Animal {
    @Override
    public String queMangesTu() {
        return "Je mange des graines";
    }
}
