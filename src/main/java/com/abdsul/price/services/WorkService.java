package com.abdsul.price.services;

import com.abdsul.price.model.Work;

import java.util.List;

public interface WorkService {
    List<Work> findAll();

    Work add(Work work);

    Work findWorkById(Long id);

    boolean delete(Work work);
}
