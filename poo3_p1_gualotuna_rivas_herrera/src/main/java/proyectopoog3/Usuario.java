package proyectopoog3;

public class Usuario {
    protected String codeUser;
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String usuario;
    protected String contraseña;
    protected String correo;
    

    //Setters de la clase

    public void setCodeUser(String codeUser){
        this.codeUser=codeUser;
    }

    public void setCedula(String cedula){
        this.cedula=cedula;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setUsuario(String usuario){
        this.usuario=usuario;
    }

    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

    

    //Getters de la clase

    public String getCodeUser(){
        return codeUser;
    }

    public String getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getUsuario(){
        return usuario;
    }

    public String getContraseña(){
        return contraseña;
    }

    public String getCorreo(){
        return correo;
    }


    
    //Metodos

    public void gestionarReserva(){

    }

    public void consultarReserva(){

    }

    public void enviarMail(){

    }

    public void generarCodeUser(){

    }


}
