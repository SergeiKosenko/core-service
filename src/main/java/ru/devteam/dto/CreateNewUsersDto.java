package ru.devteam.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CreateNewUsersDto {
    private String photo;
    private String userfirstname;
    private String userlastname;
    private String password;
    private char gender;
    private LocalDateTime dateofbirth;
    private String email;


}
