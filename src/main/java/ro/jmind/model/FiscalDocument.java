package ro.jmind.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FISCAL_DOCUMENTS")
public class FiscalDocument implements Serializable {

	private static final long serialVersionUID = 3413687964193504375L;

	@Id
	private String id;
	
	@NotNull
	@OneToOne
//	@JoinColumn(name = "doc_key")
	private FiscalDocumentKey fiscalDocumentKey;

	private String officialDocumentNumber;
	
	private String client;
	
	public FiscalDocument() {}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fiscalDocumentKey == null) ? 0 : fiscalDocumentKey.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FiscalDocument other = (FiscalDocument) obj;
		if (fiscalDocumentKey == null) {
			if (other.fiscalDocumentKey != null)
				return false;
		} else if (!fiscalDocumentKey.equals(other.fiscalDocumentKey))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FiscalDocument [id=" + id + ", fiscalDocumentKey=" + fiscalDocumentKey + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FiscalDocumentKey getFiscalDocumentKey() {
		return fiscalDocumentKey;
	}

	public void setFiscalDocumentKey(FiscalDocumentKey fiscalDocumentKey) {
		this.fiscalDocumentKey = fiscalDocumentKey;
	}

	public String getOfficialDocumentNumber() {
		return officialDocumentNumber;
	}

	public void setOfficialDocumentNumber(String officialDocumentNumber) {
		this.officialDocumentNumber = officialDocumentNumber;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}


	
	
}
