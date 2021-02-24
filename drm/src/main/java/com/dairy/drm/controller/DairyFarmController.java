package com.dairy.drm.controller;
import com.dairy.drm.model.DairyFarm;
import com.dairy.drm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DairyFarmController {

     @Autowired
    com.dairy.drm.service.DairyFarmService dairyFarmService;


    @RequestMapping("/login")
    public String getString () {
        return ("<HTML>" +
                "<head>" +
                "<title>Welcome Page</title>" +
                "<h1 style=\"color:green;\"> Welcome to Dairy Workers Management Page</h1>" +
                "</head>"+
                "<body>"+
                "</body>"+
                "</HTML?");
    }
    /* List<List<Object>> listOfLists = new ArrayList<>();
    JSONArray jsonArray = new JSONArray();
        for (List<Object> list : listOfLists) {
        JSONArray newArray = new JSONArray(list);
        jsonArray.put(newArray);
    }*/
   /* @GetMapping("/getAll")
    public List<List<Employee>> getFarmEmployee(){
        return dairyFarmService.getFarmEmployee();
    } */

    @GetMapping("/dairyFarm")
    public List<DairyFarm> get () {
          return  dairyFarmService.get();

    }

    @GetMapping("/dairyFarm/{FarmId}")
    public DairyFarm get(@PathVariable int FarmId) {

        return dairyFarmService.get(FarmId);
    }

    @PostMapping("/dairyFarm")
    public DairyFarm save(@RequestBody DairyFarm dairyFarm) {
        dairyFarmService.save(dairyFarm);
        return dairyFarm;
    }


    @PutMapping("/dairyFarm")
    public DairyFarm update(@RequestBody DairyFarm dairyFarm) {
        dairyFarmService.save(dairyFarm);
        return dairyFarm;
    }

    @DeleteMapping("/dairyFarm/{FarmId}")
    public String delete(@PathVariable int FarmId) {

        dairyFarmService.delete(FarmId);

        return "Dairy Farm removed with id "+FarmId;

    }

/*
    @Autowired
    com.dairy.drm.service.EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getter () {
        return  employeeService.get();

    }
*/


}



