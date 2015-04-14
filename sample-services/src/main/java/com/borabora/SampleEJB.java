package com.borabora;

import com.borabora.sampleparent.SampleModel;

import javax.ejb.Stateless;

/**
 * Created by epauser on 14/04/15.
 */
@Stateless
public class SampleEJB {

    private long a = System.currentTimeMillis();
    private SampleModel sampleModel = new SampleModel();

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public SampleModel getSampleModel() {
        return sampleModel;
    }

    public void setSampleModel(SampleModel sampleModel) {
        this.sampleModel = sampleModel;
    }
}
