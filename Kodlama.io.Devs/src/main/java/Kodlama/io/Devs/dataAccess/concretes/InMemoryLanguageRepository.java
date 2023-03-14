package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    private List<ProgrammingLanguage> programmingLanguages;

    public InMemoryLanguageRepository(){
        programmingLanguages=new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"java"));
        programmingLanguages.add(new ProgrammingLanguage(2,"c#"));
        programmingLanguages.add(new ProgrammingLanguage(3,"python"));
        programmingLanguages.add(new ProgrammingLanguage(1,"java"));

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.remove(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.set(programmingLanguages.indexOf(programmingLanguage),programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguages.get(id);
    }
}
