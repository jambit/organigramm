package com.jambit.organigramm.persistence;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

public class UUIDGenerator implements IdentifierGenerator {

    public static final String GENERATOR_NAME = "UUIDGenerator";
    public static final String PACKAGE_PATH = "com.jambit.organigramm.persistence.UUIDGenerator";

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
    return UUID.randomUUID().toString();
    }
}
