package br.ufg.inf.onboarding.repository;

import br.ufg.inf.onboarding.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "usuario", collectionResourceRel = "usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}