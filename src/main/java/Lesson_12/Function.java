package Lesson_12;

public class Function {
    public float calculateAreaTriangle(int a, int b,   int c) {

        float p = (a + b + c) / 2.f;
        float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Square:" + s);

        return s;
    }
}
