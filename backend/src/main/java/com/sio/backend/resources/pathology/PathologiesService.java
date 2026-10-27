
@Service
public class PathologiesService {
    @Autowired //notazione che ... DA FINIRE
    private PathologiesRepository repo;


    @Autowired
    private PathologiesMapper mapper; 

    public List<PathologiesDTO> getAllPathologies(){
        List<Pathologies> list = repo.findAll();
    }
}
