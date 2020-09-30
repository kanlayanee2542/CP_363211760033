package execise;

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private int carenginesize;
    private int maxspeed;
    private String countryoforigin;

    public SuperCar(){}

    public SuperCar(String b,String c,int s,int m,String ct){
        carbrand = b;
        carcolor = c;
        carenginesize = s;
        maxspeed = m;
        countryoforigin = ct;
    }
     public String getCarbrand(){
        return carbrand;
     }
     public void setCarbrand(String b){
        carbrand = b;
    }
    public String getCarcolor(){
         return carcolor;
    }
    public void setCarcolor(String c){
         carcolor = c;
    }
    public int getCarenginesize(){
         return carenginesize;
    }
    public void setCarenginesize(int s){
         carenginesize = s;
    }
    public int getMaxspeed(){
         return maxspeed;
    }
    public void setMaxspeed(int m){
         maxspeed = m;
    }
    public String getCountryoforigin(){
         return countryoforigin;
    }
    public void setCountryoforigin(String ct){
         countryoforigin = ct;
    }



}//class
