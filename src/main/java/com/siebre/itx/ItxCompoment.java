package com.siebre.itx;

/**
 * Created by jhonelee on 2017/8/31.
 */
public interface ItxCompoment<I, O> {

    public O doProcess(I input);

}
