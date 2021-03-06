package com.lec.spring.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class WriteDTO {
	private int uid;   // wr_uid
	private String subject;  // wr_subject
	private String content;  // wr_content
	private String name;  // wr_name
	private int viewCnt;  // wr_viewcnt
	private LocalDateTime regDate;  // wr_regdate
}
