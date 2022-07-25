package com.firefly.user.service;

import com.firefly.user.entity.Usere;
import com.firefly.user.repository.UsereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsereService {

    @Autowired
    private UsereRepository usereRepository;


    public Usere saveUsere(Usere usere) {
       return usereRepository.save(usere);
    }

    public Usere findByUsereId(Long userId) {
        return usereRepository.findByUsereId(userId);
    }
}
