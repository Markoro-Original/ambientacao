package br.ufg.inf.onboarding.repository;

@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public class UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
    List<Usuario> findByName(@Param("nome") String nome);
}