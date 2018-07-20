package com.careerfest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class ApplicationConfig {
	
/*	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}*/

	/*@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		System.out.println("inside view resolver method");
		viewresolver.setViewClass(JstlView.class);
		viewresolver.setPrefix("/WEB-INF/jsp/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}*/

	@Bean
	public TilesViewResolver geTilesViewResolver() {
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		System.out.println("inside tilesviewresolver method");
		tilesViewResolver.setViewClass(TilesView.class);
		return tilesViewResolver;
	}

	@Bean
	public TilesConfigurer geTilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		System.out.println("inside tilesconfigure method");
		tilesConfigurer.setCheckRefresh(true);
		tilesConfigurer.setDefinitionsFactoryClass(TilesDefinationConfiguration.class);
		TilesDefinationConfiguration.addDefinitions();
		return tilesConfigurer;
	}
/*	@Bean
	public MessageSource messageSource() {
	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.setBasename("messages");
	    return messageSource;
	}*/
}
