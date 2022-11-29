package lt.codeacademy.first.project.examples.tasks.third;

class Figure {
    private final String name;
    private final double width;
    private final double height;

    public Figure(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
// taip geriausia atspausdinti objekto informacija
    @Override
    public String toString() {
        return "Name: " + name  +  " width: " + width +  " height: " + height;
    }
}
