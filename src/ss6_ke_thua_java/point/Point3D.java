package ss6_ke_thua_java.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        setZ(z);
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" + super.toString()+
                "z=" + z +
                '}';
    }
}
