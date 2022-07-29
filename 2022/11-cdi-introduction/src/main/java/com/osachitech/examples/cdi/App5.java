package com.osachitech.examples.cdi;

import com.osachitech.examples.cdi.start.EagerBean;
import com.osachitech.examples.cdi.start.LazyBean;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App5 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            LazyBean bean = container.select(LazyBean.class).get();
            bean.action();
            EagerBean eagerBean = container.select(EagerBean.class).get();
            eagerBean.action();

        }

    }
}
