package com.rushikesh_demo_project_2.insurance_system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
