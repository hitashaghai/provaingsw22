package controller;

import view.View;
import model.Model;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Controller {

    private View v;
    private Model m;

    public Controller(View v, Model m){
        this.v=v;
        this.m=m;
        //this.v.addCalculateListener(new CalculateListener());

    }
}
