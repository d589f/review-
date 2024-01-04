package Main;
//IMP

import legacies.FirstSituation;
import legacies.LastSituation;
import legacies.MainLegac;
import legacies.SecondSituation;

//
public class Main extends MainLegac {
    public static void main (String [] args){
        MainLegac mainLegac = new MainLegac();
        mainLegac.result = (int)(Math.random() * 100);
            if(mainLegac.result > 0 && mainLegac.result <= 40){
                FirstSituation firstSituation = new FirstSituation();
                firstSituation.GoFSit();
            }else if(mainLegac.result > 60 && mainLegac.result <= 100){
                SecondSituation secondSituation = new SecondSituation();
                secondSituation.GoSSit();
            }else if(mainLegac.result > 40 && mainLegac.result <= 60) {
                LastSituation lastSituation = new LastSituation();
                lastSituation.GoLSit();
            }
    }
}

