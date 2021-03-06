package ftc.shift.sample.repository;

import ftc.shift.sample.entity.Licence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LicenceRepository extends JpaRepository<Licence, UUID> {
    List<Licence> findLicencesByUserId(Long companyId);
}
