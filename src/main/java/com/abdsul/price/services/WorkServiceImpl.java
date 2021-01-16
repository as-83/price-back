package com.abdsul.price.services;

import com.abdsul.price.model.Work;
import com.abdsul.price.repos.WorkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkRepo workRepo;

    @Override
    public List<Work> findAll() {
        return workRepo.findAll();
    }

    @Override
    public Work add(Work work) {
        return workRepo.save(work);
    }

    @Override
    public Work findWorkById(Long id) {
        return workRepo.findById(id).get();
    }

    @Override
    public void delete(Work work) {
        workRepo.delete(work);
    }
}
