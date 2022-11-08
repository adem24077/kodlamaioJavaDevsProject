package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Go"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Kotlin"));
		programmingLanguages.add(new ProgrammingLanguage(4, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(5, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void delete(int id) throws Exception {
		ProgrammingLanguage programmingLanguage1 = getById(id);
		programmingLanguages.remove(programmingLanguage1);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception {
		ProgrammingLanguage programmingLanguage1 = getById(programmingLanguage.getId());
		programmingLanguage1.setName(programmingLanguage.getName());
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		throw new Exception("Verilen id değerinde kayıt bulunamadı.");
	}

}
