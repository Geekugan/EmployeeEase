package tech.getarrays.employeemanager.resource;

import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    private final List<Employee> employees = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(idCounter.incrementAndGet());
        employees.add(employee);
        return employee;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employees.removeIf(e -> e.getId().equals(id));
    }
}
