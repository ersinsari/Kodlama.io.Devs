package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;
    List<ProgrammingLanguage> programmingLanguages;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository,List<ProgrammingLanguage> programmingLanguages){
      this.languageRepository=languageRepository;
      this.programmingLanguages=programmingLanguages;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        for(ProgrammingLanguage i:programmingLanguages){
            if(!(i.getName().isEmpty())){
                if(i.getName().equals(programmingLanguage.getName())){
                    throw new Exception("bu isim kullanılmıştır: "+programmingLanguage.getName());
                }
                languageRepository.add(programmingLanguage);
            }
            throw new Exception("bu alan boş olamaz");
        }
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage){
        languageRepository.delete(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage){
        languageRepository.update(programmingLanguage);
    }

    @Override
    public void getByİd(int id){
        languageRepository.getById(id);
    }
}
