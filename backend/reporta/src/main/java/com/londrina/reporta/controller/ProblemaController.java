package com.londrina.reporta.controller;

    import com.londrina.reporta.model.Problema;
    import com.londrina.reporta.repository.ProblemaRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

@RestController
@RequestMapping("/api/problemas")
@CrossOrigin(origins = "*")
public class ProblemaController {
    
    @Autowired
    private ProblemaRepository problemaRepository;


    @GetMapping
    public List<Problema> listaProblemas(){
        return problemaRepository.findAll();
    }

    @PostMapping
    public Problema criarProblema(@RequestBody Problema problema){
        return problemaRepository.save(problema);

    }
}
