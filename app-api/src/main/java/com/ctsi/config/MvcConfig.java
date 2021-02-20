package com.ctsi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig  implements WebMvcConfigurer {

    /*@Bean
    public TokenInterceptor tokenInterceptor(){
        return new TokenInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/api/common/login",
                        "/api/common/register",
                        "static/**");
    }
    */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:d:/upload/cms/");// 这里要写你的文件存储的路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * 解决跨域请求的问题
     * @return
     */
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //允许跨域请求的域名
        corsConfiguration.addAllowedOrigin("*");
        //设置允许的方法(GET POST)
        corsConfiguration.addAllowedMethod("*");
        //允许任何头部
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addExposedHeader("token");
        //CorsFilter
        UrlBasedCorsConfigurationSource basedCorsConfigurationSource=new UrlBasedCorsConfigurationSource();
        basedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return  new CorsFilter(basedCorsConfigurationSource);

    }

    // 解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS","HEAD")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
