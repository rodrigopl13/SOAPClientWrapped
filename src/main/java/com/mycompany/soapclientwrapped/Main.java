/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.soapclientwrapped;

import com.ws.document.GenerateStrings;
import com.ws.document.ObjectFactory;
import com.ws.document.SoapDocumentWrapped;
import com.ws.document.SoapDocumentWrappedService;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
        SoapDocumentWrappedService service = new SoapDocumentWrappedService();
        SoapDocumentWrapped port = service.getSoapDocumentWrappedPort();
        GenerateStrings request = new ObjectFactory().createGenerateStrings();
        List<String> response = port.generateStrings("do something", 10, 'e', 'a');
        response.forEach(System.out::println);
    }
}
