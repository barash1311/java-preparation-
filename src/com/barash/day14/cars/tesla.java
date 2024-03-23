package com.barash.day14.cars;

public class tesla implements Brake,Engine,media{
    @Override
    public void musicstart() {
        System.out.println("music is starting");
    }

    @Override
    public void musicstop() {
        System.out.println("music stopped");

    }

    @Override
    public void brake() {
        System.out.println("brake applied");
    }

    @Override
    public void start() {
        System.out.println("engine started");

    }

    @Override
    public void stop() {
        System.out.println("engine stopped");

    }
}
