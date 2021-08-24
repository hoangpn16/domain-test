package vccorp.domainresgistration.dto.request;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class NewGroupRequest {
    private String groupName;
    private String description;
    private String status;
}
