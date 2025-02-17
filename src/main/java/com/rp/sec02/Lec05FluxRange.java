package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxRange {

    public static void main(String[] args) {
/*
        Flux.range(3, 10)
                .log()
                .map(i -> Util.faker().name().fullName())
                .log()
                .subscribe(
                        Util.onNext()
                );
*/

        Flux.range(3,2)
           // .log()
           // .map( i -> "vaule "+ Integer.toString(i))
            .log()
            .subscribe(System.out::println);

    }

}
