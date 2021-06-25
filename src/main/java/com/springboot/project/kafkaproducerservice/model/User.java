package com.springboot.project.kafkaproducerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    public String id;
    public long salary;
    public String department;
}
