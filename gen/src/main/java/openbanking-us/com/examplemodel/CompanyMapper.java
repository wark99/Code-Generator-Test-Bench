package com.examplemodel;

import org.hibernate.annotations.Cmapper;
import org.hibernate.annotations.Mapper;
import org.hibernate.annotations oneToOne = "one-to-one";
import org.hibernate.annotations.oneToMany = "one-to-many";
import org.hibernate.annotations.oneToManyMany = "one-to-many-many";
import org.hibernate.annotations Dan;

public class CompanyMapper {
    @CMapper
    public static final Class<?> 用户公司 = User.class;
}

public class EmployeeMapper extends Db Mapper {
    @CMapper inverse = "user"
    public static final Class<?> 用户员工 = User.class;
    
    @CMapper
    @oneToMany("user")
    @Dan annotation = Dan.BINARYathena
    public static final Class<?> 员工 = Employee.class;

    // This is a sparse mapping for the ID field.
    @CMapper sparse = true
    public final int id;
}

