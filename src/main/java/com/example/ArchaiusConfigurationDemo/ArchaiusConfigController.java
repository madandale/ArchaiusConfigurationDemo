package com.example.ArchaiusConfigurationDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.config.DynamicLongProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;


@RestController

public class ArchaiusConfigController {

	
	private DynamicStringProperty propertyOneWithDynamic
    = DynamicPropertyFactory.getInstance()
    .getStringProperty("spring.application.name", "not found!");
  
	private DynamicStringProperty propertyOneWithDynamic1
    = DynamicPropertyFactory.getInstance()
    .getStringProperty("my.archaius.properties.one", "not found!");
	
		  
  @GetMapping("/DynamicProperty")
  public String getPropertyValue() {
  return propertyOneWithDynamic.getName() + ": " + propertyOneWithDynamic.get() +"\n seccond property : "+propertyOneWithDynamic1.getName() + ": " + propertyOneWithDynamic1.get();
  }
  
}
