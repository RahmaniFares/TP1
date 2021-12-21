package Soap;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Calculatrice {

    @WebMethod
    public int mult(@WebParam(name="a") int a,@WebParam(name= "b") int b ){
        return a * b;
    }

    @WebMethod
    public int substract(@WebParam(name="a") int a,@WebParam(name= "b") int b ){
        return a - b;
    }

    @WebMethod
    public int sqrt(@WebParam(name="a") int a,@WebParam(name= "b") int b ){
        return a * a + b * b;
    }
}
