package com.circuit.rpc.infrastructure.configuration;

import com.circuit.rpc.infrastructure.jdbc.SchemaJdbc;
import com.circuit.rpc.infrastructure.ws.WebServiceImpl;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
import java.util.List;

@Configuration
public class SoapWebServiceConfig {

    private final SchemaJdbc schemaJdbc;
    private static final String URI_SOAP = "http://localhost:8081/";

    public SoapWebServiceConfig(SchemaJdbc schemaJdbc) {
        this.schemaJdbc = schemaJdbc;
        registerDynamicWebServices();
    }

    private void registerDynamicWebServices() {
        List<String> schemas = schemaJdbc.getSchemas();
        for (String schema : schemas) {
            WebServiceImpl service = new WebServiceImpl(schemaJdbc);
            String dynamicUri = URI_SOAP + schema;
            Endpoint.publish(dynamicUri, service);
            System.out.println("Endpoint SOAP dinâmico registrado em: " + dynamicUri);
        }
    }
}
