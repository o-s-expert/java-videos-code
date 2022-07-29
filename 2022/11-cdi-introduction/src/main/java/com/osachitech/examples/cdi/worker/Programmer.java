package com.osachitech.examples.cdi.worker;

public class Programmer implements Worker {
    @Override
    public String work(String job) {
        return "converting coffee into code, the job: " + job;
    }
}
