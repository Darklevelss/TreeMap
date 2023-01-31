package co.edu.uptc.presentacion;

import co.edu.uptc.logica.control.Controller;

import java.util.Map;
import java.util.Scanner;

public class Console {
    Scanner sc = new Scanner(System.in);
    int op = 6;
    Controller controller = new Controller();

    public void menu() {
        do {
            System.out.println("""
                    <<<<menú>>>>
                    1.mostrar treemap
                    2.añadir al treemap
                    3.borrar un elemento del treemap
                    0.salir
                    """);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    mostrarTreeMap();
                    break;
                case 2:
                    Integer id=null;
                    String nombre=null;
                    do {
                        System.out.println("ingrese un id");
                        id=sc.nextInt();
                        System.out.println("ingrese un nombre");
                        nombre=sc.nextLine();
                    controller.add(id,nombre);
                    if(!controller.add(id,nombre)){
                        System.out.println("ingrese valores con sentido");
                    }
                    }while(!controller.add(id,nombre));
                    break;
                case 3:
                    do {
                        System.out.println("ingrese un id");
                        id=sc.nextInt();
                        controller.deleteById(id);
                        if(!controller.deleteById(id)){
                            System.out.println("ingrese valores con sentido");
                        }
                    }while(!controller.deleteById(id));
                    break;

            }

        } while (op != 0);
    }

    private void mostrarTreeMap() {
        /*for (var i=0;i<controller.getTreeMap().size();i++) {
            System.out.println(controller.getTreeMap().get(i).);
        }

    }
}
