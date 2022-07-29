package com.osachitech.examples.cdi.worker;


import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

import java.util.logging.Logger;

@Timed
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
class TimedInterceptor {
    private static final Logger LOGGER = Logger.getLogger(TimedInterceptor.class.getName());

    @AroundInvoke
    public Object timed(InvocationContext context) throws Exception {
        long start = System.currentTimeMillis();
        Object result = context.proceed();
        long end = System.currentTimeMillis() -start;
        String message = String.format("Time to execute the class %s the method %s " +
                " is of %d milliseconds", context.getTarget(), context.getMethod(), end);
        LOGGER.info(message);
        return result;
    }
}
