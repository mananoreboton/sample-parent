package com.borabora;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by epauser on 14/04/15.
 */
@WebService
@Stateless
public class SampleEJBWS {

    @EJB
    private SampleEJB sampleEJB;

    @WebMethod
    public String add(String i, String j) {
        return i + j + sampleEJB + sampleEJB.getSampleModel();
    }
}