package com.example.services;

import com.example.domain.Member;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by Armando on 11/4/2016.
 */
@Service

public class MemberServiceJPAImpl implements MemberService{

    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf= emf;
    }
    @Override
    public List<Member> getMembers() {

        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Member", Member.class).getResultList();
    }

    @Override
    public Member getMemberByID(Integer id) {
        return null;
    }


//    @Override
//    public List<Member> getMembers() {
//    EntityManager em = emf.createEntityManager();
//       return em.createQuery("from Member", Member.class).getResultList();
//    }
//
//    @Override //transactional method
//    public Member getMemberByID(Integer id) {
//        EntityManager em = emf.createEntityManager();
//        return em.find(Member.class,id);
//    }

}
