package com.example.ClinicaProf.service.impl;

import com.example.ClinicaProf.model.Usuario;
import com.example.ClinicaProf.service.IService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioServiceImpl implements IService<Usuario> {
    private static Map<Integer, Usuario> usuarioMap = new HashMap<>();

    @Override
    public Usuario salvar(Usuario usuario) {
        usuarioMap.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public List<Usuario> buscarTodos() {
        return new ArrayList<>(usuarioMap.values());
    }

    @Override
    public String excluir(Integer id) {
        usuarioMap.remove(id);
        return "Usuário removido";
    }
}
