public class paciente implements Comparable <paci> {
    private String name;
    private String sint;
    private String pri;


    public String getName()) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        public  String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

    public String getSint() {
        return sint;
    }

    public void setSint(String sint) {
        this.sintoma = sint;
    }



    
    @Override
    public  int compareTo(paci o) {
        return this.prioridad.compareTo(o.pri);
        
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + name + ", sintoma=" + sint + ", prioridad=" + pri + '}';
    }
    
}

{
	public static void main(String[] args) {
		
	}
}