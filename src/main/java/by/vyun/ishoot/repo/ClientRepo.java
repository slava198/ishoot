package by.vyun.ishoot.repo;

import by.vyun.ishoot.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
    Client getFirstById(Long id);

}