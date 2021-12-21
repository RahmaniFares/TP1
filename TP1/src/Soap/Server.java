package Soap;

import javax.xml.ws.Endpoint;

public class Server {

    final static String URL = "http://localhost:5050/";

    public static void main(String[] args) {

        Endpoint.publish(URL, new Calculatrice());
    }
}
