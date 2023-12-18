package com.example.service.dtos;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class UserDTO {
    private String name;
    private String email;
    private Date date_Naissance;
}
