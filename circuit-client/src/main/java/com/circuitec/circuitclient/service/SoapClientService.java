package com.circuitec.circuitclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SoapClientService {

    private final RestTemplate restTemplate;

    @Value("${soap.service.url}")
    private String soapServiceUrl;

    public SoapClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callTestWebService(String schema) {
        String url = soapServiceUrl + schema + "?wsdl";
        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
