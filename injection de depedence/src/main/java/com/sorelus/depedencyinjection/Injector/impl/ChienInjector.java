package com.sorelus.depedencyinjection.Injector.impl;

import com.sorelus.depedencyinjection.Injector.Consumer;
import com.sorelus.depedencyinjection.Injector.InjectorService;
import com.sorelus.depedencyinjection.service.impl.Chien;

public class ChienInjector  implements InjectorService {
    @Override
    public Consumer getConsumer() {
        return new Consumer(new Chien());
    }
}
