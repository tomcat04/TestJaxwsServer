/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.jaxws.server;

import javax.jws.WebService;

/**
 *
 * @author cgx1844568
 * @date 2014-10-23
 * @time 15:40:49
 *
 */
@WebService(endpointInterface = "com.test.jaxws.server.Calculator")
public class CalculatorImpl implements Calculator{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

}
