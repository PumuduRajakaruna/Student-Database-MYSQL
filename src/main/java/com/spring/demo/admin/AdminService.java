package com.spring.demo.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Admin registerAdmin(AdminModel adminModel) {

            Admin admin = new Admin();
            admin.setEmail(adminModel.getEmail());
            admin.setFirstName(adminModel.getFirstName());
            admin.setLastName(adminModel.getLastName());
            admin.setRole("USER");
            admin.setPassword(passwordEncoder.encode(adminModel.getPassword()));

            adminRepository.save(admin);
            return admin;
    }
}
