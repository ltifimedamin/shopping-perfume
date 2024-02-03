package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.Perfume;

import java.util.List;

public interface IServicePerfume {
    List<Perfume> retrieveAllPerfumes();

    Perfume addBloc(Perfume b);

    Perfume updateBloc(Perfume b);
    Perfume retrieveBloc(Integer idPerfume);

    void removePerfume(Integer idPerfume);
}
