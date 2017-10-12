package com.siebre.itx.matcher;

import com.siebre.itx.request.ItxRequest;
import com.siebre.itx.request.TransportType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class ItxHttpRequestMatcher implements ItxTransactionMatcher {

    private String uri;

    private RequestMethod requestMethod;


    @Override
    public boolean match(ItxRequest itxRequest) {
        if (!TransportType.HTTP.equals(itxRequest.getProtocol())) {
            return false;
        }

        HttpServletRequest httpServletRequest = (HttpServletRequest) itxRequest.getMessage();

        String requestUri = httpServletRequest.getRequestURI();

        if (StringUtils.equals(this.uri, requestUri)) {
            if (this.requestMethod == null) {
                return true;
            }

            if (StringUtils.equals(this.requestMethod.name(), httpServletRequest.getMethod())) {
                return true;
            }
        }


        return false;
    }
}
