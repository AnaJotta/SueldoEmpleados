
public abstract class Empleados {
    protected double sueldoBase;

    public Empleados(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldo();
}

class Repositor extends Empleados {
    public Repositor() {
        super(15890);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.10;
    }
}
class Cajero extends Empleados {
    public Cajero() {
        super(25630.89);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}

class Supervisor extends Empleados {
    public Supervisor() {
        super(35560.20);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 0.89;
    }
}
