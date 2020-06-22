package pl.pasz.springsecurity;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuatationAPI {

    private List<Quatation> quatations;

    public QuatationAPI() {
        this.quatations = new ArrayList<>();
        quatations.add(new Quatation("\"The greatest glory in living lies not in never falling, but in rising every time we fall.\"", "Nelson Mandela" ));
        quatations.add(new Quatation("\"The way to get started is to quit talking and begin doing.\"", "Walt Disney" ));

    }

    @GetMapping("/api/list")
    public List<Quatation> getListOfQuatations(){
        return quatations;
    }

    @PostMapping("/api/list")
    public boolean addQuatation(@RequestBody Quatation quation){
        return quatations.add(quation);
    }

    @DeleteMapping("api/list")
    public void deleteQuatation(@RequestParam int index){
        quatations.remove(index);
    }

}
