package com.example.data;

import net.alkative.jpf JPAAnno;

public class Cart implements Serializable {
    @Id
    public Integer id;

    @Column(nullable = false)
    public String toString();
    
    @Column
    public int userId;
}

