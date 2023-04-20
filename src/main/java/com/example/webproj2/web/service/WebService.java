package com.example.webproj2.web.service;

import com.example.webproj2.web.dto.WebDto;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface WebService {

    public List<WebDto> selectWebList() throws Exception;

}
