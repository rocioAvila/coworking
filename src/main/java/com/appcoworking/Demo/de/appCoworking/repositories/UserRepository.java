package com.appcoworking.Demo.de.appCoworking.repositories;

import com.appcoworking.Demo.de.appCoworking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT e FROM User e WHERE e.nameUser = :nameUser")
    public List<User> findUserForName(@Param("nameUser") String nameUser);

    @Query("SELECT e FROM User e WHERE e.lastNameUser = :lastNameUser")
    public List<User> findUserForLastName(@Param("lastNameUser") String lastNameUser);

    @Query("SELECT e FROM User e WHERE e.dni = :dni")
    public User findUserForDNI(@Param("dni") String dni);


}
