package aula6;

public class Time {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Time(){}//para atribuir 0 a todos os atributos(hora, minuto..)
    
    public Time(int hora, int minuto, int segundo){
//      this.hora = hora;
//      this.minuto = minuto;
//      this.segundo = segundo;
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }
    
    public void setHora(int hora){
        if(hora>=0 && hora<=23){
            this.hora = hora;
        }
    }
    public int getHora(){
        return hora;
    }
    
    public void setMinuto(int minuto){
        if(minuto>=0 && minuto<=59){
            this.minuto = minuto;
        }
    }
    public int getMinuto(){
        return minuto;
    }
    
    public void setSegundo(int segundo){
        if(segundo>=0 && segundo<=59){
            this.segundo = segundo;
        }
    }
    public int getSegundo(){
        return segundo;
    }
    
    
    public String visualizarHoraUniversal(){
        String.format("%02d:%02d:%02d horas", hora, minuto, segundo);
    }
    public String visualizarHoraAmPm(){
        String AmPm = "AM";
        int horaInterna = hora;
        
        if(horaInterna > 12){
            horaInterna = (horaInterna%13)+1;
            AmPm = "PM";
        }
        
        return String.format("%02d:%02d:%02d horas %s", horaInterna, minuto, segundo, AmPm);
    }
    
}
