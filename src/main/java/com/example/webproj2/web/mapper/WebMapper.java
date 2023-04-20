package com.example.webproj2.web.mapper;

import com.example.webproj2.web.dto.WebDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WebMapper {  // xml이랑 연결

    List<WebDto> selectWebList() throws Exception;

}
