package br.ufg.inf.onboarding.controller;

import br.ufg.inf.onboarding.model.Usuario;
import br.ufg.inf.onboarding.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @ResponseBody
    @RequestMapping(path = "/adicionar", method = RequestMethod.POST)
    public void adicionar(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @ResponseBody
    @RequestMapping("/usuarios")
    public List<Usuario> listar() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

}
