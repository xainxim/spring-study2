package com.example.webproj2;

import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class WebProj2ApplicationTests {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSqlSession() throws Exception{
        System.out.println(sqlSession.toString());
    }

}
