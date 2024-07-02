//package com.prodetect.fraud.controller;
//
//
//
//    // MentorController.java
//import com.prodetect.fraud.entity.Mentor;
//import com.prodetect.fraud.services.MentorService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//    @RestController
//    @RequestMapping("/mentors")
//    public class MentorController {
//
//
//        @Autowired
//        private final MentorService mentorService;
//
//        @Autowired
//        public MentorController(MentorService mentorService) {
//            this.mentorService = mentorService;
//        }
//
//        private final List<Mentor> mentors = new ArrayList<>();
//
//        @PostMapping("/register")
//        public String registerMentor(@RequestBody Mentor mentor) {
////            mentors.add(mentor);
//            mentorService.registerMentor(mentor);
//            return "Mentor registered successfully!";
//        }
//
//        @GetMapping("/all")
//        public List<Mentor> getAllMentors() {
//
//            ;
//            return mentorService.getAllMentors();
//        }
//    }
//
