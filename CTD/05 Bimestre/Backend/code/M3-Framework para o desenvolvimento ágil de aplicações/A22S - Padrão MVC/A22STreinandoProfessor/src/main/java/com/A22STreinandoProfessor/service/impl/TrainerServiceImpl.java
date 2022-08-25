package com.A22STreinandoProfessor.service.impl;

import com.A22STreinandoProfessor.model.Trainer;
import com.A22STreinandoProfessor.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}
