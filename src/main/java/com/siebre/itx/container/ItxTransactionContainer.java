package com.siebre.itx.container;

import com.siebre.itx.matcher.ItxTransactionMatcher;
import com.siebre.itx.processer.ItxTransactionProcesser;
import com.siebre.itx.request.ItxRequest;
import com.siebre.itx.response.ItxResponse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jhonelee on 2017/8/25.
 */
//@Component
public class ItxTransactionContainer {

    private Map<ItxTransactionMatcher, ItxTransactionProcesser> transactionMatchers = new ConcurrentHashMap<ItxTransactionMatcher, ItxTransactionProcesser>();


    public ItxResponse handle(ItxRequest itxRequest) {
        ItxTransactionProcesser itxTransactionProcesser = this.obtainTransactionProcesser(itxRequest);


        return null;
    }

    protected ItxTransactionProcesser obtainTransactionProcesser(ItxRequest itxRequest) {
        for (Map.Entry<ItxTransactionMatcher, ItxTransactionProcesser> entry : this.transactionMatchers.entrySet()) {
            ItxTransactionMatcher matcher = entry.getKey();
            if (matcher.match(itxRequest)) {
                return entry.getValue();
            }
        }

        throw new ItxTransactionProcesserNotFoundException("ItxTransactionProcesser not found!");
    }


}
