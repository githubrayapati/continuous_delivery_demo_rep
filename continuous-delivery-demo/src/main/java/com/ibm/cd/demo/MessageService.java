package com.ibm.cd.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


public class MessageService {

    @GET
    @Path("/messages")
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }

}
