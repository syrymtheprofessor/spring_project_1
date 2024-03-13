package com.example.students_in_springboot.model;

import lombok.*;

import java.time.LocalDate;

/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor - если я поставлю @NotNull для email, то @NoArgsConstructor уже не будет работать
потому что говорим по умолчанию нам нужен email

но, это все можно заменить через @Data
 */
@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private int age;
}