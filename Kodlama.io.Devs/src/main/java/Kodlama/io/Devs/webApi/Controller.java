package Kodlama.io.Devs.webApi;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/program")
public class Controller {
    private LanguageService languageService;

    @Autowired
    public Controller(LanguageService languageService){
        this.languageService=languageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        languageService.add(programmingLanguage);
    }

    @GetMapping("/delete")
    public void delete(ProgrammingLanguage programmingLanguage){
        languageService.delete(programmingLanguage);
    }

    @GetMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage){
        languageService.update(programmingLanguage);
    }

    @GetMapping("/getbyid")
    public void getById(int id){
        languageService.getByİd(id);
    }

}
