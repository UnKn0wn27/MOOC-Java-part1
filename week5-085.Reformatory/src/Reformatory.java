public class Reformatory {
    private int weight_measured = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.weight_measured++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }
    
    public int totalWeightsMeasured(){
        return this.weight_measured;
    }

}
