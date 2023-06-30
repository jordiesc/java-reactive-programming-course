package com.rp.sec03;

import java.util.Random;

import com.rp.courseutil.Util;

import ch.qos.logback.core.testUtil.RandomUtil;
import reactor.core.publisher.Flux;

public class Lec01FluxCreate {

    public static void main(String[] args)  {

        Flux.create(fluxSink -> {
            String country;
            do{
                country = Util.faker().country().name();
                fluxSink.next(country);
                            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }while (!country.toLowerCase().equals("canada"));
            fluxSink.complete();

        })
        .subscribe(Util.subscriber());



    }

}
