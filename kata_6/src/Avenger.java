public class Avenger {
    private String nombre;
    private String alias;
    private String poder;
    private String armaPrincipal;
    private String universo;

    private Avenger(Builder builder) {
        this.nombre = builder.nombre;
        this.alias = builder.alias;
        this.poder = builder.poder;
        this.armaPrincipal = builder.armaPrincipal;
        this.universo = builder.universo;
    }

    public static class Builder {
        private String nombre;
        private String alias;
        private String poder;
        private String armaPrincipal;
        private String universo;

        public Builder(String nombre, String alias) {
            this.nombre = nombre;
            this.alias = alias;
        }

        public Builder poder(String poder) {
            this.poder = poder;
            return this;
        }

        public Builder armaPrincipal(String armaPrincipal) {
            this.armaPrincipal = armaPrincipal;
            return this;
        }

        public Builder universo(String universo) {
            this.universo = universo;
            return this;
        }

        public Avenger build() {
            return new Avenger(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    // Getters
}

