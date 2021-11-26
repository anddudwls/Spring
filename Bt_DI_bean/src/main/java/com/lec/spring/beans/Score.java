package com.lec.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Data  // getter, setter, toString, equals, hashCode ..
//@Getter   // getter
//@Setter   // setter
//@ToString  // toString()
//@NoArgsConstructor  // 기본생성자
//@AllArgsConstructor  // 모든 필드 생성자
//@RequiredArgsConstructor // @NonNull 이 붙은 필드 생성자
//@EqualsAndHashCode // equals(), hashCode()


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
	int kor;
	int eng;
	int math;
	
	String comment;
	
}
