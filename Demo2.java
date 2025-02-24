class PatternProgram {
    int x=10;
    
    void inMethod() {
        int x = 15654;
    
        System.out.println(this.x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        PatternProgram p = new PatternProgram();
        p.inMethod();
    }
}
