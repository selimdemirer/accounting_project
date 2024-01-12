package com.cydeo.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RoleDto {
    private Long id;
    private String description;
}
