package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class Restaurant {
	private Chef chef;
	
	@Autowired 
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public Chef getChef() {
		return this.chef;
	}
}
