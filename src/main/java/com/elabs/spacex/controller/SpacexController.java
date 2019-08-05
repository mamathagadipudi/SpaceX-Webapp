package com.elabs.spacex.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.elabs.spacex.Launch;
import com.elabs.spacex.Rocket;

@Controller
public class SpacexController {

	private static final Logger log = LoggerFactory.getLogger(SpacexController.class);

    @GetMapping("/rockets")
    @ModelAttribute("rockets")
    public List<Rocket> getRockets(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	RestTemplate restTemplate = new RestTemplate();
    	
    	ResponseEntity<List<Rocket>> rateResponse =
    	        restTemplate.exchange("https://api.spacexdata.com/v3/rockets",
    	                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Rocket>>() {
    	            });
    	List<Rocket> rockets = rateResponse.getBody();
    	
    	log.info(rockets.get(0).toString());
		return rockets;
    }
    
    @GetMapping("/launches")
    @ModelAttribute("launch")
    public Launch getLaunches(@RequestParam("id") String id) {
    	RestTemplate restTemplate = new RestTemplate();
    	
    	Launch Launch = restTemplate.getForObject(
				"https://api.spacexdata.com/v3/launches/"+id, Launch.class);
    	
    	
    	log.info(Launch.toString());
		return Launch;
    }

}
