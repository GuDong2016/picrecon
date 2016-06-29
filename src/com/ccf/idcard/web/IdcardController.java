package com.ccf.idcard.web;

import com.ccf.client.ClientSPlain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Created by dell on 2016/6/28.
 */
@RestController
public class IdcardController {
    @RequestMapping(value = "/test/{name}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON)
    public String test(@PathVariable String name) {
        return "hello " + name;
    }

    //客户端调用返回中文乱码，是因为默认为iso-8859编码，可以通过在produces中设置charset解决
    @RequestMapping(value = "/imgrecon/{idnum}", method = RequestMethod.GET,
            produces = {"application/json; charset=UTF-8"})
    public String imgRecon(@Context HttpServletRequest request, @Context HttpServletResponse response,
                           @PathVariable String idnum) {
        System.out.println(idnum);

        ClientSPlain clientSPlain = new ClientSPlain();
       // response.setCharacterEncoding("ISO-8859-1");
        return  clientSPlain.idcardRecon("2","d://1.jpg");
    }
}
