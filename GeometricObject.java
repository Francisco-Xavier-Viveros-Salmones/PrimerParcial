public class GeometricObject {
    private String color = "blanco";
    private boolean relleno = false;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isRelleno() { return relleno; }
    public void setRelleno(boolean relleno) { this.relleno = relleno; }
}