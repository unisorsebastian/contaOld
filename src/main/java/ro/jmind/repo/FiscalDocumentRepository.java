package ro.jmind.repo;

import org.springframework.data.repository.CrudRepository;

import ro.jmind.model.FiscalDocument;

public interface FiscalDocumentRepository extends CrudRepository<FiscalDocument, Long> {
	public FiscalDocument savek();
}
