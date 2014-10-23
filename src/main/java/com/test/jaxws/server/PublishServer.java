/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.jaxws.server;

import javax.xml.ws.Endpoint;

/**
 *
 * @author cgx1844568
 */
public class PublishServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endpoint.publish("http://localhost:8088/calculator",  
                new CalculatorImpl());
    }
    
}
