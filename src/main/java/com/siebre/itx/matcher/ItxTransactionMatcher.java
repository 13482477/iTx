package com.siebre.itx.matcher;

import com.siebre.itx.request.ItxRequest;

/**
 * Created by jhonelee on 2017/8/25.
 */
public interface ItxTransactionMatcher {

    public boolean match(ItxRequest request);

}
