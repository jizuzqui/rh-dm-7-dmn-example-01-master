package com.redhat.emea.es.lab.dm.dmn;

import org.apache.commons.math3.analysis.function.Sqrt;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class MathUtils implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public MathUtils() {
        
    }


    public static double sqrt(double x){
        Sqrt sqrt = new Sqrt();
        return sqrt.value(x);
    }

}