/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.jaxws.server;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public List<PersonBean> getPersonList() {
        List<PersonBean> list = new ArrayList<>();
        PersonBean pb = new PersonBean();
        pb.setPersonId("a1");
        pb.setPersonName("baidu");
        list.add(pb);
        pb.setPersonId("a2");
        pb.setPersonName("ali");
        list.add(pb);
        pb.setPersonId("a3");
        pb.setPersonName("tencent");
        list.add(pb);
        System.out.println("CalculatorImpl.getPersonList");
        return list;
    }

}
