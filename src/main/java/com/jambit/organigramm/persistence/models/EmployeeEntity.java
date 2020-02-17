package com.jambit.organigramm.persistence.models;

import com.jambit.organigramm.persistence.UUIDGenerator;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class EmployeeEntity {

    @GenericGenerator(name = UUIDGenerator.GENERATOR_NAME, strategy = UUIDGenerator.PACKAGE_PATH)

    @Id
    @GeneratedValue(generator = UUIDGenerator.GENERATOR_NAME)
    private String id;

    private String structureId;

    private String lastName;
    private String firstName;

    private String imagePath;
}
