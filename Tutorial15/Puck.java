package Tutorial15;

class Puck {
    private String name;
    private int intvalue;
    private int strvalue;
    private int agivalue;
    private String ability1;
    private String ability2;
    private String ability3;
    private String ability4;

    public void setName(String name) {
        this.name = name;
    }

    public void setIntvalue(int intvalue) {
        this.intvalue = intvalue;
    }

    public void setStrvalue(int strvalue) {
        this.strvalue = strvalue;
    }

    public void setAgivalue(int agivalue) {
        this.agivalue = agivalue;
    }

    String getName() {
        return name;
    }

    int getIntvalue() {
        return intvalue;
    }

    int getStrvalue() {
        return strvalue;
    }

    int getAgivalue() {
        return agivalue;
    }


    void illusoryOrb() {
        System.out.println("Firing an illusory orb!");

    }

    void waningRift() {
        System.out.println("Silence!");

    }

    void phaseShift() {
        System.out.println("See ya in the spring!");

    }

    void dreamCoil() {
        System.out.println("Don't move!");
    }

}

class PuckApp {
    public static void main(String[] args) {

        Puck puck = new Puck();
        puck.setName("Puck");

        String puck_name = puck.getName();
        int puck_int = puck.getIntvalue();
        int puck_str = puck.getStrvalue();
        int puck_agi = puck.getAgivalue();

        System.out.println(puck_name);
        puck.illusoryOrb();
        puck.waningRift();
        puck.phaseShift();
        puck.dreamCoil();

    }
}
