package com.ideal.communal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.ParameterBuilderPlugin;
import springfox.documentation.spi.service.contexts.ParameterContext;
import springfox.documentation.swagger.common.SwaggerPluginSupport;
@Component
@Order(SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER + 1000)
public class ReqestParamLogger implements ParameterBuilderPlugin {

	@Override
	public boolean supports(DocumentationType delimiter) {
		
		return Boolean.TRUE;
	}

	@Override
	public void apply(ParameterContext parameterContext) {
	
		System.out.println("你好靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠靠");
	}


}
