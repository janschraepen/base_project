package be.mediasoft.example.services;

import be.mediasoft.example.domain.Employee;
import be.mediasoft.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String getGreeting(String name) {
        List<Employee> employees = employeeRepository.findByLastName("Schraepen");
        return "Hello " + employees.get(0).getFirstName() + " " + employees.get(0).getLastName();
    }

}
