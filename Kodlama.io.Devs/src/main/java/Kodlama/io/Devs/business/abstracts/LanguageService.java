package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void getByİd(int id);
}
