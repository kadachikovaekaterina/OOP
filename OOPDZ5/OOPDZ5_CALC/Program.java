package OOPDZ5_CALC;

import OOPDZ5_CALC.Controllers.UserController;
import OOPDZ5_CALC.Model.Calc;
import OOPDZ5_CALC.Model.CalcImpl;
import OOPDZ5_CALC.Model.LogManager;
import OOPDZ5_CALC.Views.ViewCalc;

public class Program {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        UserController userController = new UserController(calc);
        LogManager logManager = new LogManager("OOPDZ5_CALC/Log.log");
        ViewCalc viewCalc = new ViewCalc(userController, logManager);
        viewCalc.run();
    }
}
