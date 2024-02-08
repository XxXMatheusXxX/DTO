package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.entities.Usuario;

public interface  UsuarioRepository extends JpaRepository<Usuario,Long>{

	

}