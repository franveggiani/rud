package com.divisiongis.rud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisiongis.rud.Entity.catastro.CapasCartografia;
import com.divisiongis.rud.Repository.BaseRepository;
import com.divisiongis.rud.Repository.catastro.CapasCartografiaRepository;

@Service
public class CapasCartografiaServiceImpl extends BaseServiceImpl<CapasCartografia, Long> implements CapasCartografiaService {

    protected CapasCartografiaRepository capasCartografiaRepository;

    @Autowired
    public CapasCartografiaServiceImpl(CapasCartografiaRepository capasCartografiaRepository){
        super(capasCartografiaRepository);
        this.capasCartografiaRepository = capasCartografiaRepository;
    }

    @Override
    public List<CapasCartografia> getCapasCartografia() throws Exception {
        try {
            return capasCartografiaRepository.findAll();

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
