package com.circuitec.circuitclient.resource;

import com.circuitec.circuitclient.service.SoapClientService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soap-resource")
public class SoapClientResource {

    private final SoapClientService soapClientService;

    public SoapClientResource(SoapClientService soapClientService) {
        this.soapClientService = soapClientService;
    }

    @GetMapping(value = "/test-soap/{schema}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> testSoap(@PathVariable String schema) {
        String response = soapClientService.callTestWebService(schema);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);

        return ResponseEntity.ok().headers(headers).body(response);
    }
}
