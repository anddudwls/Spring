SELECT 
	wr_uid uid, 
	wr_subject subject, 
	wr_content content, 
	wr_name name, 
	wr_viewcnt viewcnt, 
	wr_regdate regDate 
FROM 
	test_write 
ORDER BY 
	wr_uid DESC	;
			
delete from test_write where wr_uid > 10;		

------------------------------------------

SELECT * FROM tbl_write;
DESC tbl_write;


SELECT * FROM hibernate_sequence;













