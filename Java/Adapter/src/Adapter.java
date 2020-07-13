public class Adapter implements Chef {
    private Baker baker;
    
    public Adapter(Baker Baker) {
        this.baker = baker;
    }

    public void cook() {
        baker.bake();
    }
}