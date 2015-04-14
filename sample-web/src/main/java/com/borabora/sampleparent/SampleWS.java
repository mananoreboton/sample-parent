package com.borabora.sampleparent;

import com.borabora.SampleEJB;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by epauser on 13/04/15.
 */
@WebService
public class SampleWS {

    @EJB
    private SampleEJB sampleEJB;

    @WebMethod
    public String add(String i, String j) {
        return i + j + sampleEJB + sampleEJB.getSampleModel();
    }
}
