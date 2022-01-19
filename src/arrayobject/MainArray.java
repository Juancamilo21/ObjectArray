package arrayobject;

import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
        int option, index;
        long ID;
        Scanner sc = new Scanner(System.in);
        Array array = new Array();
        System.out.print("Ingesa el tamaño:\t");
        int size = sc.nextInt();
        array.setSize(size);
        do {
            System.out.println("Selecciona una opción");
            System.out.println("1. Agrega una persona");
            System.out.println("2. Mostrar datos del arreglo");
            System.out.println("3. Buscar una persona");
            System.out.println("4. Eliminar una persona");
            System.out.println("5. Limpiar arreglo");
            System.out.println("6. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    if (array.getPosition() != array.getSize()) {
                        Person person = new Person();
                        System.out.print("Ingresa el nombre:\t");
                        String name = sc.next();
                        person.setName(name);
                        System.out.print("Ingresa el apellido:\t");
                        String lastname = sc.next();
                        person.setLastname(lastname);
                        System.out.print("Ingresa la edad:\t");
                        int age = sc.nextInt();
                        person.setAge(age);
                        System.out.print("Ingresa el id:\t");
                        long id = sc.nextLong();
                        person.setId(id);
                        array.add(person);
                    } else System.out.println("Arreglo lleno");
                    break;

                case 2:
                    if (!array.empty()) {
                        System.out.println("Datos de las personas registradas\n");
                        for (int i = 0; i < array.getPosition(); i++) {
                            System.out.println("Nombre:\t" + array.print(i).getName());
                            System.out.println("Apellido:\t" + array.print(i).getLastname());
                            System.out.println("Edad:\t" + array.print(i).getAge());
                            System.out.println("Id:\t" + array.print(i).getId());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if (!array.empty()) {
                        System.out.print("Ingresa el id de la persona:\t");
                        ID = sc.nextLong();
                        index = array.search(ID);
                        if (index != -1) {
                            System.out.println("Nombre:\t" + array.print(index).getName());
                        }else System.out.println("Persona no registrada");
                    }
                    break;

                case 4:
                    if (!array.empty()) {
                        System.out.print("Ingresa el id de la persona a eliminar:\t");
                        ID = sc.nextLong();
                        index = array.search(ID);
                        if (index != -1) {
                            array.remove(index);
                            System.out.println("Se ha eliminado");
                        }else System.out.println("Persona no registrada");
                    }
                    break;

                case 5:
                    if (array.empty()){
                        System.out.println("Está vacío");
                    }else array.clean();
                    break;
            }
        } while (option != 6);

    }
}
