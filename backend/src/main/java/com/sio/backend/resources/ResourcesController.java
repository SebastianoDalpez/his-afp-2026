package com.sio.backend.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sio.backend.resources.pathology.PathologiesDTO;
import com.sio.backend.resources.pathology.PathologiesService;

import java.util.List;


@RestController  
@RequestMapping("/resources")
class ResourcesController {

    @Autowired
    private PathologiesService pathologiesService;
    

    @GetMapping("/pathologies")    //CHIAMATA GET
    public List<PathologiesDTO> getPathologies(){
        return pathologiesService.getAllPathologies();
    }

    @PostMapping("/patologies")
    public PathologiesDTO createPathologies(@RequestBody pathologiesDTO dto){
        return pathologiesService.createNewPathology(dto);
    }

    @DeleteMapping("/pathologies")
    public void deletePathologies(@RequestParam String code){
        pathologiesService.deletePathology(code)
    }

    
}
