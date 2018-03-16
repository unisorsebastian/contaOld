package ro.jmind.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FISCAL_DOCUMENT_KEYS")
public class FiscalDocumentKey implements Serializable {

	private static final long serialVersionUID = -399234285793818021L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long number;

	@NotNull
	private String series = "JMD";

	@OneToOne(cascade = CascadeType.ALL)
	private FiscalDocument fiscalDocument;

	public FiscalDocumentKey() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fiscalDocument == null) ? 0 : fiscalDocument.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
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
		FiscalDocumentKey other = (FiscalDocumentKey) obj;
		if (fiscalDocument == null) {
			if (other.fiscalDocument != null)
				return false;
		} else if (!fiscalDocument.equals(other.fiscalDocument))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FiscalDocumentKey [number=" + number + ", series=" + series + ", fiscalDocument=" + fiscalDocument + "]";
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public FiscalDocument getFiscalDocument() {
		return fiscalDocument;
	}

	public void setFiscalDocument(FiscalDocument fiscalDocument) {
		this.fiscalDocument = fiscalDocument;
	}
	
	

}
