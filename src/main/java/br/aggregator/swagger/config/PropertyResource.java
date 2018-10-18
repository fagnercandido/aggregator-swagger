package br.aggregator.swagger.config;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Controller
@Primary
public class PropertyResource implements SwaggerResourcesProvider {

	@Autowired
	private SwaggerServicesConfig config;

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> lista = new LinkedList<>();
		for (SwaggerService item : config.getServices()) {
			SwaggerResource sr = new SwaggerResource();
			sr.setUrl(item.getUrl());
			sr.setName(item.getName());
			sr.setSwaggerVersion(item.getVersion());
			lista.add(sr);
		}
		return lista;
	}
}
