class VolumeCalculator {

    // Method for Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method for Rectangular Cube (Cuboid)
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method for Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

class Practical21 {
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        // Cube
        double cubeVolume = vc.calculateVolume(3);
        System.out.println("Volume of Cube = " + cubeVolume);

        // Rectangular Cube
        double cuboidVolume = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube = " + cuboidVolume);

        // Sphere
        double sphereVolume = vc.calculateVolume(2.5f);
        System.out.println("Volume of Sphere = " + sphereVolume);
    }
}