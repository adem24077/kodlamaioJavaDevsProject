package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public interface ProgrammingLanguageRepository {

	void add(ProgrammingLanguage programmingLanguage) throws Exception;

	void delete(int id) throws Exception;

	void update(ProgrammingLanguage programmingLanguage, int id) throws Exception;

	ProgrammingLanguage getById(int id) throws Exception;

	List<ProgrammingLanguage> getAll();

}
