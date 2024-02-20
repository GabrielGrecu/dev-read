package com.dev.withoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WisdomServiceConfig {

    @Bean
    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }
}
