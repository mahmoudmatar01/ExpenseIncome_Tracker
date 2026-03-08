package org.expenseincometracker.expenseincometracker.repository;


import jakarta.validation.constraints.NotBlank;
import org.expenseincometracker.expenseincometracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    boolean existsByEmail(@NotBlank String email);
    List<User> findByParentId(Long parentId);
}
