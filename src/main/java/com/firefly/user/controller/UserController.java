package com.firefly.user.controller;

import com.firefly.user.VO.Department;
import com.firefly.user.VO.ResponseTemplateVO;
import com.firefly.user.entity.Usere;
import com.firefly.user.service.UsereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsereService usereService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/")
    public Usere saveUser(@RequestBody Usere usere){
        return usereService.saveUsere(usere);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findUserWithDepartment(@PathVariable("id") Long userId){
        ResponseTemplateVO vo =  new ResponseTemplateVO();
        Usere usere = usereService.findByUsereId(userId);

        Department department = restTemplate.getForObject("http://localhost:9001/departments/"+usere.getDepartmentId()
                ,Department.class);
        vo.setUsere(usere);
        vo.setDepartment(department);
        return vo;

    }
}
