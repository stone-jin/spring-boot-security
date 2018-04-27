package com.fedfans.controller.ajax;

import com.fedfans.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 博客地址: https://www.520stone.com
 * description: 测试类
 * Created by stone-jin on 下午7:58
 */
@RestController
@RequestMapping("/xhr/test")
public class TestController {

    @GetMapping("/hello.do")
    public ResultVO hello(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMessage("hello world");
        return resultVO;
    }
}

