package com.appcoworking.Demo.de.appCoworking.repositories;

import com.appcoworking.Demo.de.appCoworking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT e FROM User WHERE e.nameUser = :nameUser OR e.lastNameUser = :lastNameUser")
    public List<User> findUserForName(@Param("nameUser") String nameUser, @Param("lastNameUser") String lastNameUser);

    @Query("SELECT e FROM User WHERE e.dni = :dni")
    public User findUserForDNI(@Param("dni") String dni);


}
