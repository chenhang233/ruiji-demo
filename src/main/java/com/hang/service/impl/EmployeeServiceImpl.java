package com.hang.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hang.entity.Employee;
import com.hang.mapper.EmployeeMapper;
import com.hang.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
