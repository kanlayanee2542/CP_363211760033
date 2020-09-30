package execise;

import java.security.interfaces.RSAPrivateCrtKey;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar spc1 = new SuperCar();

        spc1.setCarbrand("BMW");
        spc1.setCarcolor("pink");
        spc1.setCarenginesize(2300);
        spc1.setMaxspeed(145);
        spc1.setCountryoforigin("Germany");

        displayDataObject(spc1);

        SuperCar spc2 = new SuperCar();

        spc2.setCarbrand("BMW");
        spc2.setCarcolor("black");
        spc2.setCarenginesize(2500);
        spc2.setMaxspeed(150);
        spc2.setCountryoforigin("Germany");

        displayDataObject(spc2);

        SuperCar spc3 = new SuperCar();

        spc3.setCarbrand("BMW");
        spc3.setCarcolor("red");
        spc3.setCarenginesize(2000);
        spc3.setMaxspeed(155);
        spc3.setCountryoforigin("Germany");

        displayDataObject(spc3);


        SuperCar spc4 = new SuperCar();

        spc4.setCarbrand("BMW");
        spc4.setCarcolor("red black");
        spc4.setCarenginesize(2550);
        spc4.setMaxspeed(145);
        spc4.setCountryoforigin("Germany");

        displayDataObject(spc4);

        SuperCar spc5 = new SuperCar();

        spc5.setCarbrand("BMW");
        spc5.setCarcolor("yellow");
        spc5.setCarenginesize(2600);
        spc5.setMaxspeed(160);
        spc5.setCountryoforigin("Germany");

        displayDataObject(spc5);



    }//main

    private static void displayDataObject(SuperCar spc) {
        System.out.println(spc.getCarbrand());
        System.out.println(spc.getCarcolor());
        System.out.println(spc.getCarenginesize());
        System.out.println(spc.getMaxspeed());
        System.out.println(spc.getCountryoforigin());
    }
}//class
