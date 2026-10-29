package com.sio.backend.resources.pathologies;



@Service
public class PathologiesService {
    @Autowired //notazione che ... DA FINIRE
    private PathologiesRepository repo;


    @Autowired
    private pathologiesMapper mapper; 

    public List<PathologiesDTO> getAllPathologies(){
        List<Pathologies> list = repo.findAll();
        List<PathologiesDTO> dtos = new ArrayList<>();

        for(pathologies e : List)
    }

    public List<PathologiesDTO> createNewPathology(Pathologies){   //funzione che salva l'oggetto inviato dall'utente dentro il DB??? DA FINIRE
        Pathologies entity = mapper.toEntity(dto); //viene trasformato il DTO in entity così che possa essere salvata nel DB
        entity = repo.save(entity); //salva l'entity: l'entity viene passata al repo, il quale la salva nel DB
    
        return mapper.toDTO(entity); //restituisco il DTO all'utente; dev'essere ristrasformato in DTO perchè un'entity non può "uscire", ma solo un DTO
    }

    public void deletePathology(String code){
        repo.deleteById(code);
    }

    public void editPathology(PathologiesDTO dto){
        Optional<Pathologies> entity = repo.findById(dto.code());
        
        if (entity.isEmp)
    }
}

