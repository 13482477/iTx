package com.siebre.itx.processer;

import com.siebre.itx.request.ItxRequest;
import com.siebre.itx.response.ItxResponse;

/**
 * Created by jhonelee on 2017/8/25.
 */
public interface ItxTransactionProcesser {

    public ItxResponse doTransaction(ItxRequest request);

}
