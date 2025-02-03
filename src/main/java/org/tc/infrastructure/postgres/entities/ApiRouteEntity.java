package org.tc.infrastructure.postgres.entities;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.tc.consts.DatabaseConsts;

@Getter
@Setter
@Table(name= DatabaseConsts.API_ROUTE, schema = DatabaseConsts.GATEWAY_SCHEMA)
public class ApiRouteEntity {
    @Id
    private Long id;
    private String routeIdentifier;
    private String uri;
    private String method;
    private String path;
}
