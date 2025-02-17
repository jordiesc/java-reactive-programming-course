package com.rp.sec02.helper;

import java.util.ArrayList;
import java.util.List;

import com.rp.courseutil.Util;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class NameGenerator {

   public static List<String> getNamesArray(int count){
        List<String> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            list.add(getName());
        }
        return list;
    }

    public static Flux<String> getNamesFlux(int count){
       return Flux.range(0, count)
                .map(i -> getName());
    }

    private static String getName(){
        log.info("in get name");
        Util.sleepSeconds(1);
        return Util.faker().name().fullName();
    }

}
