package lk.udeshi.springboot.repositary;

import lk.udeshi.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //JpaRepository-it has methods save findbyId delete

}
