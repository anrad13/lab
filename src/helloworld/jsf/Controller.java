package helloworld.jsf;

import javax.ejb.Stateful;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named (value = "controller")
//@ViewScoped
@RequestScoped
//@Stateful(passivationCapable=true)

public class Controller {

    private String text;
    private int firstOperand;
    private int secondOperand;
    private int total;

    public void calculateTotal(ActionEvent actionEvent) {
        total = firstOperand + secondOperand;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public int getTotal() {
        return firstOperand + secondOperand;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

