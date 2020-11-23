package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YannyConfiguration {

    @Bean
    YannyWordProducer yannyWordProducer(){
        return new YannyWordProducer();
    }

}
