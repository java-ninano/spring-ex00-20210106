package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component // spring(IOC) Container에 bean을 등록하도록 하는 어노테이션
@Data //@setter, toString() 자동생성
public class Chef {

}
