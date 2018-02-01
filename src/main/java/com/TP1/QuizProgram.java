package com.TP1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class QuizProgram {

	public static void main(String[] args) {

        System.out.println("Choisissez une option : ");
        System.out.println(" - 1 : Version classique (CMMQuizz)");
        System.out.println(" - 2 : Version Spring avec injection de dépendance par constructeur");
        System.out.println(" - 3 : Version Spring avec injection de dépendance par setter");
        System.out.println(" - 4 : Exit");

        boolean cont = true;

        Scanner scanner = new Scanner(System.in);
        
        while (cont) {
            
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    // Version original :
                    QuizzMasterService quizMasterService = new QuizzMasterService();
                    cont = false;
                    break;
                case 2:
                    // Version avec injection via constructeur :
                    ApplicationContext context1 = new ClassPathXmlApplicationContext("com.TP1.QuizzMasterV1.xml");
                    context1.getBean("quizzmaster");
                    cont = false;
                    break;
                case 3:
                    // Version avec injection via setter :
                    ApplicationContext context2 = new ClassPathXmlApplicationContext("com/TP1/QuizzMasterV2.xml");
                    context2.getBean("quizzmaster");
                    cont = false;
                    break;
                case 4:
                    cont = false;
                    break;
                default:
                    System.out.println("Choix incorrect !");
                    break;
            }            
        }
    	scanner.close();
    }

}
