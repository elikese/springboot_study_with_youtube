package com.study.testproject.controller;

import com.study.testproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello() {
        return "Hello World!";
    }

    // http://localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        return "HM";
    }

    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
    // Parameter의 변수 이름을 일치시키지 못할 경우 사용. "variable != var"
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }


    // http://localhost:8080/api/v1/get-api/request1?name=HM&email=elikese@gmail.com&organization=choeuopChurch
    @GetMapping(value = "/request1")
    public String getRequestParam1(@RequestParam String name,
                                   @RequestParam String email,
                                   @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    // http://localhost:8080/api/v1/get-api/request2?key1=val1&key1=val2
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder stringBuilder = new StringBuilder();

        param.forEach((key, value) -> stringBuilder.append(key).append(" : ").append(value).append("\n"));

        return stringBuilder.toString();
    }

    // http://localhost:8080/api/v1/get-api/request3?name=HM&email=elikese@gmail.com&organization=choeuopChurch
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

















}