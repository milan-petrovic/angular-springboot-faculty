package rva.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import rva.jpa.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
	public Collection<Status> findByNazivContainingIgnoreCase(String naziv);
}
