package com.teamhs.community.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
import java.time.LocalDate;

@Entity
public class Board {
    @Id
    private String user_id;
    @Column(nullable = false)
    private int c_id;
    @Column(nullable = false)
    private int cate_id;
    @Column(nullable = true)
    private String c_title;
    @Column(nullable = true)
    private String c_content;
    @Column(nullable = true)
    private LocalDate c_date;
    @Column(nullable = true)
    private int c_recom;
    @Column(nullable = true)
    private int c_cnt;
    @Column(nullable = true)
    private int cm_cnt;

    //requestDto가 접근, Domain을 통해 db를 Get할 수 있도록 정의
    public Board(String user_id, int c_id, int cate_id, String c_title, String b_content, LocalDate c_date, int c_recom, int c_cnt, int cm_cnt){
        super();
        this.user_id = user_id;
        this.c_id = c_id;
        this.cate_id = cate_id;
        this.c_title = c_title;
        this.c_content = c_content;
        this.c_date = c_date;
        this.c_recom = c_recom;
        this.c_cnt = c_cnt;
        this.cm_cnt = cm_cnt;
    }

}
