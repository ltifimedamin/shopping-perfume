package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.Perfume;
import com.esprit.shopping_perfume_back.repositories.PerfumeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ServicePerfume implements IServicePerfume{

    PerfumeRepository perfumeRepository;
    @Override
    public List<Perfume> retrieveAllPerfumes() {
        return perfumeRepository.findAll();
    }

    @Override
    public Perfume addBloc(Perfume b) {
        return perfumeRepository.save(b);
    }

    @Override
    public Perfume updateBloc(Perfume b) {
        return perfumeRepository.save(b);
    }

    @Override
    public Perfume retrieveBloc(Integer idPerfume) {
        return perfumeRepository.findById(idPerfume).get();
    }

    @Override
    public void removePerfume(Integer idPerfume) {
        perfumeRepository.deleteById(idPerfume);
    }
}
