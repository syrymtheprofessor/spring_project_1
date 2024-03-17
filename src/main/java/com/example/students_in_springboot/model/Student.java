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


/*
@Data: Эта аннотация является составной аннотацией и включает в себя несколько других аннотаций,
таких как @Getter, @Setter, @ToString, @EqualsAndHashCode и @NoArgsConstructor.

@Getter и @Setter генерируют методы доступа (getter и setter) для всех полей класса Student.
@ToString генерирует метод toString(), который возвращает строковое представление объекта, включая все его поля.
@EqualsAndHashCode генерирует методы equals() и hashCode(), что облегчает сравнение объектов по содержимому и
использование их в коллекциях, таких как HashSet или HashMap.
@NoArgsConstructor генерирует конструктор без аргументов, который может быть полезен при создании
экземпляров класса с использованием рефлексии или при маппинге объектов из базы данных.

@Builder: Эта аннотация генерирует метод builder(), который упрощает создание экземпляров класса с
большим количеством полей, особенно в случае, когда вы не хотите передавать значения для всех полей в конструктор,
а хотите использовать цепочку вызовов методов для инициализации только необходимых полей.

 */