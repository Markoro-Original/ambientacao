package br.ufg.inf.onboarding.repository;

import br.ufg.inf.onboarding.model.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Integer> {

}