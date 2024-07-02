//package com.prodetect.fraud.services;
//
//// MentorService.java
//import com.prodetect.fraud.entity.Mentor;
//import com.prodetect.fraud.repository.MentorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MentorService {
//
//    @Autowired
//    private final MentorRepository mentorRepository;
//
//    @Autowired
//    public MentorService(MentorRepository mentorRepository) {
//        this.mentorRepository = mentorRepository;
//    }
//
//    public Mentor registerMentor(Mentor mentor) {
//        // Additional business logic, validation, or processing can be added here
//        return mentorRepository.save(mentor);
//    }
//
//    public List<Mentor> getAllMentors() {
//        return mentorRepository.findAll();
//    }
//}
//
