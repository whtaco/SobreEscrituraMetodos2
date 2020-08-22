/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodos2;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.ArrayList;

class Vehiculo{
    private String marca;
    private String tecnologia;
    private int modelo;
    
    private String nombrePropietario;
    private int cedulaPropietario;
    private int edadPropietario;
    public Vehiculo(){
        marca="";
        tecnologia="";
        modelo=0;
        nombrePropietario="";
        cedulaPropietario=0;
        edadPropietario=0;
    }
    public Vehiculo(String nombrePropietario,int cedulaPropietario,int edadPropietario,String marca, String tecnologia, int modelo){
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.modelo=modelo;
        this.nombrePropietario=nombrePropietario;
        this.cedulaPropietario=cedulaPropietario;
        this.edadPropietario=edadPropietario;
    }
    public String getMarca(){
        return marca;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public int getModelo(){
        return modelo;
    }
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public int getCedulaPropietario(){
        return cedulaPropietario;
    }
    public int getEdadPropietario(){
        return edadPropietario;
    }
    
}
class Automovil extends Vehiculo{
    private String matriculaAutomovil;
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String nombrePropietario,int cedulaPropietario,int edadPropietario, String marca, String tecnologia, int modelo){
        super(nombrePropietario,cedulaPropietario,edadPropietario,marca,tecnologia,modelo);
        matriculaAutomovil="Desconocido";
    }
    public void setMatriculaAutomovil(String matriculaAutomovil){
        this.matriculaAutomovil=matriculaAutomovil;
    }
    public String getMatriculaAutomovil(){
        return matriculaAutomovil;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automovil:\nMARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "\nMATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil());
    }
    public void mostrarDatos1(){
        System.out.println("Datos del Propietario del Vehiculo:"+getMarca()+"\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getCedulaPropietario()+
                "\nEDAD: "+getEdadPropietario());
    }
    
}
class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;
    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia; 
    }
    public AutomovilAutonomo(String nombrePropietario,int cedulaPropietario,int edadPropietario, String marca,String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia){
        super(nombrePropietario,cedulaPropietario,edadPropietario,marca,tecnologia,modelo);
        this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public Calendar getFechaComienzoFabricacionAutonomia(){
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automovil Autonomo:\nMARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                " \nMATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil()+"\nFECHA DE FABRICACION: "
               +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
    
    public void mostrarDatos1(){
        System.out.println("Datos del Propietario del Vehiculo:"+getMarca()+"\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getCedulaPropietario()+
                "\nEDAD: "+getEdadPropietario());
    }
} 

class ListadoAutomoviles{
    private ArrayList<Automovil>ListadoAutomoviles;
    //Constructor
    public ListadoAutomoviles(){
        ListadoAutomoviles=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoAutomoviles.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        //System.out.println("DATOS DE LOS AUTOMOVILES EXISTENTE EN EL LISTADO: \n");
        for(Automovil ObjetoTmp:ListadoAutomoviles){//Uso de for extendido
            ObjetoTmp.mostrarDatos();{
            
            }
           
        }
        
    }
    
}

class ListadoPropietarios{
    private ArrayList<Automovil>ListadoPropietarios;
    //Constructor
    public ListadoPropietarios(){
        ListadoPropietarios=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoPropietarios.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("DATOS DE LOS PROPIETARIOS EXISTENTE EN EL LISTADO: \n");
        for(Automovil ObjetoTmp:ListadoPropietarios){//Uso de for extendido
            ObjetoTmp.mostrarDatos1();{
            }
        }
    }  
}
public class SobreEscrituraMetodos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE ");
        System.out.println("\t\tSEDE LATACUNGA");
        System.out.println("Integrantes: William Taco y Dario Chisaguano");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Asignatura: Programación [7450]");
        
        int menu=0;
        int auto=0;
        int propietario=0;
          
        while(menu<=1||menu<=2){
            menu= Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Menú \n"
        +"1. Datos de los vehículos\n"
        +"2. Datos de los propietarios\n"
        +"3. Salir\n"            
        +"***Seleccione una opción***\n"));
            System.out.println("****************************************");
            switch (menu){
            case 1: JOptionPane.showMessageDialog(null, "La opción es Datos de los Vehículos");
                
            auto= Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Datos del Vehículo \n"
        +"1. Datos del Vehículo Ford\n"
        +"2. Datos del Vehículo Nissan\n"
        +"***Seleccione una opción***\n"));
            System.out.println("****************************************");    
            switch (auto){
                case 1: JOptionPane.showMessageDialog(null, "La opción es Datos del Vehículo Ford");
                Automovil automovil1=new Automovil("",0,0,"Ford ","TECNOLOGIA: Canadiense ",2018);
                automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");
                ListadoAutomoviles listado1 = new ListadoAutomoviles();
                listado1.addAutomovil(automovil1);
                listado1.Listar();
                break;
            
            case 2: JOptionPane.showMessageDialog(null, "La opción es Datos del Vehículo Nissan");
                Calendar fecha1= Calendar.getInstance();
                fecha1.set(2019,10,22);//Los meses van de 0 a 11, luego 10 representa noviembre
                AutomovilAutonomo autonomo1 = new AutomovilAutonomo("",0,0,"Nissan",
                "TECNOLOGIA EUROPEA",2020,fecha1);
                ListadoAutomoviles listado2 = new ListadoAutomoviles();
                listado2.addAutomovil(autonomo1);
                listado2.Listar();
                break;
            
            }
            break;
            case 2: JOptionPane.showMessageDialog(null, "La opción es Datos de los Propietarios");
                
            propietario= Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a Datos del Propietario \n"
        +"1. Datos del Propietario 1\n"
        +"2. Datos del Propietario 2\n"
        +"***Seleccione una opción***\n"));
            System.out.println("****************************************");    
            switch (propietario){
                case 1: JOptionPane.showMessageDialog(null, "La opción es Datos del Propietario 1");
                
                Automovil automovil2=new Automovil("WILLIAM TACO",1724109341,22,"Ford","",0);
                ListadoPropietarios listado3=new ListadoPropietarios();
                listado3.addAutomovil(automovil2);
                listado3.Listar();
                break;
            
            case 2: JOptionPane.showMessageDialog(null, "La opción es Datos del Propietario 2");
                Automovil autonomo2=new Automovil("DARIO CHISAGUANO",550452808,18,"Nissan","",0);
                ListadoPropietarios listado4=new ListadoPropietarios();
                listado4.addAutomovil(autonomo2);
                listado4.Listar();
                break;
            }    
            break;
            case 3: JOptionPane.showMessageDialog(null, "La opción es Salir");
            break;
        }
        }
    }
    
}

