package Soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name="CalculatorService",
        targetNamespace="http://soapservice")
@SOAPBinding(style= SOAPBinding.Style.RPC, use= SOAPBinding.Use.LITERAL) public
interface Calculator {
    @WebMethod(operationName="add")
    @WebResult(name="addResult")
    public int add(@WebParam(name = "first") int first,
                   @WebParam(name = "second")int second);
    @WebMethod(operationName="subtract")
    @WebResult(name="subtractResult")
    public int subtract(@WebParam(name = "first") int first,
                        @WebParam(name = "second") int second);
}
