package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor //all parameter matching field ->SampleHotel(hoel)
@RequiredArgsConstructor //required parameter matching field ->SampleHotel()
public class SampleHotel {

	@NonNull //필수
	private Chef chef;

	//public SampleHotel(Chef chef) {
		//this.chef = chef;
	//}
	
	
}
