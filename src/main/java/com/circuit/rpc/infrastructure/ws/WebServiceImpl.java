package com.circuit.rpc.infrastructure.ws;

import com.circuit.rpc.infrastructure.jdbc.SchemaJdbc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.circuit.rpc.infrastructure.ws.BaseWS")
public class WebServiceImpl implements BaseWS {

    private final SchemaJdbc schemaJdbc;

    public WebServiceImpl(SchemaJdbc schemaJdbc) {
        this.schemaJdbc = schemaJdbc;
    }

    @Override
    public String testWebService() {
        return "SERVER SOAP RPC TEST WEB SERVICE!!!!!!!!!";
    }
}
