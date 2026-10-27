import com.sio.backend.resources.pathology.Pathologies;

@
public class pathologiesMapper {
    public PathologiesDTO toDTO(Pathologies entity){
        if(entity == null) return null; 
        
        return new pathologiesDTO()(
            entity.getCode();
            entity.getDescription();
        )
    }

    public PathologiesDTO toEntity(PathologiesDTO dto){
        if(DTO == null) return null; 

        Pathologies entity = new Pathologies(); // usando il costruttore? si crea una nuova istanza di quell'entità
        entity.setCode(dto.code());
        entity.setDescription(dto.description());
    }

}
