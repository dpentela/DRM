package com.dairy.drm.service;

import com.dairy.drm.model.DairyFarm;
import com.dairy.drm.model.Employee;

import java.util.List;

public interface DairyFarmService {

    List<DairyFarm> get();

    DairyFarm get(int farmId);

    void save(DairyFarm dairyFarm);

    void delete(int farmId);

}
