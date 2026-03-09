package org.expenseincometracker.expenseincometracker.repository;

import org.expenseincometracker.expenseincometracker.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

    List<Wallet> findAllByOwnerId(Long ownerId);

    Optional<Wallet> findByIdAndOwnerId(Long id, Long ownerId);

    List<Wallet> findByAssignedChildren_Id(Long childId);
}