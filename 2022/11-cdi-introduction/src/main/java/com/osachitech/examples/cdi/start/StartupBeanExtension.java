package com.osachitech.examples.cdi.start;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.spi.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class StartupBeanExtension implements Extension {

    private final Set<Bean<?>> startupBeans = new LinkedHashSet<>();

    <X> void processBean(@Observes ProcessBean<X> event) {
        if (event.getAnnotated().isAnnotationPresent(Startup.class)
                && event.getAnnotated().isAnnotationPresent(ApplicationScoped.class)) {
            this.startupBeans.add(event.getBean());
        }
    }

    void afterDeploymentValidation(@Observes AfterDeploymentValidation event, BeanManager manager) {
        for (Bean<?> bean : startupBeans) {

            manager.getReference(bean, bean.getBeanClass(), manager.createCreationalContext(bean)).toString();
        }
    }
}
