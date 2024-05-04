package com.reservation.service;


import com.reservation.entities.Visitor;
import com.reservation.repository.VisitorRepository;
import com.reservation.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl implements VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

    @Override
    public void trackVisitor(String visitorId) {
        Visitor visitor = new Visitor(visitorId);
        visitorRepository.save(visitor);
    }
}
