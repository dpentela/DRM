package com.dairy.drm.service;

import com.dairy.drm.dao.DairyFarmDAO;
import com.dairy.drm.model.DairyFarm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DairyFarmServiceImpl  implements  DairyFarmService {

    @Autowired
    private DairyFarmDAO dairyFarmDAO;

    @Transactional
    @Override
    public List<DairyFarm> get() {
        return dairyFarmDAO.get();

    }

    @Transactional
    @Override
    public DairyFarm get(int farmId) {

        return dairyFarmDAO.get(farmId);
    }

    @Transactional
    @Override
    public void save(DairyFarm dairyFarm) {
        dairyFarmDAO.save(dairyFarm);

    }

    @Transactional
    @Override
    public void delete(int farmId) {
        dairyFarmDAO.delete(farmId);

    }

}
