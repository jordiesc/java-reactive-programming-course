package com.rp.sec03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import reactor.core.publisher.Flux;

public class File09FileReaderAsignement {
     public static void main(String[] args) {
        
        		BufferedReader reader;
                reader = new BufferedReader(new FileReader("src/main/resources/assignment/sec03/file01.txt"));
                
                Flux.generate(null, null, null)

		try {
			reader = new BufferedReader(new FileReader("src/main/resources/assignment/sec03/file01.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


        public static  reader(){
            return () -> {};
        }
    }



}
