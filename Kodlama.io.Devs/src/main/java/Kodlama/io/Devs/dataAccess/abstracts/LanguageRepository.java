package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageRepository {
    List<ProgrammingLanguage> getAll();
    void add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
}
