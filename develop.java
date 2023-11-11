class Hora {
    int horas;
    int minutos;
    int segundos;

    Hora() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    Hora(int h, int m, int s) {
        horas = h;
        minutos = m;
        segundos = s;
    }

    void visualizarHora() {
        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
    }

    void sumarHoras(Hora hora1, Hora hora2) {
        horas = hora1.horas + hora2.horas;
        minutos = hora1.minutos + hora2.minutos;
        segundos = hora1.segundos + hora2.segundos;

        if (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }

        if (minutos >= 60) {
            minutos -= 60;
            horas++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(10, 30, 45);
        Hora hora2 = new Hora(5, 25, 15);
        Hora hora3 = new Hora();

        System.out.println("Hora 1: ");
        hora1.visualizarHora();
        System.out.println();

        System.out.println("Hora 2: ");
        hora2.visualizarHora();
        System.out.println();

        hora3.sumarHoras(hora1, hora2);

        System.out.println("Hora 3 (suma de Hora 1 y Hora 2): ");
        hora3.visualizarHora();
        System.outsuma.println de Hora();
    1 }
} y Hora

2. 
class Empleado:
    def __init__(self):
        self.nombre = ''
        self.numero_empleado = 0

    def leerDatos(self):
        self.nombre = input('Ingrese el nombre del empleado: ')
        self.numero_empleado = int(input('Ingrese el número de empleado: '))

    def verDatos(self):
        print('Nombre del empleado: {self.nombre}')
        print('Número de empleado: {self.numero_empleado}')


empleado1 = Empleado()
empleado1.leerDatos()
empleado1.verDatos()

3.
import java.util.Scanner;

class Empleado {
    private String nombre;
    private int numero_empleado;

    public Empleado(String nombre, int numero_empleado) {
        this.nombre = nombre;
        this.numero_empleado = numero_empleado;
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Número de empleado: " + numero_empleado);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el número de empleado " + (i + 1) + ":");
            int numero_empleado = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer del Scanner

            empleados[i] = new Empleado(nombre, numero_empleado);
        }

        System.out.println("\nDatos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println();
        }
    }
}
4.
  public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void avanzar() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas = (horas + 1) % 24;
            }
        }
    }

    public void ponerACero() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public void visualizar() {
        System.out.printf("La hora actual es: %02d:%02d:%02d\n", horas, minutos, segundos);
    }
}
5.
public class Cadena {
    private int longitud;
    private String cadenaActual;

    public Cadena(String cadena) {
        this.cadenaActual = cadena;
        this.longitud = cadena.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getCadenaActual() {
        return cadenaActual;
    }

    public void setCadenaActual(String cadenaActual) {
        this.cadenaActual = cadenaActual;
    }

    public char caracter(int i) {
        if (i < 0 || i >= longitud) {
            return (char) -1;
        }
        return cadenaActual.charAt(i);
    }

    public void visualizar() {
        System.out.println("La cadena actual es: " + cadenaActual);
    }
}
6.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class LAN {
    protected ArrayList<Nodo> nodos;
    protected Map<String, Nodo> mapaNodos;

    public LAN() {
        nodos = new ArrayList<>();
        mapaNodos = new HashMap<>();
    }

    public void addNodo(Nodo nodo) {
        nodos.add(nodo);
        mapaNodos.put(nodo.getId(), nodo);
    }

    public void removeNodo(String id) {
        Nodo nodo = mapaNodos.get(id);
        if (nodo != null) {
            nodos.remove(nodo);
            mapaNodos.remove(id);
        }
    }

    public void sendPackage(String idSource, String idDest, Package package) {
        Nodo nodoSource = mapaNodos.get(idSource);
        Nodo nodoDest = mapaNodos.get(idDest);
        if (nodoSource != null && nodoDest != null) {
            nodoSource.sendPackage(nodoDest, package);
        }
    }

    public void broadcastPackage(String idSource, Package package) {
        Nodo nodoSource = mapaNodos.get(idSource);
        if (nodoSource != null) {
            for (Nodo nodo : nodos) {
                if (!nodo.getId().equals(idSource)) {
                    nodoSource.sendPackage(nodo, package);
                }
            }
        }
    }

    public void statistics() {
        // Calcular estadísticas
    }
}

public class Nodo {
    private String id;
    private String name;
    private LAN lan;

    public Nodo(String id, String name, LAN lan) {
        this.id = id;
        this.name = name;
        this.lan = lan;
    }

    public void sendPackage(Nodo dest, Package package) {
        // Enviar paquete a dest
    }
}

public class Package {
    private byte[] data;
    private int size;

    public Package(byte[] data, int size) {
        this.data = data;
        this.size = size;
    }
}
7.
public abstract class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(String id, String nombre, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public abstract void calcularSalario();
    public abstract void despedir();
    public abstract void promocionar();
    public abstract void darDeAlta();
    public abstract void jubilar();
}

public abstract class EmpleadoCategoriaA extends Empleado {
    private double aumentoSalarial;
    private double primaProductividad;

    public EmpleadoCategoriaA(String id, String nombre, String cargo, double salario, double aumentoSalarial, double primaProductividad) {
        super(id, nombre, cargo, salario);
        this.aumentoSalarial = aumentoSalarial;
        this.primaProductividad = primaProductividad;
    }

    public abstract void calcularAumentoSalarial();
    public abstract void calcularPrimaProductividad();
}

public abstract class EmpleadoCategoriaB extends EmpleadoCategoriaA {
    public EmpleadoCategoriaB(String id, String nombre, String cargo, double salario, double aumentoSalarial, double primaProductividad) {
        super(id, nombre, cargo, salario, aumentoSalarial, primaProductividad);
    }
}

public abstract class EmpleadoCategoriaC extends EmpleadoCategoriaA {
    public EmpleadoCategoriaC(String id, String nombre, String cargo, double salario, double aumentoSalarial, double primaProductividad) {
        super(id, nombre, cargo, salario, aumentoSalarial, primaProductividad);
    }
}

public class EmpleadoAdministrativo extends Empleado {
    public EmpleadoAdministrativo(String id, String nombre, String cargo, double salario) {
        super(id, nombre, cargo, salario);
    }

    
    public void calcularSalario() {
        
    }

    
    public void despedir() {
        
    }

    
    public void promocionar() {
        
    }

    
    public void darDeAlta() {
        
    }

    
    public void jubilar() {
        
    }
}

public class EmpleadoCategoriaAAdministrativo extends EmpleadoCategoriaA {
    public EmpleadoCategoriaAAdministrativo(String id, String nombre, String cargo, double salario, double aumentoSalarial, double primaProductividad) {
        super(id, nombre, cargo, salario, aumentoSalarial, primaProductividad);
    }

    
    public void calcularAumentoSalarial() {
        
    }

    
    public void calcularPrimaProductividad() {
        
    }
}

public abstract class AccesoEmpleado {
    protected Empleado empleado;

