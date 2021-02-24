package com.dairy.drm.dao;

import java.util.List;
import com.dairy.drm.model.DairyFarm;
public interface DairyFarmDAO {
    List<DairyFarm> get();

    DairyFarm get(int farmId);

    void save(DairyFarm dairyFarm);

    void delete(int farmId);
}
