class Equations {
    private double a, b, c, d, e, f; // coefficients

    public Equations(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    public void solveEquations(double a, double b, double c, double d, double e, double f) {
        double det = ((a) * (d) - (b) * (c)); //determinant from the matrix
        double x = ((d) * (e) - (b) * (f)) / det; //
        double y = ((a) * (f) - (c) * (e)) / det; //these 2 were formulas that I used at algebra in first year
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }


    public static void main(String[] args) {
        Equations eq = new Equations(1, 1, 1, -1, 20, 8);
        eq.solveEquations(eq.a, eq.b, eq.c, eq.d, eq.e, eq.f);


    }
}
