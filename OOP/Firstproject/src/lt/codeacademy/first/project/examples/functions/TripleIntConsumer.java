package lt.codeacademy.first.project.examples.functions;

@FunctionalInterface
public interface TripleIntConsumer {
    void triple(int a, int b, int c);
}