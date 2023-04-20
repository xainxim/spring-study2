package com.example.webproj2.web.controller;

import com.example.webproj2.web.dto.WebDto;
import com.example.webproj2.web.service.WebService;
import com.example.webproj2.web.service.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private WebServiceImpl webService;

    @RequestMapping("/web/openWebWrite.do")
    public ModelAndView openWebList() throws Exception{
            ModelAndView mv = new ModelAndView("/web/webList");  // 요청의 결과를 보여줄 뷰

            List<WebDto> list = webService.selectWebList();  // 게시글 목록 조회
            mv.addObject("list", list);  // 뷰에 list이름으로 저장

            return mv;
    }
}
