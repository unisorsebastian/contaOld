package ro.jmind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.jmind.model.FiscalDocument;
import ro.jmind.model.FiscalDocumentKey;
import ro.jmind.repo.FiscalDocumentKeyRepository;
import ro.jmind.repo.FiscalDocumentRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/bill") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired
	private FiscalDocumentRepository docRepository;
	@Autowired
	private FiscalDocumentKeyRepository docIdRepository;

	
	@GetMapping(path = "/addDocId")
	public @ResponseBody String addDocID() {
		FiscalDocumentKey fiscaDocumentKey = docIdRepository.save(new FiscalDocumentKey());
		
		FiscalDocument fiscalDocument = new FiscalDocument();
		fiscalDocument.setId(fiscaDocumentKey.getSeries()+String.format("%05d", fiscaDocumentKey.getNumber()));
		fiscalDocument.setClient("rinf");
		fiscalDocument.setFiscalDocumentKey(fiscaDocumentKey);
		
		FiscalDocument fiscalDocumentSaved = docRepository.save(fiscalDocument);
		fiscaDocumentKey.setFiscalDocument(fiscalDocumentSaved);
		
		//docIdRepository.save(fiscaDocumentKey);
		
		return "done doc id";
	}
	
//	@GetMapping(path = "/add") // Map ONLY GET Requests
//	public @ResponseBody String addNewBill(@RequestParam String number) {
//		Bill bill = new Bill();
//		bill.setNumber(number);
//		billRepository.save(bill);
//		return "Saved";
//	}

//	@GetMapping(path = "/all")
//	public @ResponseBody Iterable<Bill> getAllBills() {
//		return billRepository.findAll();
//	}

	@GetMapping(path = "/test") // Map ONLY GET Requests
	public @ResponseBody String test() {
		return "ok";
	}

}
