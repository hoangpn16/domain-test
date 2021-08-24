package vccorp.domainresgistration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vccorp.domainresgistration.dto.response.GroupResponse;
import vccorp.domainresgistration.factory.ResponseFactory;
import vccorp.domainresgistration.dto.request.NewGroupRequest;
import vccorp.domainresgistration.service.GroupInterface;

@RestController
@RequestMapping(value ="/group")
public class GroupController {
    private static final Logger logger = LoggerFactory.getLogger(GroupController.class);
    @Autowired
    private ResponseFactory factory;
    @Autowired
    private GroupInterface service;

    @PostMapping
    public ResponseEntity addNewGroup(@RequestBody NewGroupRequest request){
        logger.info("Add new group with body {}",request);
        GroupResponse data = service.addGroup(request);
        return factory.success(request);
    }
}
