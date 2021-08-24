package vccorp.domainresgistration.dto.response;

import lombok.Getter;
import lombok.Setter;
import vccorp.domainresgistration.enumerates.Status;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class GroupResponse {
    private String groupName;
    private String description;
    private Status status;
}
