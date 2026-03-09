class VolumeCalculator {

    // Volume of Cube
    void calculateVolume(int side) {
        int volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    // Volume of Rectangular Cube (Cuboid)
    void calculateVolume(int length, int width, int height) {
        int volume = length * width * height;
        System.out.println("Volume of Rectangular Cube: " + volume);
    }

    // Volume of Sphere
    void calculateVolume(double radius) {
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
    }

    public static void main(String[] args) {
       System.out.println("240390107011");

        VolumeCalculator v = new VolumeCalculator();

        // Cube
        v.calculateVolume(4);

        // Rectangular Cube
        v.calculateVolume(5, 3, 2);

        // Sphere
        v.calculateVolume(3.5);
    }
}