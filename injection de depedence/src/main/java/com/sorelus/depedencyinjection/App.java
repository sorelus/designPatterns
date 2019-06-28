package com.sorelus.depedencyinjection;

import com.sorelus.depedencyinjection.Injector.InjectorService;
import com.sorelus.depedencyinjection.Injector.impl.ChienInjector;
import com.sorelus.depedencyinjection.Injector.impl.PouleInjector;

/**
 * Class for test implementation
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        InjectorService injector ;

        // posez la question au Chien
        injector = new ChienInjector();
        System.out.println(injector.getConsumer().ditMoiCeQueTuManges());

        // posez la question à la poule
        injector = new PouleInjector();
        System.out.println(injector.getConsumer().ditMoiCeQueTuManges());

    }
}
