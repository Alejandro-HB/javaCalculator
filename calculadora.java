import java.awt.*;
import java.awt.event.*;

public class calculadora{
    public static void main(String[] args){
        GUI calculadora=new GUI();
    }
}
class GUI{
    //Atributos
    Frame mi_frame;
    Panel panel_superior, panel_medio, panel_inferior;
    //Definir componentes
    TextField display=new TextField();
    Label cadena=new Label();
    Button btn_0=new Button("0");
    Button btn_1=new Button("1");
    Button btn_2=new Button("2");
    Button btn_3=new Button("3");
    Button btn_4=new Button("4");
    Button btn_5=new Button("5");
    Button btn_6=new Button("6");
    Button btn_7=new Button("7");
    Button btn_8=new Button("8");
    Button btn_9=new Button("9");
    Button btn_punto=new Button(".");
    Button btn_suma=new Button("+");
    Button btn_resta=new Button("-");
    Button btn_mult=new Button("*");
    Button btn_div=new Button("/");
    Button btn_borrar=new Button("CE");
    Button btn_igual=new Button("=");
    //Variables necesarias para el contros de las operaciones
    float dato1;
    float dato2;
    boolean suma=false;
    boolean resta=false;
    boolean mult=false;
    boolean div=false;
    boolean operacion=false;//Sirve para decidir si el valor escrito se asigna a dato1 o dato2
    String aux="";
    public GUI(){
        //Creamos los paneles
        construir_panel_superior();//Label y display
        construir_panel_medio();//Botones numericos y de operacion
        construir_panel_inferior();//Boton igual
        //Crear el contenedor
        mi_frame=new Frame("Calculadora basica");
        mi_frame.setLayout(new GridLayout(3,1,2,2));//Grid 3x1 y 2px de separacion
        //Anadir los paneles al Frame
        mi_frame.add(panel_superior);
        mi_frame.add(panel_medio);
        mi_frame.add(panel_inferior);
        //Configuraciones adicionales del Frame
        mi_frame.setSize(350,600);
        mi_frame.setVisible(true);
        //Asignaar los metodos para atender los eventos necesarios
        btn_0.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"0");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"0");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"1");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"1");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"2");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"2");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_3.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"3");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"3");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_4.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"4");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"4");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_5.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"5");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"5");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_6.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"6");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"6");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_7.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"7");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"7");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_8.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"8");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"8");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_9.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(operacion){
                        display.setText(display.getText()+"9");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+"9");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_punto.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //Evitar poner 2 puntos en un valor
                    if(display.getText().contains("."))
                        return;
                    if(operacion){
                        display.setText(display.getText()+".");
                        dato2=Float.parseFloat(display.getText());
                    }
                    else{
                        display.setText(display.getText()+".");
                        dato1=Float.parseFloat(display.getText());
                    }
                }
            }
        );
        btn_suma.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    display.setText("");
                    operacion=true;
                    suma=true;
                    resta=false;
                    mult=false;
                    div=false;
                }
            }
        );
        btn_resta.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    display.setText("");
                    operacion=true;
                    suma=false;
                    resta=true;
                    mult=false;
                    div=false;
                }
            }
        );
        btn_mult.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    display.setText("");
                    operacion=true;
                    suma=false;
                    resta=false;
                    mult=true;
                    div=false;
                }
            }
        );
        btn_div.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    display.setText("");
                    operacion=true;
                    suma=false;
                    resta=false;
                    mult=false;
                    div=true;
                }
            }
        );
        btn_igual.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    float resultado=0;
                    if(suma){
                        resultado=dato1+dato2;
                        aux=String.valueOf(dato1)+"+"+String.valueOf(dato2);
                    }
                    else if(resta){
                        resultado=dato1-dato2;
                        aux=String.valueOf(dato1)+"-"+String.valueOf(dato2);
                    }
                    else if(mult){
                        resultado=dato1*dato2;
                        aux=String.valueOf(dato1)+"*"+String.valueOf(dato2);
                    }
                    else if(div){
                        resultado=dato1/dato2;
                        aux=String.valueOf(dato1)+"/"+String.valueOf(dato2);
                    }
                    cadena.setText(aux);
                    display.setText(String.valueOf(resultado));
                    operacion=false;
                    dato1=resultado;
                }
            }
        );
        btn_borrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    display.setText("");
                    cadena.setText("");
                    dato1=0;
                    dato2=0;
                    operacion=false;
                }
            }
        );
        //Asignar el metodo para atender el boton de cerrar ventana
        mi_frame.addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent evt){
                    System.exit(0);
                }
        }
        );
    }//Fin del constructor GUI

    //Metodos
    void construir_panel_superior(){
        panel_superior=new Panel();
        panel_superior.setLayout(new GridLayout(2,1,2,2));//Grid 2x1 y 2px de separacion
        panel_superior.add(cadena);
        panel_superior.add(display);
    }
    void construir_panel_medio(){
        panel_medio=new Panel();
        panel_medio.setLayout(new GridLayout(4,4,2,2));//Grid 4x4 y 2px de separacion
        panel_medio.add(btn_7);
        panel_medio.add(btn_8);
        panel_medio.add(btn_9);
        panel_medio.add(btn_suma);
        panel_medio.add(btn_4);
        panel_medio.add(btn_5);
        panel_medio.add(btn_6);
        panel_medio.add(btn_resta);
        panel_medio.add(btn_1);
        panel_medio.add(btn_2);
        panel_medio.add(btn_3);
        panel_medio.add(btn_mult);
        panel_medio.add(btn_borrar);
        panel_medio.add(btn_0);
        panel_medio.add(btn_punto);
        panel_medio.add(btn_div);
    }
    void construir_panel_inferior(){
        panel_inferior=new Panel();
        panel_inferior.setLayout(new GridLayout());
        panel_inferior.add(btn_igual);
    }
}//Fin de la clase GUI