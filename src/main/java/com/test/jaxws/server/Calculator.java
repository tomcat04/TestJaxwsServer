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
 */
@WebService 
public interface Calculator {

    int add(int a, int b);
}
