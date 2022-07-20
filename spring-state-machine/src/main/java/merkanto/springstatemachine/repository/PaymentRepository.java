package merkanto.springstatemachine.repository;

import merkanto.springstatemachine.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {


}
