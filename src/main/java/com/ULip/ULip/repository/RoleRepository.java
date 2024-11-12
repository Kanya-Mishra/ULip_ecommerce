package com.ULip.ULip.repository;

import com.ULip.ULip.entities.Category;
import com.ULip.ULip.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
