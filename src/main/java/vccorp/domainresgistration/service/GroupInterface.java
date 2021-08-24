package vccorp.domainresgistration.service;

import vccorp.domainresgistration.dto.request.NewGroupRequest;
import vccorp.domainresgistration.dto.response.GroupResponse;
import vccorp.domainresgistration.repository.entity.GroupEntity;

public interface GroupInterface {
    GroupResponse addGroup(NewGroupRequest request);
}
