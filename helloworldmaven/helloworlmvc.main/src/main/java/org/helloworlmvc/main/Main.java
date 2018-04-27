package org.helloworlmvc.main;

import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {

    public static void main(String[] args) {
        new Controller(new View(), new Model()).run();
        
    }

}
