package com.spring.demo.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/admin")
public class AdminController {

        @Autowired
        private final AdminService adminService;

        public AdminController(AdminService adminService) {
            this.adminService = adminService;
        }

    @PostMapping("/register")
    public String registerUser(@RequestBody AdminModel adminModel){
        Admin admin = adminService.registerAdmin(adminModel);
        return "Success";
    }

}
