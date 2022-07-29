package com.osachitech.examples.cdi.worker;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.inject.Any;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class Manager implements Worker{

    @Inject
    @Delegate
    @Any
    private Worker worker;

    @Override
    public String work(String job) {
        return "A manager has received the job and it will delegate to a programmer -> "
                + worker.work(job);
    }
}
