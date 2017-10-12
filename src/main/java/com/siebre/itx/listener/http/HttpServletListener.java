package com.siebre.itx.listener.http;

import com.siebre.itx.listener.IListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jhonelee on 2017/8/25.
 */
@RestController
public class HttpServletListener implements IListener {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public Object onRecive() {
        return null;
    }
}
