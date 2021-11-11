package com.company;

public class Main {

    public static void main(String[] args) {
        Model m= new Model();
        Controller controller=new Controller();
        View view=new View();
        m.x=1000;
        m.y=2000;
        int result=controller.summ(m.x, m.y);
        view.displey(result);

	// write your code here
    }
}
