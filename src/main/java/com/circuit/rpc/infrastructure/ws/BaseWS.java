package com.circuit.rpc.infrastructure.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BaseWS {

    @WebMethod
    String testWebService();
}
