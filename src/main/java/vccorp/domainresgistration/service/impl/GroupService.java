package vccorp.domainresgistration.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vccorp.domainresgistration.converter.Converter;
import vccorp.domainresgistration.dto.request.NewGroupRequest;
import vccorp.domainresgistration.dto.response.GroupResponse;
import vccorp.domainresgistration.enumerates.Status;
import vccorp.domainresgistration.repository.GroupRepository;
import vccorp.domainresgistration.repository.entity.DomainEntity;
import vccorp.domainresgistration.repository.entity.GroupEntity;
import vccorp.domainresgistration.service.GroupInterface;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService implements GroupInterface {
    private static final Logger logger = LoggerFactory.getLogger(GroupService.class);

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public GroupResponse addGroup(NewGroupRequest request){

        GroupEntity entity = Converter.toModel(request, GroupEntity.class);
//        if(request.getStatus() ==null){
//            entity.setStatus(Status.DRAFF);
//        }

        groupRepository.save(entity);
        return Converter.toModel(entity,GroupResponse.class);
    }
}
