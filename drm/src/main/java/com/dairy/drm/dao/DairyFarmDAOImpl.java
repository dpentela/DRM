package com.dairy.drm.dao;
import com.dairy.drm.model.DairyFarm;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class DairyFarmDAOImpl implements DairyFarmDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<DairyFarm> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<DairyFarm> query = currSession.createQuery("from DairyFarm", DairyFarm.class);
        List<DairyFarm> list = query.getResultList();
        return list;

    }

    @Override
    public DairyFarm get(int farmId) {
        Session currSession = entityManager.unwrap(Session.class);
        DairyFarm farm =currSession.get(DairyFarm.class, farmId);
        return farm;
    }

    @Override
    public void save(DairyFarm dairyFarm) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(dairyFarm);

    }

    @Override
    public void delete(int farmId) {
        Session currSession = entityManager.unwrap(Session.class);
        DairyFarm farm = currSession.get(DairyFarm.class, farmId);
        currSession.delete(farm);

    }
}
