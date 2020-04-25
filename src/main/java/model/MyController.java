package model;

import controller.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyModel model;

    @RequestMapping(value="/demo",method = RequestMethod.GET)
    public String sayHello(){
        model.setName("Cross Domain Knowledge sharing");
        return model.toString();
    }
}
