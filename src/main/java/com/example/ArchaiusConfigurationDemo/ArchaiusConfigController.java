package com.example.ArchaiusConfigurationDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;


@RestController

public class ArchaiusConfigController {

	
	private DynamicStringProperty propertyOneWithDynamic
    = DynamicPropertyFactory.getInstance()
    .getStringProperty("my.archaius.properties.one", "not found!");
   
  @GetMapping("/DynamicProperty")
  public String getPropertyValue() {
  return propertyOneWithDynamic.getName() + ": " + propertyOneWithDynamic.get();
  }
  
}
