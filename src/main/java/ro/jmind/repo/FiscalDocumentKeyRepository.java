package ro.jmind.repo;

import org.springframework.data.repository.CrudRepository;

import ro.jmind.model.FiscalDocumentKey;

public interface FiscalDocumentKeyRepository extends CrudRepository<FiscalDocumentKey, Long> {

}
