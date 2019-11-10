class Kolo {
    Punkt s;
    double r;
    public boolean Nalezy(Punkt p){
        return s.odl(p) <= r;
    }
    public Kolo(Punkt s, double r){
        this.s = s;
        this.r = r;
    }
}
