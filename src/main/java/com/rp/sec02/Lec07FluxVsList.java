package com.rp.sec02;

import java.util.List;

import com.rp.courseutil.Util;
import com.rp.sec02.helper.NameGenerator;



public class Lec07FluxVsList {

    public static void main(String[] args) {

        List<String> names = NameGenerator.getNamesArray(5);
        System.out.println(names);

        
      /*/  
        NameGenerator.getNamesFlux(5)
                .subscribe(Util.onNext());

*/

    }

}
