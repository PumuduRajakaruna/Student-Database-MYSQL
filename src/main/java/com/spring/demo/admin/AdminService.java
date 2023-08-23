package com.spring.demo.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private AdminRepository adminRepository;

    private PasswordEncoder passwordEncoder;
    @Autowired
    public AdminService(AdminRepository adminRepository, PasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerAdmin(AdminModel adminModel) {

            Admin admin = new Admin();
            admin.setEmail(adminModel.getEmail());
            admin.setFirstName(adminModel.getFirstName());
            admin.setLastName(adminModel.getLastName());
            admin.setRole("ADMIN");
            admin.setPassword(passwordEncoder.encode(adminModel.getPassword()));

            adminRepository.save(admin);
    }
}
