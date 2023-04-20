package com.example.webproj2.web.service;

import com.example.webproj2.web.dto.WebDto;
import com.example.webproj2.web.mapper.WebMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServiceImpl{

    @Autowired
    private WebMapper webMapper;

    public List<WebDto> selectWebList() throws Exception{
        return webMapper.selectWebList();
    }
}
