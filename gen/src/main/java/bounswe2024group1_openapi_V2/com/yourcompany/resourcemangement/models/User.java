package com.yourcompany.resourcemangement.models;

import com.javidb.model.*;
import com.javidb.solver.Solver;

public class User {
    @Column(key = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id(as = "userId")
    public String userId;
}

