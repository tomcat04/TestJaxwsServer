/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.jaxws.server;

import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author cgx1844568
 */
@WebService 
public interface Calculator {

    public int add(int a, int b);
    
    public List<PersonBean> getPersonList();
}
