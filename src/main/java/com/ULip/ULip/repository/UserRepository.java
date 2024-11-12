package com.ULip.ULip.repository;

import com.ULip.ULip.entities.Category;
import com.ULip.ULip.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
