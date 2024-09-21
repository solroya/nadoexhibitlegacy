package com.exhibit.nado.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExhibitionBoardDTO {

	private int exno;
	private String mememail;
	private String memid;
	private String title;
	private String picture;
	private String content;
	private int likes;
	private int viewcnt;
	private Date regdate;
	private Date updatedate;
}
