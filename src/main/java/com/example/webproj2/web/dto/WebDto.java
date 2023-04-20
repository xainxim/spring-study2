package com.example.webproj2.web.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data  // 롬복 어노텐션, getter/setter 생성,  setter는 final이 선언되지 않은 필드에만 적용
public class WebDto {
    private int webIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
//    private LocalDateTime createdDatetime;
    private String createdDatetime;
    private String updaterId;
    private LocalDateTime updatedDatetime;



}
