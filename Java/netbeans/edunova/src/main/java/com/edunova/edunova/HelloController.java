/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edunova.edunova;

import com.google.gson.Gson;
import edunova.controller.ObradaSmjer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import edunova.model.Smjer;
/**
 *
 * @author dell
 */
@RestController
public class HelloController {
    
    @GetMapping("/v1/smjerovi")
	public String index() {
            
            Gson gson = new GsonBuilder()
                    .setExclusionStrategies(new CustomExclusionStrategy()).create();
        
            
		return gson.toJson(
                        new ObradaSmjer().read()
                );
	}
        
         @GetMapping("/v1/html")
	public String htmlPrimjer() {
            return "<h1>Hello</h1>";
        }
        
    public class CustomExclusionStrategy implements ExclusionStrategy {
 
    public boolean shouldSkipField(FieldAttributes f) {
        return (f.getDeclaringClass() == Smjer.class && f.getName().equals("grupe"));
    }
 
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
 
}
}
