package com.base.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @GetMapping("/test-api")
    public Object testApi() {

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJNYXBDbGFpbXMiOnsiYXVkIjoiaHR0cDovLzIwLjI0NC41Ni4xNDQvZXZhbHVhdGlvbi1zZXJ2aWNlIiwiZW1haWwiOiIyMzAwMDMxMDc5Y3NlaDFAZ21haWwuY29tIiwiZXhwIjoxNzgwMTE5ODI4LCJpYXQiOjE3ODAxMTg5MjgsImlzcyI6IkFmZm9yZCBNZWRpY2FsIFRlY2hub2xvZ2llcyBQcml2YXRlIExpbWl0ZWQiLCJqdGkiOiI3MzExN2Q4Ny0xODNiLTQ0Y2UtYmZjMS01YzQ0MWQ4ODc5NjIiLCJsb2NhbGUiOiJlbi1JTiIsIm5hbWUiOiJhY2h1dGhhIHYgcyBtb2hhbiBzcmkgcHVuZWV0aCIsInN1YiI6ImJhNThkMGMxLTkzM2ItNDcyYy05N2RjLTM3YWMxMWFiNTkyYSJ9LCJlbWFpbCI6IjIzMDAwMzEwNzljc2VoMUBnbWFpbC5jb20iLCJuYW1lIjoiYWNodXRoYSB2IHMgbW9oYW4gc3JpIHB1bmVldGgiLCJyb2xsTm8iOiJhYTFiYiIsImFjY2Vzc0NvZGUiOiJBdnJBQUsiLCJjbGllbnRJRCI6ImJhNThkMGMxLTkzM2ItNDcyYy05N2RjLTM3YWMxMWFiNTkyYSIsImNsaWVudFNlY3JldCI6IlVRQXRLRmRxdXlGVGpNR2sifQ.XJaESLIhNw5srZIzoprCZeDhwHbkZ8ywtTxKIC5Ls6w";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.exchange(
                "http://4.224.186.213/evaluation-service/depots",
                HttpMethod.GET,
                entity,
                String.class
        ).getBody();
    }
}