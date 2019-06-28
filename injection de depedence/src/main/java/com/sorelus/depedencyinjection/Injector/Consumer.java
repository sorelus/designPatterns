package com.sorelus.depedencyinjection.Injector;

import com.sorelus.depedencyinjection.service.Animal;

public class Consumer {

    private Animal animal ;
    public Consumer(Animal animal){
        this.animal =animal;
    }

    public String ditMoiCeQueTuManges(){
        return animal.queMangesTu();
    }
}
