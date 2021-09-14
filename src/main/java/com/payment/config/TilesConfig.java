package com.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfig {

    @Bean
    public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver view = new UrlBasedViewResolver();
        view.setViewClass(TilesView.class);
        return view;
    }

    @Bean
    public TilesConfigurer tilesViewConfig() {
        TilesConfigurer tiles = new TilesConfigurer();
        tiles.setDefinitions(new String[]{"WEB-INF/context/tiles.xml"});
        tiles.setCheckRefresh(true);
        return tiles;
    }
}
