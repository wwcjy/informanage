package com.hunau.test;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 吉婷瑄
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "吉婷瑄，学号为201841882204";
    }
}