package org.tc.infrastructure.postgres.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tc.consts.DatabaseConsts;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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
