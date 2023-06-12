package com.rp.sec01;

import java.util.function.Consumer;

import org.reactivestreams.Subscriber;

import reactor.core.publisher.Mono;

public class Lec02MonoJust {


    public static void main(String[] args) {
        

        Mono<Integer> mon = Mono.just(1);

        Lec02MonoConsumer  referencia = new Lec02MonoConsumer();

        Consumer<? super Integer> myconsumerObjectREf = referencia::objectMethodPrintInteger;

        mon.subscribe(myconsumerObjectREf);
        System.out.println("                   ");

        mon.subscribe(Lec02MonoConsumer::staticMethodPrintInteger);
}
}

