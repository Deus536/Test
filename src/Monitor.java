public class Monitor {
    private final double weight;
    private final MonitorType type;
    private final double diagonal;

    public Monitor(double weight, MonitorType type, double diagonal) {
        this.weight = weight;
        this.type = type;
        this.diagonal = diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public MonitorType getType() {
        return type;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
