package com.ibm.cd.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cd.demo.service.MessageService;

@RestController
public class MessageContoller {

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public ResponseEntity<String> getMsg()
    {    MessageService messageService = new MessageService();
         return new ResponseEntity<String>(messageService.getMsg(),HttpStatus.OK);
    }

}
