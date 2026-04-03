public interface DocBuilder {
    void addheader();
    void addfooter();
    void addbody();
    String getDoc();
}

class FormalDocBuilder implements DocBuilder{

    @Override
    public void addheader() {
        System.out.println("Formal Header added");
    }

    @Override
    public void addfooter() {
        System.out.println("Formal Footer added");
    }

    @Override
    public void addbody() {
        System.out.println("Formal Body added");
    }

    @Override
    public String getDoc() {
        return "Formal Doc returned";
    }
}


class InformalDocBuilder implements DocBuilder{

    @Override
    public void addheader() {
        System.out.println("InFormal Header added");
    }

    @Override
    public void addfooter() {
        System.out.println("InFormal Footer added");
    }

    @Override
    public void addbody() {
        System.out.println("InFormal Body added");
    }

    @Override
    public String getDoc() {
        return "InFormal Doc returned";
    }
}