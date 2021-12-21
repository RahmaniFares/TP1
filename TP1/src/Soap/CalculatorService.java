package Soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalculatorService {

    @WebMethod
    public int add(int first, int second){
        return first + second;
    }

    @WebMethod
    public int subtract(int first, int seconde){
        return first - seconde;
    }
}
