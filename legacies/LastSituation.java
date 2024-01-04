package legacies;

import java.util.Scanner;

public class LastSituation extends MainLegac{

    Scanner scanner = new Scanner(System.in);
    public void GoLSit(){
        MainLegac mainLegac = new MainLegac();
        System.out.print("Начать круг заново?: y/n: ");
        mainLegac.setAnswer(scanner.nextLine());
        if(getAnswer().equalsIgnoreCase("n")){
            System.out.println("Завершаем");
        }
    }
}
