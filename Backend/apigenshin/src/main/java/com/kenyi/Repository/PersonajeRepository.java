package com.kenyi.Repository;

import com.kenyi.Models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Esto es un repositorio para la entidad Personaje
// que extiende de JpaRepository para realizar operaciones CRUD
@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}