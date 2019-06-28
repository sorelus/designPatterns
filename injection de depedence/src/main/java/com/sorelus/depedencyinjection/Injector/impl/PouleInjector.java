package com.sorelus.depedencyinjection.Injector.impl;

import com.sorelus.depedencyinjection.Injector.Consumer;
import com.sorelus.depedencyinjection.Injector.InjectorService;
import com.sorelus.depedencyinjection.service.impl.Poule;

public class PouleInjector implements InjectorService {
    @Override
    public Consumer getConsumer() {
        return new Consumer(new Poule());
    }
}
